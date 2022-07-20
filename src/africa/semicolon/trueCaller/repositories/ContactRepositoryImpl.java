package africa.semicolon.trueCaller.repositories;

import africa.semicolon.trueCaller.models.Contact;
//import jdk.internal.icu.text.UnicodeSet;

import java.util.ArrayList;
import java.util.List;

public class ContactRepositoryImpl implements ContactRespository {
    private int count;
    private List<Contact> contacts = new ArrayList<>();

    @Override
    public Contact save(Contact contact) {
        for (Contact boyo : contacts){
            if (boyo.getId() == contact.getId()){
                return boyo;
            }
        }
        count++;
        contact.setId(count);
        contacts.add(contact);
        return contact;
    }




    @Override
    public void delete(int id) {
        contacts.remove(id-1);
    }



    @Override
    public Contact findById(int id) {
        for (var contact : contacts){
            if(contact.getId() == id){
                return contact;
            }
        }
        return null;
    }

    @Override
    public List<Contact> findAll() {
        return contacts;
    }

    @Override
    public int count() {
        return contacts.size();
    }

    @Override
    public void deleteContact(Contact contact1) {
        contacts.remove(contact1);
    }


}


