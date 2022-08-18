package africa.semicolon.trueCaller.data.repositories;

import africa.semicolon.trueCaller.data.repositories.models.Contact;

import java.util.ArrayList;

public class ContactRepositoryImpl implements ContactRespository {
    private ArrayList<Contact> contacts = new ArrayList<>();
    private int counter;

    @Override
    public long count() {
       return contacts.size();
    }

    @Override
    public Contact save(Contact contact) {
        for(Contact contact1: contacts) {
            if (contact1.getId() == contact.getId()) {
                contact1 = contact;
                return contact1;
            }
        }
        counter++;
        contact.setId(String.valueOf(counter));
        contacts.add(contact);
        return contact;
 }

//    @Override
//    public Contact save(Contact contact) {
//        return null;
    }

