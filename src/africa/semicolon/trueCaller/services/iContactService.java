package africa.semicolon.trueCaller.services;

import africa.semicolon.trueCaller.data.repositories.models.Contact;



public interface iContactService {
    Contact addNewContact(Contact contact);

    long totalContacts();
}
