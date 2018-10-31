package project.services;

import project.model.User;

import java.util.List;

public interface ManageUserService {
    User createUser(String firstName, String lastName, String phoneNumber);
    User updateUserProfile(int id, String firstName, String lastName, String phoneNumber);
    boolean deleteUser(int id);
    User getUserById(int id);
    List<User> getAllUsers();
}
