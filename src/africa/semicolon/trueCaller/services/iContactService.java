package africa.semicolon.trueCaller.services;

import africa.semicolon.trueCaller.data.repositories.models.Contact;
import org.springframework.stereotype.Service;


public interface iContactService {
    Contact addNewContact(Contact contact);
}
