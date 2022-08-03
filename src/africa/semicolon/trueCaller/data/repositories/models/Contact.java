package africa.semicolon.trueCaller.data.repositories.models;

import lombok.Data;

@Data
public class Contact {
    private int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

    public String toString(){
        return String.format("""
                Firstname : %s
                Lastname : %s
                Phone number: %s
                Email : %s
                """, getFirstName(), getLastName(), getPhoneNumber(), getEmail());
    }


}


