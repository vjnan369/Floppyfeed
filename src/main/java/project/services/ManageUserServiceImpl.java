package project.services;

import project.model.User;
import project.repository.UserInfo;

import java.util.List;

public class ManageUserServiceImpl implements ManageUserService {
    private UserInfo userInfo = new UserInfo();

    public User getUserById(int id) {
        return userInfo.getUserById(id);
    }

    public User createUser(int id, String firstName, String lastName, String phoneNumber) {
        return userInfo.createUser(id, firstName, lastName, phoneNumber);
    }

    public User updateUserProfile(int id, String firstName, String lastName, String phoneNumber) {
        return userInfo.updateUserProfile(id, firstName, lastName, phoneNumber);
    }

    public boolean deleteUser(int id) {
        return userInfo.deleteUser(id);
    }

    public List<User> getAllUsers() {
        return userInfo.getAllUsers();
    }
}
