package app.web.dto;

import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class LoginRequest {

    @Size(min = 6, message = "username must be at least 6 symbols")
    private String username;
    @Size(min = 6,message = "password must be at least 6 symbols")
    private String password;
}
