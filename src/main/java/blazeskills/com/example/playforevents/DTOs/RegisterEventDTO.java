package blazeskills.com.example.playforevents.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class RegisterEventDTO {

    private long eventId;
    private long userId;
    private UserRequestDTO userRequestD;

}
