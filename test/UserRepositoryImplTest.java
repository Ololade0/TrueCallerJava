
import africa.semicolon.trueCaller.data.repositories.models.User;
//import africa.semicolon.trueCaller.data.repositories.UserRepositoryImpl;
import africa.semicolon.trueCaller.data.repositories.UserRespository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryImplTest {
//    User user;
//    User user2;
//    UserRespository userRespository;
//
//    @BeforeEach
//    void setUp(){
//
//         user = new User();
//         user2 = new User();
//         userRespository = new UserRepositoryImpl();
//    }
//
//    @Test
//    void testThatUserCanBeCreated() {
//        User user = new User();
//        User user1 = new User();
//        user.setFirstName("Ololade");
//        user.setLastName("Demilade");
//        user.setEmailAddress("Olyn@");
//        user1.setFirstName("Ola");
//        user1.setLastName("Dems");
//        user1.setEmailAddress("Dems@");
//        assertEquals("Ololade", user.getFirstName());
//        assertEquals("Ola", user1.getFirstName());
//
//    }
//
//    @Test
//    void testThatUserCanAddContact() {
//        user.setFirstName("Ololade");
//        userRespository.save(user);
//        assertEquals(1, userRespository.count());
//
//    }
//
//
//    @Test
//    void testThatUserCanDeleteByContact() {
//        user.setFirstName("Ololade");
//        userRespository.save(user);
//        userRespository.deleteContact(user);
//        assertEquals(0, userRespository.count());
//    }
//
//    @Test
//    void testThatUserCanDeleteContactById() {
//        user.setFirstName("Ololade");
//        user.setLastName("Demilade");
//        user.setEmailAddress("Olyn@");
//
//        user2.setFirstName("asake");
//        user2.setLastName("lol");
//        user2.setEmailAddress("Olyn@asake");
//
//        userRespository.save(user);
//        userRespository.save(user2);
//        userRespository.deleteId(user.getId());
//        assertEquals(1, userRespository.count());
//    }
//    @Test
//    void testThatUserCanGetAllContact() {
//        user.setFirstName("Ololade");
//        userRespository.save(user);
//        assertNotNull(userRespository.findAll());
//
//    }
//
//    @Test
//    void updateContact() {
//        UserRespository userRespository = new UserRepositoryImpl();
//        User user = new User();
//        User user1 = new User();
//        user.setLastName("Tosin");
//        user.setFirstName("Ololade");
//        userRespository.save(user);
//
//        user.setLastName("Jummy");
//        user.setFirstName("Ola");
//        assertEquals("Jummy", userRespository.getContact(0).getLastName());
//
//    }
//
//
    }

