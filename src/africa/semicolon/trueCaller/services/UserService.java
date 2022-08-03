package africa.semicolon.trueCaller.services;

import africa.semicolon.trueCaller.data.repositories.ContactRespository;
import africa.semicolon.trueCaller.data.repositories.UserRepositoryImpl;
import africa.semicolon.trueCaller.data.repositories.UserRespository;
import africa.semicolon.trueCaller.data.repositories.models.Contact;
import africa.semicolon.trueCaller.data.repositories.models.User;
import africa.semicolon.trueCaller.dtos.request.AddContactRequest;
import africa.semicolon.trueCaller.dtos.request.RegisterRequest;
import africa.semicolon.trueCaller.dtos.responses.AddContactResponse;
import africa.semicolon.trueCaller.dtos.responses.AllContactResponse;
import africa.semicolon.trueCaller.dtos.responses.RegisterUserResponse;
import africa.semicolon.trueCaller.exception.UserExistsException;
import africa.semicolon.trueCaller.utils.Mapper;

import java.util.ArrayList;
import java.util.List;

public class UserService implements iUserService {
    private final UserRespository userRespository;
    private iContactService contactService;

    private ContactRespository contactRespository;

    public UserService(UserRespository userRespository, iContactService contactService) {
        this.userRespository = userRespository;
        this.contactService = contactService;
        this.contactRespository = contactRespository;
    }

    public UserService() {
        userRespository = new UserRepositoryImpl();
        contactService = new ContactServicesImpl();
        contactRespository = null;
    }

    @Override
    public RegisterUserResponse register(RegisterRequest request) {
        isExist(request.getEmailAddress());
        User user = new User();
        Mapper.map(request, user);
        userRespository.save(user);
        RegisterUserResponse response = new RegisterUserResponse();
        response.setMessage(String.format(" %s Registration Successful", request.getEmailAddress()));
        return response  ;
    }

    private void isExist(String email) {
        User savedUser = userRespository.findByEmail(email);
        if (savedUser != null) throw new UserExistsException(email + "Already exist");
    }


    @Override
    public AddContactResponse addContact(AddContactRequest request) {
        // create a new contact
        // save it to repository
        // find user by email
        // add contact to user contact list
        // save user
        Contact contact = new Contact();
        Mapper.map(request, contact);

        Contact savedContact = contactService.addNewContact(contact);

        User user = userRespository.findByEmail(request.getUserEmail());

        user.getContacts().add(savedContact);
        userRespository.save(user);
        AddContactResponse response = new AddContactResponse();
        response.setMessage(String.format("%s successfully added", request.getFirstName()));
        return response;

    }

    @Override
    public int getNumberOfUsers() {
        return userRespository.count();
    }

    @Override
    public int size() {
        return userRespository.count();
    }

    @Override
    public List<AllContactResponse> findContactBelongingTo(String userEmail) {
        User user = userRespository.findByEmail(userEmail);
        List<Contact>allUserContact = user.getContacts();
        List<AllContactResponse> response = new ArrayList<>();
        for(var contact : allUserContact){
            AllContactResponse singleResponse = new AllContactResponse();
            Mapper.map(contact, singleResponse);

          response.add(singleResponse);
        }
        return response;
    }

    @Override
    public User getUserByEmail(String email) {
        return userRespository.findByEmail(email);
    }

    @Override
    public Contact findAContact(User user, String contactEmail) {
        for (Contact contact : user.getContacts()) {
            if (contact.getEmail().equals(contactEmail)) {
                return contact;
            }
        }
        return null;
    }

    @Override
    public void editContact(User user, Contact contact) {
        user.getContacts().set(0, contact);
        userRespository.save(user);
    }


    public void deleteContact(User user, Contact contact) {
        user.getContacts().remove(contact);
        userRespository.save(user);
    }
}