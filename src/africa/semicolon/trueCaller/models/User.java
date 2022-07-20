package africa.semicolon.trueCaller.models;

import africa.semicolon.trueCaller.repositories.ContactRepositoryImpl;
import africa.semicolon.trueCaller.repositories.ContactRespository;

import java.util.ArrayList;
import java.util.List;

public class User {
    //public int getId;
    private int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
    private String homeAddress;

    private ContactRespository myContact = new ContactRepositoryImpl();
    private List<Contact> contacts = new ArrayList<>();


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

