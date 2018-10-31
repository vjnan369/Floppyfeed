package project.services;

import net.andreinc.mockneat.unit.user.Users;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import project.model.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ManageUserServiceImplTest {
    static int id;
    static String firstName;
    static String lastName;
    static String phoneNumber;
    static Date createdAt;
    static Date updatedAt;
    static User user;
    static List<User> users;

    //Initialize all variables
    @BeforeAll
    static void initializeAll() {
        users = new ArrayList<>();
        id = 1;
        firstName = "jnan";
        lastName = "v";
        phoneNumber = "984746363";
        createdAt = new Date();
        updatedAt = new Date();
        user = new User(id, firstName, lastName, phoneNumber, createdAt, updatedAt);
        users.add(user);
        users.add(new User(2, "samarth", "singh", "984742323", new Date(), new Date()));
        users.add(new User(3, "ankit", "dudeja", "984744893", new Date(), new Date()));
    }

    // test cases for create user
    @ParameterizedTest
    @MethodSource("createUserTestData")
    public void createUser(String firstName, String lastName, String phoneNumber, User expectedResult) {
        ManageUserServiceImpl manageUserService = new ManageUserServiceImpl();
        assertTrue(expectedResult.equals(manageUserService.createUser(firstName, lastName, phoneNumber)));
    }

    static Stream<Arguments> createUserTestData() {
        return Stream.of(
                Arguments.of(firstName, lastName, phoneNumber, user)
        );
    }

    // test cases for update user profile
    @ParameterizedTest
    @MethodSource("updateUserProfileTestData")
    public void updateUserProfile(int id, String firstName, String lastName, String phoneNumber, User expectedResult) {
        ManageUserService manageUserService = new ManageUserServiceImpl();
        assertTrue(expectedResult.equals(manageUserService.updateUserProfile(id, firstName, lastName, phoneNumber)));
    }

    static Stream<Arguments> updateUserProfileTestData() {
        return Stream.of(
                Arguments.of(1, "sahu", "rajiv", "9836363322", new User(1, "sahu", "rajiv", "9836363322", new Date(), new Date()))
        );
    }

    // Test case for delete user
    @ParameterizedTest
    @MethodSource("deleteUserTestData")
    public void deleteUser(int id, boolean expectedResult) {
        ManageUserService manageUserService = new ManageUserServiceImpl();
        assertEquals(expectedResult, manageUserService.deleteUser(id));
    }

    static Stream<Arguments> deleteUserTestData() {
        return Stream.of(
                Arguments.of(1, true),
                Arguments.of(2, true)
        );
    }

    // Test case for getUserById
    @ParameterizedTest
    @MethodSource("getUserByIdTestData")
    public void getUserById(int id, User expectedResult) {
        ManageUserService manageUserService = new ManageUserServiceImpl();
        assertTrue(expectedResult.equals(manageUserService.getUserById(id)));
    }

    static Stream<Arguments> getUserByIdTestData() {
        return Stream.of(
                Arguments.of(1, user)
        );
    }

    // Test case for getAllUsers
    @ParameterizedTest
    @MethodSource("getAllUsersTestData")
    public void getAllUsers(List<Users> expectedResult) {
        ManageUserService manageUserService = new ManageUserServiceImpl();
        assertTrue(expectedResult.equals(manageUserService.getAllUsers()));
    }

    static Stream<List<User>> getAllUsersTestData() {
        return Stream.of(users);
    }

}
