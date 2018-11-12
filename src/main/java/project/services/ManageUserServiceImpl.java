package project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.model.User;
import project.model.UserAuthentication;
import project.repository.UserAuthenticationRepository;
import project.repository.UserRepository;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ManageUserServiceImpl implements ManageUserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserAuthenticationRepository userAuthenticationRepository;

    //    private UserInfo userInfo = new UserInfo();
    // returns user details for given userid
    public User getUserById(int id) {
        return userRepository.findOne(id);
    }

    // returns user details if user added successfully.
    @Transactional
    public Optional<User> createUser(String firstName, String lastName, String phoneNumber, String email, String password) {
        Date createdAt = new Date();
        Date updatedAt = new Date();
        User newUser = new User(firstName, lastName, phoneNumber, createdAt, updatedAt);
        User savedUser = userRepository.save(newUser);
        int userId = savedUser.getId();
        UserAuthentication newUserAuthentication = new UserAuthentication(userId, email, password, null, null, createdAt, updatedAt);
        userAuthenticationRepository.save(newUserAuthentication);
        return Optional.of(newUser);
    }

    // returns true if user profile is updated successfully
    public boolean updateUserProfile(int id, String firstName, String lastName, String phoneNumber) {
        User user = userRepository.findOne(id);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setPhoneNumber(phoneNumber);
        userRepository.save(user);
        return true;
    }

    public UserAuthentication getUserByEmail(String email){
        return userAuthenticationRepository.findByEmail(email);
    }

    // returns true if user deleted successfully
    public boolean deleteUser(int id) {
        try {
            userRepository.delete(id);
            return true;
        } catch (NullPointerException e) {
            return false;
        }
    }

    // returns list of all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
