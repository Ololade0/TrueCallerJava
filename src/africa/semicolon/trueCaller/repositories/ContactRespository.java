package africa.semicolon.trueCaller.repositories;

import africa.semicolon.trueCaller.models.Contact;

import java.util.List;

public interface ContactRespository {
    Contact save(Contact contact);
    void deleteContact(Contact contact1);

    void delete(int id);
    Contact findById(int id);
    List<Contact> findAll();
    int count();




}
