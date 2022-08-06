package africa.semicolon.trueCaller.data.repositories;

import africa.semicolon.trueCaller.data.repositories.models.Contact;
import africa.semicolon.trueCaller.data.repositories.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRespository extends MongoRepository<User, String> {
    User findUserByEmailAddress(String emailAddress);
}