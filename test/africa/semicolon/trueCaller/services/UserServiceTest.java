package africa.semicolon.trueCaller.services;
//import africa.semicolon.trueCaller.data.repositories.ContactRepositoryImpl;
//import africa.semicolon.trueCaller.data.repositories.UserRepositoryImpl;
import africa.semicolon.trueCaller.data.repositories.UserRespository;
import africa.semicolon.trueCaller.data.repositories.models.Contact;
import africa.semicolon.trueCaller.data.repositories.models.User;
import africa.semicolon.trueCaller.dtos.request.AddContactRequest;
import africa.semicolon.trueCaller.dtos.request.RegisterRequest;
import africa.semicolon.trueCaller.exception.UserExistsException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class UserServiceTest {
//    private UserService userService;
//////    private iContactService contactService;
//////    private ContactRepositoryImpl contactRepository;
//
//    @BeforeEach
//    void setUp() {
//        UserRespository userRepository = new UserRepositoryImpl();
//        //contactService = new ContactServicesImpl();
//        contactRepository = new ContactRepositoryImpl();
//        contactService = new ContactServicesImpl();
//        userService = new UserService(userRepository, contactService);
//    }
//
//    @Test
//    void registerTest() {
//        RegisterRequest request = new RegisterRequest();
//        request.setHomeAddress("sabo");
//        request.setEmailAddress("ola@gamil.com");
//        request.setFirstName("Ololade");
//        request.setPhoneNumber("08109093828");
//        userService.register(request);
//        assertEquals(1, userService.size());
//
//    }
//
//    @Test
//    void duplicateUserEmailThrowsExceptionTest() {
//        RegisterRequest request = new RegisterRequest();
//        request.setHomeAddress("sabo yaba");
//        request.setEmailAddress("ola@gamil.com");
//        request.setFirstName("Ololade tosin");
//        request.setPhoneNumber("08109093828");
//        userService.register(request);
//        assertThrows(UserExistsException.class, () -> userService.register(request));
//        assertEquals(1, userService.size());
//    }
//
//    @Test
//    void addContactTest() {
//        RegisterRequest request = new RegisterRequest();
//        request.setHomeAddress("sabo yaba");
//        request.setEmailAddress("ola@gamil.com");
//        request.setFirstName("Ololade");
//        request.setPhoneNumber("08109093828");
//        userService.register(request);
//
//        AddContactRequest addContactRequest = new AddContactRequest();
//        addContactRequest.setFirstName("ola");
//        addContactRequest.setUserEmail(request.getEmailAddress());
//        addContactRequest.setLastName("Demilade");
//        addContactRequest.setEmail("ololade@gmail.com");
//        addContactRequest.setPhoneNumber("08109093828");
//        userService.addContact(addContactRequest);
//        assertEquals(1, userService.findContactBelongingTo("ola@gamil.com").size());
//    }
//
//    @Test
//    void addNewContactToRepo() {
//        AddContactRequest addContactRequest = new AddContactRequest();
//        addContactRequest.setFirstName("Ololade");
//        addContactRequest.setLastName("Tosin");
//        addContactRequest.setEmail("ola@gmail.com");
//        addContactRequest.setPhoneNumber("08109093828");
//        Contact contact = new Contact();
//        contact.setFirstName(addContactRequest.getFirstName());
//        contact.setEmail(addContactRequest.getEmail());
//        contact.setLastName(addContactRequest.getLastName());
//        contact.setPhoneNumber(addContactRequest.getPhoneNumber());
//        var savedContact = contactService.addNewContact(contact);
//        assertEquals(1, savedContact.getId());
//        assertEquals(1, contactService.size());
//    }
//
//    @Test
//    void testThatUserCanDeleteContactById() {
//        RegisterRequest request = new RegisterRequest();
//        request.setHomeAddress("sabo yaba");
//        request.setEmailAddress("ola@gmail.com");
//        request.setFirstName("Ololade");
//        request.setPhoneNumber("08109093828");
//        userService.register(request);
//
//        AddContactRequest addContactRequest = new AddContactRequest();
//        addContactRequest.setFirstName("Ololade");
//        addContactRequest.setUserEmail(request.getEmailAddress());
//        addContactRequest.setLastName("Oneh");
//        addContactRequest.setEmail("ololade@gmail.com");
//        addContactRequest.setPhoneNumber("09090");
//        userService.addContact(addContactRequest);
//
//        assertEquals(1, userService.findContactBelongingTo("ola@gmail.com").size());
//
//        User user = userService.getUserByEmail("ola@gmail.com");
//        Contact contact = userService.findAContact(user, "ololade@gmail.com");
//
//        userService.deleteContact(user,contact);
//
//        assertEquals(0, userService.findContactBelongingTo("ola@gmail.com").size());
//    }
//
//    @Test
//    void testThatUserCanUpdateContact() {
//        RegisterRequest request = new RegisterRequest();
//        request.setHomeAddress("sabo yaba");
//        request.setEmailAddress("ola@gmail.com");
//        request.setFirstName("Ololade");
//        request.setPhoneNumber("08109093828");
//        userService.register(request);
//
//        AddContactRequest addContactRequest = new AddContactRequest();
//        addContactRequest.setFirstName("Ololade");
//        addContactRequest.setUserEmail(request.getEmailAddress());
//        addContactRequest.setLastName("Tee");
//        addContactRequest.setEmail("ololade@gmail.com");
//        addContactRequest.setPhoneNumber("09090");
//        userService.addContact(addContactRequest);
//        assertEquals(1, userService.findContactBelongingTo("ola@gmail.com").size());
//
//        User user = userService.getUserByEmail("ola@gmail.com");
//        Contact contact = userService.findAContact(user, "ololade@gmail.com");
//        contact.setPhoneNumber("0909");
//        userService.editContact(user,contact);
//        request.editContact("0909");
//        assertEquals(1, userService.findContactBelongingTo("ola@gmail.com").size());
//
//
//
//    }
//    }
