package africa.semicolon.trueCaller.repositories;

import africa.semicolon.trueCaller.models.Contact;
import africa.semicolon.trueCaller.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRespository { ;
        private int count ;
    private final List<User> myUsers = new ArrayList<>();
    private final ArrayList<Contact> myContacts = new ArrayList<>();

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
        for(User use : myUsers){
            if(use.getFirstName() == use.getFirstName()){
                return use;
            }
        }

       count++;
        user.setId(count);
        myUsers.add(user);
        return user;

    }

    @Override
    public void deleteId(int id) {
        for (int i = 0; i < myUsers.size() ; i++) {
            if(myUsers.get(i).getId()== id){
                myUsers.remove(id);
            }
        }
        count--;
    }


}









