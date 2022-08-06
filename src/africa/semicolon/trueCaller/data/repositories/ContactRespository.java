package africa.semicolon.trueCaller.data.repositories;

import africa.semicolon.trueCaller.data.repositories.models.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ContactRespository extends MongoRepository<Contact, String> {

}
