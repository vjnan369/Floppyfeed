package project.services;

import project.model.User;

import java.util.List;
import java.util.Optional;

public interface ManageUserService {
    Optional<User> createUser(String firstName, String lastName, String phoneNumber);

    boolean updateUserProfile(int id, String firstName, String lastName, String phoneNumber);

    boolean deleteUser(int id);

    Optional<User> getUserById(int id);

    List<User> getAllUsers();
}
