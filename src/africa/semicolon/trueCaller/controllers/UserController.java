package africa.semicolon.trueCaller.controllers;
import africa.semicolon.trueCaller.dtos.request.AddContactRequest;
import africa.semicolon.trueCaller.dtos.request.RegisterRequest;
import africa.semicolon.trueCaller.dtos.responses.AddContactResponse;
import africa.semicolon.trueCaller.dtos.responses.AllContactResponse;
import africa.semicolon.trueCaller.dtos.responses.RegisterUserResponse;
import africa.semicolon.trueCaller.exception.UserExistsException;
import africa.semicolon.trueCaller.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class UserController {

    private final UserService userService = new UserService();
@PostMapping("/user")
    public ResponseEntity<?> registerUser(@RequestBody RegisterRequest registerRequest) {
    try {
        RegisterUserResponse serviceResponse = userService.register(registerRequest);
        return new ResponseEntity<>(serviceResponse, HttpStatus.CREATED);
    }catch (UserExistsException e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);

    }
}
@PatchMapping("/user")
    public AddContactResponse addContact(@RequestBody AddContactRequest addContactRequest){
        return userService.addContact(addContactRequest);
    }
    @GetMapping("/user/{email}")
    //find all contact belonging to all email address
    public List<AllContactResponse> FindContactBelongingTo(@PathVariable("email") String email){
        return userService.findContactBelongingTo(email);
    }


}

