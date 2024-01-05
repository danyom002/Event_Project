package blazeskills.com.example.playforevents.DTOs;

import blazeskills.com.example.playforevents.Configs.UserType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString

public class UserRequestDTO {
    private String fullName;
    private String email;
    private String address;
    private UserType userType;
    private String phone;

}
