package project.services;

import project.model.User;
import project.model.UserAuthentication;

import java.util.List;
import java.util.Optional;

public interface ManageUserService {
    Optional<User> createUser(String firstName, String lastName, String phoneNumber, String email, String password);

    boolean updateUserProfile(int id, String firstName, String lastName, String phoneNumber);

    boolean deleteUser(int id);

    User getUserById(int id);

    UserAuthentication getUserByEmail(String email);

    List<User> getAllUsers();
}
