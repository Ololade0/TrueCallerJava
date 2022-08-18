import africa.semicolon.trueCaller.data.repositories.UserRepositoryImpl;
import africa.semicolon.trueCaller.data.repositories.UserRespository;
import africa.semicolon.trueCaller.data.repositories.models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class UserRepositoryImplTest {
    UserRespository userRepo;
    User user;
    User user1;

    @BeforeEach
    void setUp() {
        userRepo = new UserRepositoryImpl();
        user = new User();
        user1 = new User();

        user.setFullName("Ade Yinka");
        user.setUserName("yinkus");
        user.setPassword("yinkx222");
        user.setEmail("ade@adeyinka.com");

        user1.setFullName("Nonso Chukwu");
        user1.setUserName("chuks");
        user1.setPassword("chukky108");
        user1.setEmail("nonso@nonsochukwu.com");
    }

    @Test
    public void userCanBeSavedTest() {
        userRepo.save(user);
        assertEquals(1, userRepo.count());
    }

    @Test
    public void userCanBeRetrievedTest() {
        userRepo.save(user);
        userRepo.save(user1);
        assertEquals(2, userRepo.count());

        User savedUser = userRepo.findById(2);
        assertEquals("chuks", savedUser.getUserName());
    }

    @Test
    public void userCanBeDeletedTest() {
        userRepo.save(user);
        userRepo.save(user1);
        assertEquals(2, userRepo.count());

        // userRepo.delete(user1);
        User savedUser = userRepo.findById(1);
        assertNull(savedUser);

        assertEquals(1, userRepo.count());
    }

    @Test
    public void userCanBeDeletedByIdTest() {
        userRepo.save(user);
        userRepo.save(user1);
        assertEquals(2, userRepo.count());

        userRepo.delete(2);
        User savedUser = userRepo.findById(2);
        assertNull(savedUser);

        assertEquals(1, userRepo.count());
    }

    @Test
    public void userCanBeUpdatedTest() {
        userRepo.save(user);
        assertEquals(1, userRepo.count());

        User savedUser = userRepo.findById(1);
        assertEquals("yinkus", savedUser.getUserName());

        user.setFullName("Tony Umez");
        user.setUserName("tonytitoe");
        user.setPassword("sumtin054");
        user.setEmail("tony@umez.com");

        userRepo.save(user);
        assertEquals(1, userRepo.count());
        User savedUser2 = userRepo.findById(1);
        assertEquals("tonytitoe", savedUser2.getUserName());
        assertEquals(2, userRepo.count());

       // userRepo.save(user1);

    }
}

