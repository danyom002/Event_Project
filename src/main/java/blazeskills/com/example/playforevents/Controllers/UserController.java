package blazeskills.com.example.practiseprojectforevent.Controllers;


import blazeskills.com.example.practiseprojectforevent.dtos.UserRequestDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/users")
@Slf4j
public class UserController {
    //User
    @PostMapping
    public void createUserAccount(UserRequestDTO userRequest){
        log.info("Received request to create user account");
    }

}
