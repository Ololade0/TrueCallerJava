
import africa.semicolon.trueCaller.models.User;
import africa.semicolon.trueCaller.repositories.UserRepositoryImpl;
import africa.semicolon.trueCaller.repositories.UserRespository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryImplTest {
    User user;
    UserRespository userRespository;

    @BeforeEach
    void setUp(){

         user = new User();
         userRespository = new UserRepositoryImpl();
    }

    @Test
    void testThatUserCanbeBeCreated() {
        User user = new User();
        User user1 = new User();
        user.setFirstName("Ololade");
        user.setLastName("Demilade");
        user.setEmailAddress("Olyn@");
        user1.setFirstName("Ola");
        user1.setLastName("Dems");
        user1.setEmailAddress("Dems@");
        assertEquals("Ololade", user.getFirstName());
    }

    @Test
    void testThatUserCanAddContact() {
        user.setFirstName("Ololade");
        userRespository.save(user);
        assertEquals(1, userRespository.count());

    }


    @Test
    void testThatUserCanDeleteByContact() {
        user.setFirstName("Ololade");
        userRespository.save(user);
        userRespository.deleteContact(user);
        assertEquals(0, userRespository.count());
    }

    @Test
    void testThatUserCanDeleteContactById() {
        user.setLastName("Tosin");
        user.setId(1);
        user.setId(2);
        userRespository.save(user);
        userRespository.deleteId(2);
        assertEquals(1, userRespository.count());
    }

    @Test
    void testThatUserCanGetAllContact() {
        user.setFirstName("Ololade");
        userRespository.save(user);
        assertNotNull(userRespository.findAll());

    }

    @Test
    void updateContact() {
        UserRespository userRespository = new UserRepositoryImpl();
        User user = new User();
        User user1 = new User();
        user.setLastName("Tosin");
        user.setFirstName("Ololade");
        userRespository.save(user);

        user.setLastName("Jummy");
        user.setFirstName("Ola");
        assertEquals("Jummy", userRespository.getContact(0).getLastName());

    }
    }








