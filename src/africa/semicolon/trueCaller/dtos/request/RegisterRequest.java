package africa.semicolon.trueCaller.dtos.request;

import lombok.Data;

@Data
public class RegisterRequest {
    private String password;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
    private String homeAddress;


    public void editContact(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
