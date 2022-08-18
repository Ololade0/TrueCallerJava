package africa.semicolon.trueCaller.data.repositories;

import africa.semicolon.trueCaller.data.repositories.models.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ContactRespository  {

    long count();

    Contact save(Contact contact);
}
