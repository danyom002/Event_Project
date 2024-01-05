package blazeskills.com.example.playforevents.Controllers;


import blazeskills.com.example.playforevents.DTOs.ApiResponse;
import blazeskills.com.example.playforevents.DTOs.EventsDTO;
import blazeskills.com.example.playforevents.DTOs.RegisterEventDTO;
import blazeskills.com.example.playforevents.Entities.Events;
import blazeskills.com.example.playforevents.Repository.EventRepository;
import ch.qos.logback.core.joran.util.beans.BeanUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/events")
@Slf4j
@RequiredArgsConstructor
public class EventController {

    final EventRepository eventRepository;
    // Organiser
    @PostMapping
    public ResponseEntity<ApiResponse> createNewEvent(@RequestBody EventsDTO events){
        log.info("Received request to create new events");
        Events events1 = new Events();
        events1.setEventCategory(events1.getEventCategory());
        BeanUtils.copyProperties(events,events1);
        log.info(events1.toString());
        eventRepository.save(events1);
        return new ResponseEntity<>(ApiResponse.builder().data(events1).build(), HttpStatus.CREATED);
    }
    // Organiser
    @GetMapping("by-organiser/{organiser}")
    public List<EventsDTO> getAllEventsByOrganiser(@PathVariable String organiser){
        log.info("Received request to get all events by the organiser");
        return new ArrayList<>();
    }
    // Organiser
    @PutMapping("{eventId}/{organiser}")
    public ApiResponse editEventByOrganiser(@PathVariable long eventId,
                                          @PathVariable String organiser,
                                          @RequestBody EventsDTO events){
        log.info("Received a request to edit an event by the organiser");
        return ApiResponse.builder().build();

    }
    // Organiser
    @DeleteMapping("{eventId}/{organiser}")
    public ApiResponse deleteEventByOrganiser(@PathVariable long eventId, @PathVariable String organiser){
        log.info("Received request to delete an event by the organiser");
        return ApiResponse.builder().build();
    }
    // Organiser
    @GetMapping("{id}/{organiser}")
    public ApiResponse getOrganiserEventDetails(@PathVariable  long id,@PathVariable String organiser){
        log.info("Received request to get event details by the organiser");
        List<Events> events = eventRepository.findAll();
        return ApiResponse.builder().data(events).build();
    }

    // User
    @GetMapping
    public ApiResponse getAllEvents(Pageable pageable, @RequestParam String organizer){ // print by page
        log.info("Received request to get all events");
        Page<Events> events;
        if (organizer != null){
           events = eventRepository.findAllByOrganizer(organizer,pageable);
        }
        else {
            events = eventRepository.findAll(pageable);
        }
            return ApiResponse.builder().data(events).build();
    }
    // User
    @GetMapping("{id}")
    public ResponseEntity<ApiResponse> getOneEventDetail(@PathVariable  long id){
        log.info("Received request to get one event id");
        Optional<Events> events;  //Optional means that it is possible that id does not exist on the list
        events = eventRepository.findById(id);
        if (events.isEmpty()){
            return new ResponseEntity<> (ApiResponse.builder().description("Record cannot be found").build(),HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<> (ApiResponse.builder().data(events).build(), HttpStatus.OK);
    }
    // User
    @PostMapping("{id}/register")
    public ApiResponse registerForEvents(@PathVariable long id, @RequestBody RegisterEventDTO registerEventDTO){
        log.info("Received request to register for an event");
        return ApiResponse.builder().build();
    }
}
