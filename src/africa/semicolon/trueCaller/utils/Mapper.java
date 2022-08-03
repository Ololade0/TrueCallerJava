package africa.semicolon.trueCaller.utils;
import africa.semicolon.trueCaller.data.repositories.models.Contact;
import africa.semicolon.trueCaller.data.repositories.models.User;
import africa.semicolon.trueCaller.dtos.request.AddContactRequest;
import africa.semicolon.trueCaller.dtos.request.RegisterRequest;
import africa.semicolon.trueCaller.dtos.responses.AllContactResponse;

public class Mapper {
        public static void map(RegisterRequest request, User user){
            user.setFirstName(request.getFirstName());
            user.setEmailAddress(request.getEmailAddress());
            user.setPhoneNumber(request.getPhoneNumber());
            user.setHomeAddress(request.getHomeAddress());
        }

        public static void map(AddContactRequest request, Contact contact){
            contact.setLastName(request.getLastName());
            contact.setEmail(request.getEmail());
            contact.setPhoneNumber(request.getPhoneNumber());
            contact.setFirstName(request.getFirstName());
        }


    public static void map(Contact contact, AllContactResponse singleResponse) {
            singleResponse.setId(contact.getId()+ "");
            singleResponse.setLastName(contact.getLastName());
            singleResponse.setFirstName(contact.getFirstName());
            contact.setPhoneNumber(contact.getPhoneNumber());

    }
}

