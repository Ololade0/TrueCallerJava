package africa.semicolon.trueCaller.data.repositories.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
@Document("Users")
@Data
@NoArgsConstructor
public class User {
@Id
    private String id;
   private String fullName;
   private String userName;
   private String password;
   private String email;


    @DBRef
    private List<Contact> contacts = new ArrayList<>();


    public List<Contact> showAllContacts() {
        return contacts;
    }



}

