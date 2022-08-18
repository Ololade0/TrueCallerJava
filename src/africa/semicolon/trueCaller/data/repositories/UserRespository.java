package africa.semicolon.trueCaller.data.repositories;

import africa.semicolon.trueCaller.data.repositories.models.Contact;
import africa.semicolon.trueCaller.data.repositories.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRespository  {
    User findByEmail(String email);

    User save(User user);

    long count();

    User findById(int id);


    void delete(int id);
}