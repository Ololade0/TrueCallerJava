package africa.semicolon.trueCaller.services;

import africa.semicolon.trueCaller.dtos.request.RegisterRequest;
import africa.semicolon.trueCaller.dtos.responses.RegisterUserResponse;
import africa.semicolon.trueCaller.exception.UserExistsException;
import africa.semicolon.trueCaller.models.User;
import africa.semicolon.trueCaller.repositories.UserRepositoryImpl;
import africa.semicolon.trueCaller.repositories.UserRespository;

public class UserService implements iUserService {
    private final UserRespository userRespository = new UserRepositoryImpl();

    @Override
    public RegisterUserResponse register(RegisterRequest request) {
        //create a new user
        //copy field from request to new user
        //save new user into repository
        User user = new User();
        User savedUser = userRespository.findByEmailAddress(request.getEmailAddress());
        if(savedUser != null) throw new UserExistsException(request.getEmailAddress()+ "already exist");
        user.setEmailAddress(request.getEmailAddress());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());

        user.setPassword(request.getPassword());
        user.setPhoneNumber(request.getPhoneNumber());
        userRespository.save(user);
        return null;
    }
    @Override
    public int getNumberOfUsers() {

        return userRespository.count();
    }
}
