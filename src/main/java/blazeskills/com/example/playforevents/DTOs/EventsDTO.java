package blazeskills.com.example.playforevents.DTOs;

import lombok.*;

import java.time.LocalDateTime;
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString

public class EventsDTO {

    private Long id;
    private String title;
    private String description;
    private String organizer;
    private String eventType;
    private String eventLocation;
    private String eventCategory;
    private String eventDuration;
    private LocalDateTime eventDate;
    private LocalDateTime created_date;
    private LocalDateTime updated_date;

}
