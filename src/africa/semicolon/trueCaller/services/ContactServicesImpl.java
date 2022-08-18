package africa.semicolon.trueCaller.services;

import africa.semicolon.trueCaller.data.repositories.ContactRespository;
import africa.semicolon.trueCaller.data.repositories.models.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServicesImpl implements iContactService {
    @Autowired
    private ContactRespository contactRespository;

    public ContactServicesImpl(ContactRespository contactRespository){

        this.contactRespository = contactRespository;
    }

    @Override
    public Contact addNewContact(Contact contact) {

        return contactRespository.save(contact);
    }

    @Override
    public long totalContacts() {
        return contactRespository.count();
    }


}






