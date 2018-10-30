package project.services;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import project.model.Content;
import project.model.Message;
import project.model.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ManageMessageServiceImplTest {
    static int id;
    static int userId;
    static int contentId;
    static String description;
    static Date createdAt;
    static Date updatedAt;
    static Message message;
    static Content content;
    static User user;
    static List<Message> messages = new ArrayList<>();

    // Initializing all static variables
    @BeforeAll
    static void initializeAll() {
        id = 1;
        userId = 1;
        contentId = 1;
        description = "hello world, how are you!";
        createdAt = new Date();
        updatedAt = new Date();
        message = new Message(id, userId, contentId, description, createdAt, updatedAt);
        messages.add(message);
        messages.add(new Message(3, 3, 3, "hello world, this is third message!",
                new Date(), new Date()));
        messages.add(new Message(2, 2, 2, "this is for second message!",
                new Date(), new Date()));
        content = new Content(1, "fictional","percy jackson", 1, 1, "hello world", "published", new Date(), new Date(), new Date());
        user = new User(1, "sam", "singh", "984743633", new Date(), new Date(), new Date());
    }

    // Test case for getMessageById method
    @ParameterizedTest
    @MethodSource("getMessagByIdTestData")
    public void getMessageById(int id, Message expectedResult) {
        ManageMessageServiceImpl  manageMessageService = new ManageMessageServiceImpl();
        assertTrue(expectedResult.equals(manageMessageService.getMessageById(id)));
    }

    static Stream<Arguments> getMessagByIdTestData() {
        return Stream.of(
                Arguments.of(1, message)
        );
    }


    // Test case for getMessagesByContent method
    @ParameterizedTest
    @MethodSource("getMessagesByContentTestData")
    public void getMessagesByContent(Content content, List<Message> expectedResult) {
        ManageMessageServiceImpl  manageMessageService = new ManageMessageServiceImpl();
        assertTrue(expectedResult.equals(manageMessageService.getMessagesByContent(content)));
    }

    static Stream<Arguments> getMessagesByContentTestData() {
        List<Message> filteredMessages = new ArrayList<>();
        filteredMessages.add(message);
        return Stream.of(
                Arguments.of(content, filteredMessages)
        );
    }

    // Test case for getMessagesByUser method
    @ParameterizedTest
    @MethodSource("getMessagesByIdTestData")
    public void getMessagesByUser(User user, List<Message> expectedResult) {
        ManageMessageServiceImpl  manageMessageService = new ManageMessageServiceImpl();
        assertTrue(expectedResult.equals(manageMessageService.getMessageById(id)));
    }

    static Stream<Arguments> getMessagesByIdTestData() {
        List<Message> filteredMessages = new ArrayList<>();
        filteredMessages.add(message);
        return Stream.of(
                Arguments.of(user, filteredMessages)
        );
    }


}
