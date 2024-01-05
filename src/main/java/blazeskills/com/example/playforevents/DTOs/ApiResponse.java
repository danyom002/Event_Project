package blazeskills.com.example.playforevents.DTOs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class ApiResponse {
    @Builder.Default
    private boolean success = true;

    @Builder.Default
    private String description = "Operation Successful";


    @Builder.Default
    private LocalDateTime timestamp = LocalDateTime.now();

    private Object data;
    private String u = "UUIC";

}
