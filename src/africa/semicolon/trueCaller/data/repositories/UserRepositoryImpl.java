package africa.semicolon.trueCaller.data.repositories;

import africa.semicolon.trueCaller.data.repositories.models.User;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;


public class UserRepositoryImpl implements UserRespository {
        private ArrayList<User> users = new ArrayList<>();
        private int counter;


    @Override
    public User findByEmail(String email) {
            for(User foundUser: users) {
                if (foundUser.getEmail().equalsIgnoreCase(email)) {
                    return foundUser;
                }
            }
            return null;
        }

    @Override
    public User save(User user) {
            for(User foundUser: users) {
                if (foundUser.getId() == user.getId()) {
                    foundUser = user;
                    return foundUser;
                }
            }
            counter++;
            user.setId(String.valueOf(counter));
            users.add(user);
            return user;
        }

    @Override
    public long count() {
      return users.size();
    }

    @Override
    public User findById(int id) {
            for(User foundUser: users) {
                if (foundUser.getId() == id) {
                    return foundUser;
                }
            }
        return null;

    }

    @Override
    public void delete(int id) {
            User foundUser = findById(id);
            users.remove(foundUser);
        }




    }







