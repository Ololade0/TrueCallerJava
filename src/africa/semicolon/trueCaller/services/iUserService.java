package africa.semicolon.trueCaller.services;

import africa.semicolon.trueCaller.data.repositories.models.User;
import africa.semicolon.trueCaller.dtos.request.AddContactRequest;
import africa.semicolon.trueCaller.dtos.request.RegisterRequest;
import africa.semicolon.trueCaller.dtos.responses.AddContactResponse;
import africa.semicolon.trueCaller.dtos.responses.AllContactResponse;
import africa.semicolon.trueCaller.dtos.responses.RegisterUserResponse;
import africa.semicolon.trueCaller.data.repositories.models.Contact;

import java.util.List;

public interface  iUserService {

    RegisterUserResponse register(RegisterRequest registerRequest);

    AddContactResponse addContact(AddContactRequest request);
    public List<AllContactResponse> findContactBelongingTo(String userEmail);

    User getUserByEmail(String email);

    Contact findAContact(User user, String s);


    void editContact(User user, Contact contact);
}


