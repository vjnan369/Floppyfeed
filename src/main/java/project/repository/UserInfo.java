package project.repository;

import project.model.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class UserInfo {
    List<User> users;
    int generateId = 0;

    public UserInfo() {
        users = new ArrayList<>();
        users.add(new User(1, "jnan", "v", "984746363", new Date(), new Date()));
        users.add(new User(2, "samarth", "singh", "984742323", new Date(), new Date()));
        users.add(new User(3, "ankit", "dudeja", "984744893", new Date(), new Date()));
    }

    public Optional<User> createUser(String firstName, String lastName, String phoneNumber) {
        User newUser = new User(++generateId, firstName, lastName, phoneNumber, new Date(), new Date());
        try {
            users.add(newUser);
            return Optional.of(newUser);
        } catch (NullPointerException e){
            return Optional.empty();
        }

    }

    public boolean updateUserProfile(int id, String firstName, String lastName, String phoneNumber) {
        int userIndex;
        try {
            for (User user : users) {
                if (user.getId() == id) {
                    userIndex = users.indexOf(user);
                    user.setFirstName(firstName);
                    user.setLastName(lastName);
                    user.setPhoneNumber(phoneNumber);
                    users.set(userIndex, user);
                    return true;
                }
            }
            return false;
        } catch (NullPointerException e){
            return false;
        }
    }

    public boolean deleteUser(int id) {
        int userIndex = -1;
        try {
            for (User user : users) {
                if (user.getId() == id) {
                    userIndex = users.indexOf(user);
                    break;
                }
            }
            if (userIndex > -1) {
                users.remove(userIndex);
                return true;
            }
            return false;
        } catch (NullPointerException e){
            return false;
        }
    }

    public Optional<User> getUserById(int id) {
        try {
            for (User user : users) {
                if (user.getId() == id) {
                    return Optional.of(user);
                }
            }
            return Optional.empty();
        } catch (NullPointerException e){
            return Optional.empty();
        }
    }

    public List<User> getAllUsers() {
        return users;
    }

}
