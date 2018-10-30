package project.repository;

import project.model.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserInfo {
    List<User> users;

    public UserInfo() {
        users = new ArrayList<>();
        users.add(new User(1, "jnan", "v", "984746363", new Date(), new Date()));
        users.add(new User(2, "samarth", "singh", "984742323", new Date(), new Date()));
        users.add(new User(3, "ankit", "dudeja", "984744893", new Date(), new Date()));
    }

    public User createUser(int id, String firstName, String lastName, String phoneNumber) {
        User newUser = new User(id, firstName, lastName, phoneNumber, new Date(), new Date());
        users.add(newUser);
        return newUser;
    }

    public User updateUserProfile(int id, String firstName, String lastName, String phoneNumber) {
        int userIndex = -1;
        for (User user : users) {
            if (user.getId() == id) {
                userIndex = users.indexOf(user);
                user.setFirstName(firstName);
                user.setLastName(lastName);
                user.setPhoneNumber(phoneNumber);
                return users.set(userIndex, user);
            }
        }
        return null;
    }

    public boolean deleteUser(int id) {
        int userIndex = -1;
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
    }

    public User getUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public List<User> getAllUsers() {
        return users;
    }

}
