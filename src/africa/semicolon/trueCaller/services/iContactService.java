package africa.semicolon.trueCaller.services;

import africa.semicolon.trueCaller.data.repositories.models.Contact;

public interface iContactService {
    Contact addNewContact(Contact contact);

    int size();

    Contact deleteNewContactById(Contact contact);
}
