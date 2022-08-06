package africa.semicolon.trueCaller;

import africa.semicolon.trueCaller.controllers.UserController;
import africa.semicolon.trueCaller.dtos.request.AddContactRequest;
import africa.semicolon.trueCaller.dtos.request.RegisterRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;
@SpringBootApplication
public class Main {

        private static final Scanner input = new Scanner(System.in);
        private static final UserController userController = new UserController();
        public static void main(String[] args) {
            SpringApplication.run(Main.class, args);
            displayMenu();
        }

        private static void displayMenu() {
            String mainMenuPrompt = """
                Welcome to MyCaller
                1 -> Create Account
                2 -> Add Contact
                3 -> Find contact belonging to user
                """;

            String userInput = input(mainMenuPrompt);
            switch (userInput.charAt(0)) {
                case '1' -> createAccount();
                case '2' -> AddContactToUser();
                case '3' -> findContactBelongingToUser();
            }
        }
        private static void findContactBelongingToUser() {
            var contacts = userController.FindContactBelongingTo(input("Enter your mail"));
            for (var contact: contacts){
                display(contact.toString());
            }
            displayMenu();
        }

        private static void AddContactToUser() {
            AddContactRequest request = new AddContactRequest();
            request.setFirstName(input("Enter first name"));
            request.setLastName(input("Enter last name"));
            request.setPhoneNumber(input("Enter phone number"));
            request.setEmail(input("Enter contact email"));
            request.setUserEmail(input("Enter your email"));
            userController.addContact(request);
            display("Contact added successfully");
            displayMenu();
        }

        private static void createAccount() {
            RegisterRequest request = new RegisterRequest();
            request.setFirstName(input("Enter your name"));
            request.setLastName(input("Enter last name"));
            request.setPhoneNumber(input("Enter phone"));
            request.setEmailAddress(input("Enter email"));
            request.setHomeAddress(input("Enter home Address"));
            request.setPassword(input("Enter password"));
            userController.registerUser(request);
            display("Done");
            displayMenu();
        }

        private static void display(String message) {
            System.out.println(message);
        }
        public static String input(String prompt){
            System.out.println(prompt);
            return input.nextLine();
        }
    }


