package africa.semicolon.trueCaller.data.repositories;

import africa.semicolon.trueCaller.data.repositories.models.Contact;

import java.util.List;

public interface ContactRespository {
    Contact save(Contact contact);
    void deleteContact(Contact contact1);

    Contact delete(int id);
    Contact findById(int id);
    List<Contact> findAll();
    int count();



}
