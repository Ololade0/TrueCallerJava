package africa.semicolon.trueCaller.services;

import africa.semicolon.trueCaller.data.repositories.ContactRepositoryImpl;
import africa.semicolon.trueCaller.data.repositories.ContactRespository;
import africa.semicolon.trueCaller.data.repositories.models.Contact;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactServicesImplTest {
    iContactService contactService;
   ContactRespository contactRepository;
    Contact contact;
    @BeforeEach
    void setUp() {
        contactRepository = new ContactRepositoryImpl();
        contactService = new ContactServicesImpl(contactRepository);
        contact = new Contact();

        contact.setEmail("newford@gmail.com");
        contact.setFirstName("New");
        contact.setLastName("Ford");
        contact.setPhoneNumber("08024533933");
    }

    @Test
    public void addContactTest() {
        contactService.addNewContact(contact);

        assertEquals(1, contactService.totalContacts());
    }

}

