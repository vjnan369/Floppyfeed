package project.services;

import project.model.User;
import project.repository.UserInfo;
import project.repository.UserRepository;

import java.util.List;
import java.util.Optional;

public class ManageUserServiceImpl implements ManageUserService {
//    private UserInfo userInfo = new UserInfo();
    private UserRepository userRepository = new UserRepository();
    private
    // returns user details for given userid
    public Optional<User> getUserById(int id) {
        return userInfo.getUserById(id);
    }

    // returns user details if user added successfully.
    public Optional<User> createUser(String firstName, String lastName, String phoneNumber) {
        return userInfo.createUser(firstName, lastName, phoneNumber);
    }

    // returns true if user profile is updated successfully
    public boolean updateUserProfile(int id, String firstName, String lastName, String phoneNumber) {
        return userInfo.updateUserProfile(id, firstName, lastName, phoneNumber);
    }

    // returns true if user deleted successfully
    public boolean deleteUser(int id) {
        return userInfo.deleteUser(id);
    }

    // returns list of all users
    public List<User> getAllUsers() {
        return userInfo.getAllUsers();
    }
}
