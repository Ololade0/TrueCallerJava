package africa.semicolon.trueCaller.data.repositories;

import africa.semicolon.trueCaller.data.repositories.models.Contact;
import africa.semicolon.trueCaller.data.repositories.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRespository {
    ;
    private final List<User> myUsers = new ArrayList<>();
    private final ArrayList<Contact> myContacts = new ArrayList<>();
    private int count;

    @Override
    public void addContact(Contact newContact) {
        myContacts.add(newContact);

    }

    @Override
    public int count() {
        return myUsers.size();
    }

    @Override
    public void deleteContact(User user1) {
        myUsers.remove(user1);
    }

    @Override
    public User getContact(int index) {
        return myUsers.get(index);
    }

    @Override
    public ArrayList<Contact> findAll() {
        return myContacts;
    }

    @Override
    public User add(Contact contact1) {
        return null;
    }


    @Override
    public User save(User user) {
        if (user.getId() > 0) {
            User foundUser = findByEmailAddress(user.getEmailAddress());
            myUsers.remove(foundUser);
            myUsers.add(user);
           // myUsers.add()
            //update
        } else {
            count++;
            user.setId(count);
            myUsers.add(user);
        }
        return user;
    }

    @Override
    public void deleteId(int id) {
                myUsers.removeIf(user -> user.getId()==id);
            }



    @Override
    public User findByEmailAddress(String emailAddress) {
        for (User user : myUsers) {
            if (emailAddress.equalsIgnoreCase(user.getEmailAddress())) {
                return user;

            }

        }
        return null;
    }

    @Override
    public User findByEmail(String userEmail) {
        for (User myUser : myUsers) {
            if (myUser.getEmailAddress().equalsIgnoreCase(userEmail)) {
                return myUser;
            }
        }
        return null;
    }


}









