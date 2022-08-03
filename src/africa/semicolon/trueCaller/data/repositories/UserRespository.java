package africa.semicolon.trueCaller.data.repositories;

import africa.semicolon.trueCaller.data.repositories.models.Contact;
import africa.semicolon.trueCaller.data.repositories.models.User;

import java.util.List;

public interface UserRespository {

    void addContact(Contact user);


    int count();
    void deleteContact(User user1);

    User getContact(int index);


    List findAll();


    User add(Contact contact1);

    User save(User user);

    void deleteId(int id);

     User findByEmailAddress(String emailAddress);

    User findByEmail(String userEmail);
}