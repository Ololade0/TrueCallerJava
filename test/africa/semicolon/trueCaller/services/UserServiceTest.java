package africa.semicolon.trueCaller.services;
import africa.semicolon.trueCaller.data.repositories.ContactRepositoryImpl;
import africa.semicolon.trueCaller.data.repositories.ContactRespository;
import africa.semicolon.trueCaller.data.repositories.UserRepositoryImpl;
import africa.semicolon.trueCaller.data.repositories.UserRespository;
import africa.semicolon.trueCaller.dtos.request.AddContactRequest;
import africa.semicolon.trueCaller.dtos.request.RegisterRequest;
import africa.semicolon.trueCaller.exception.UserExistsException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplTest {
    UserService userService;
    RegisterRequest request;
    AddContactRequest addRequest;
    ContactServicesImpl contactService;
    UserRespository userRepository;
    ContactRespository contactRepository;


    @BeforeEach
    void setUp() {
        contactRepository = new ContactRepositoryImpl();
        contactService = new ContactServicesImpl(contactRepository);
        userRepository = new UserRepositoryImpl();
        userService = new UserService(userRepository, contactService);
        addRequest = new AddContactRequest();

        request = new RegisterRequest();
        request.setEmail("ololade@gmail.com");
        request.setFullName("Adesuyi Ololade");
        request.setUserName("Ololade");
        request.setPassword("Ololade0909");
    }

    @Test
    public void registerTest() {
        userService.register(request);
        assertEquals(1, userService.totalUsers());
    }

    @Test
    public void duplicateRegistrationThrowsException() {
        userService.register(request);

        RegisterRequest request1 = new RegisterRequest();
        request1.setEmail("ololade@gmail.com");
        request1.setFullName("Adesuyi Ololade");
        request1.setUserName("Ololade");
        request1.setPassword("Ololade0909");

        assertThrows(UserExistsException.class, () -> userService.register(request1));
        assertEquals(1, userService.totalUsers());
    }

    @Test
    public void addContactTest() {
        userService.register(request);

        addRequest.setEmail("Ololade@gmail.com");
        addRequest.setFirstName("Ololade");
        addRequest.setLastName("Tosin");
        addRequest.setPhoneNumber("0810909383");
        addRequest.setUserEmail(request.getEmail());
        userService.addContact(addRequest);

        assertEquals(1, userService.findAllUserContacts("Ololade@gmail.com").size());
        assertEquals(1, contactService.totalContacts());
    }


}
