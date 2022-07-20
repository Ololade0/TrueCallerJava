import africa.semicolon.trueCaller.models.Contact;
import africa.semicolon.trueCaller.repositories.ContactRepositoryImpl;
import africa.semicolon.trueCaller.repositories.ContactRespository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactRepositoryImplTest {
    @Test
    void saveTest() {
        ContactRespository contactRespositories = new ContactRepositoryImpl();
        Contact contact = new Contact();
        contact.setLastName("Tosin");
        contact.setFirstName("Ololade");
        contact.setPhoneNumber("090");
        contact.setEmail("ola@");
        contactRespositories.save(contact);
        assertEquals(1, contactRespositories.count());
    }

    @Test
    void saveTest_findByIdTest() {
        ContactRespository contactRespositories = new ContactRepositoryImpl();
        Contact contact = new Contact();
        contact.setLastName("Tosin");
        contact.setFirstName("Ololade");
        contact.setPhoneNumber("090");
        contact.setEmail("ola@");
        contactRespositories.save(contact);
        assertEquals(1, contactRespositories.count());

        Contact savedContact = contactRespositories.findById(1);
        assertEquals("Ololade", savedContact.getFirstName());
    }

    @Test
    void testThatUserCanSave_DeleteByContact() {
        ContactRespository contactRespositories = new ContactRepositoryImpl();
        Contact contact = new Contact();
        Contact contact1 = new Contact();
        contact.setFirstName("Ololade");
        contact1.setFirstName("Ola");
        contactRespositories.save(contact);
        contactRespositories.save(contact1);
        contactRespositories.deleteContact(contact);
        assertEquals(1, contactRespositories.count());
    }


    @Test
    void saveTest_deleteByIdTest() {
        ContactRespository contactRespositories = new ContactRepositoryImpl();
        Contact contact = new Contact();
        contact.setLastName("Tosin");
        contact.setFirstName("Ololade");
        contact.setPhoneNumber("090");
        contact.setEmail("ola@");
        contactRespositories.save(contact);
        contactRespositories.delete(1);
        assertEquals(0, contactRespositories.count());

    }

    @Test
    void updateContact() {
        ContactRespository contactRespositories = new ContactRepositoryImpl();
        Contact contact = new Contact();
        Contact contact1 = new Contact();
        contact.setLastName("Tosin");
        contact.setFirstName("Ololade");
        contact.setPhoneNumber("090");
        contact.setEmail("ola@");
        contactRespositories.save(contact);

        contact.setLastName("Jummy");
        contact.setFirstName("Ashaks");
        contact.setPhoneNumber("080");
        contact.setEmail("ola@");
        contact.setId(1);
        contactRespositories.save(contact);
        assertEquals(1, contactRespositories.count());
    }

    @Test
    void saveTest_findAll() {
        ContactRespository contactRespositories = new ContactRepositoryImpl();
        Contact contact = new Contact();
        contact.setLastName("Tosin");
        contact.setFirstName("Ololade");
        contactRespositories.save(contact);
        contactRespositories.findAll();
        assertNotNull(contactRespositories.findAll());
    }


}