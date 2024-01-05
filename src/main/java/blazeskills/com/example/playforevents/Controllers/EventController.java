package blazeskills.com.example.practiseprojectforevent.Controllers;


import blazeskills.com.example.practiseprojectforevent.dtos.EventsDTO;
import blazeskills.com.example.practiseprojectforevent.dtos.RegisterEventDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/events")
@Slf4j
public class EventController {
    // Organiser
    @PostMapping
    public void createNewEvent(@RequestBody EventsDTO events){
        log.info("Received request to create new events");

    }
    // Organiser
    @GetMapping("by-organiser/{organiser}")
    public List<EventsDTO> getAllEventsByOrganiser(@PathVariable String organiser){
        log.info("Received request to get all events by the organiser");
        return new ArrayList<>();
    }
    // Organiser
    @PutMapping("{eventId}/{organiser}")
    public EventsDTO editEventByOrganiser(@PathVariable long eventId,
                                          @PathVariable String organiser,
                                          @RequestBody EventsDTO events){
        log.info("Received a request to edit an event by the organiser");
        return new EventsDTO();

    }
    // Organiser
    @DeleteMapping("{eventId}/{organiser}")
    public void deleteEventByOrganiser(@PathVariable long eventId, @PathVariable String organiser){
        log.info("Received request to delete an event by the organiser");
    }
    // Organiser
    @GetMapping("{id}/{organiser}")
    public EventsDTO getOrganiserEventDetails(@PathVariable  long id,@PathVariable String organiser){
        log.info("Received request to get event details by the organiser");
        return new EventsDTO();
    }

    // User
    @GetMapping
    public List<EventsDTO> getAllEvents(){
        log.info("Received request to get all events");
        return new ArrayList<>();
    }
    // User
    @GetMapping("{id}")
    public EventsDTO getOneEventDetail(@PathVariable  long id){
        log.info("Received request to get one event id");
        return new EventsDTO();
    }
    // User
    @PostMapping("{id}/register")
    public void registerForEvents(@PathVariable long id, @RequestBody RegisterEventDTO registerEventDTO){
        log.info("Received request to register for an event");
    }
}
