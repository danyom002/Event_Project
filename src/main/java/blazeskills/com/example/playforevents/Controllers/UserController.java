package blazeskills.com.example.playforevents.Controllers;

import blazeskills.com.example.playforevents.DTOs.ApiResponse;
import blazeskills.com.example.playforevents.DTOs.UserRequestDTO;
import blazeskills.com.example.playforevents.Entities.Events;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
@Slf4j
public class UserController {
    //User
    @PostMapping
    public ApiResponse createUserAccount(UserRequestDTO userRequest){
        log.info("Received request to create user account");

        return ApiResponse.builder().build();
    }

}
