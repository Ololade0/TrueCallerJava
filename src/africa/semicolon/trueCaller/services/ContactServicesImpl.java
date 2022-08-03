package africa.semicolon.trueCaller.services;

import africa.semicolon.trueCaller.data.repositories.ContactRepositoryImpl;
import africa.semicolon.trueCaller.data.repositories.ContactRespository;
import africa.semicolon.trueCaller.data.repositories.models.Contact;

public class ContactServicesImpl implements iContactService{
    ContactRespository contactRespository = new ContactRepositoryImpl();
    @Override
    public Contact addNewContact(Contact contact) {
        return contactRespository.save(contact);
    }

    @Override
    public int size() {
        return contactRespository.count();
    }

    @Override
    public Contact deleteNewContactById(Contact contact) {
        return contactRespository.delete(1);
    }



}
