package africa.semicolon.trueCaller.services;

import africa.semicolon.trueCaller.dtos.request.RegisterRequest;

import africa.semicolon.trueCaller.exception.UserExistsException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class UserServiceTest {
    private iUserService userService;

    @BeforeEach
    void setUp() {
        userService = new UserService() ;


   }
            @Test
            public void registerTest() {
                iUserService userService = new UserService();
                //given
                //there is a request form
                //when
                //then
                RegisterRequest request = new RegisterRequest();
                request.setEmailAddress("Ola@");
                request.setFirstName("Ololade");
                request.setLastName("Demilade");
                request.setPassword("101");
                request.setPhoneNumber("090");
                userService.register(request);
                assertEquals(1, userService.getNumberOfUsers());
            }

            @Test
            public void duplicatedEmailThroughException() {
                RegisterRequest request = new RegisterRequest();
                RegisterRequest request2 = new RegisterRequest();
                request.setEmailAddress("Ola@1");
                request.setFirstName("Ololade");
                request.setLastName("Demilade");
                request.setPassword("101");
                request.setPhoneNumber("090");
                userService.register(request);

                request2.setEmailAddress("Ola@1");
                request2.setFirstName("Ola");
                request2.setLastName("Demi");
                request2.setPassword("102");
                request2.setPhoneNumber("091");
                assertThrows(UserExistsException.class, () -> userService.register(request2));
                assertEquals(1, userService.getNumberOfUsers());

            }


    }
