package africa.semicolon.trueCaller.dtos.request;

import lombok.Data;

@Data
public class RegisterRequest {
    private String userName;
    private String fullName;
    private String email;
    private String password;


}
