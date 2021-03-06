package project.services;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import project.model.Content;
import project.model.Message;
import project.model.User;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

    // Initializing all variables
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
        content = new Content(1, "fictional", "percy jackson", 1, 1, "hello world", "published", new Date(), new Date(), new Date());
        user = new User(1, "sam", "singh", "984743633", new Date(), new Date());
    }

    // Test case for getMessageById method
    @ParameterizedTest
    @MethodSource("getMessagByIdTestData")
    public void getMessageById(int id, Optional<Message> expectedResult) {
        ManageMessageServiceImpl manageMessageService = new ManageMessageServiceImpl();
        assertTrue(expectedResult.equals(manageMessageService.getMessageById(id)));
    }

    static Stream<Arguments> getMessagByIdTestData() {
        return Stream.of(
                Arguments.of(1, Optional.of(message)),
                Arguments.of(-1, Optional.empty())
        );
    }


    // Test case for getMessagesByContent
    @ParameterizedTest
    @MethodSource("getMessagesByContentTestData")
    public void getMessagesByContent(int contentId, List<Message> expectedResult) {
        ManageMessageServiceImpl manageMessageService = new ManageMessageServiceImpl();
        assertTrue(expectedResult.equals(manageMessageService.getMessagesByContentId(contentId)));
    }

    static Stream<Arguments> getMessagesByContentTestData() {
        List<Message> filteredMessages = new ArrayList<>();
        filteredMessages.add(message);
        return Stream.of(
                Arguments.of(1, filteredMessages),
                Arguments.of(-1, Collections.emptyList())
        );
    }

    // Test case for getMessagesByUser
    @ParameterizedTest
    @MethodSource("getMessagesByIdTestData")
    public void getMessagesByUser(int userId, List<Message> expectedResult) {
        ManageMessageServiceImpl manageMessageService = new ManageMessageServiceImpl();
        assertTrue(expectedResult.equals(manageMessageService.getMessagesByUserId(userId)));
    }

    static Stream<Arguments> getMessagesByIdTestData() {
        List<Message> filteredMessages = new ArrayList<>();
        filteredMessages.add(message);
        return Stream.of(
                Arguments.of(1, filteredMessages),
                Arguments.of(-1, Collections.emptyList())
        );
    }


    // Test case for create Message
    @ParameterizedTest
    @MethodSource("createMessageTestData")
    public void createMessage(int userId, int contentId, String description, Message expectedResult) {
        ManageMessageServiceImpl manageMessageService = new ManageMessageServiceImpl();
        assertTrue(expectedResult.equals(manageMessageService.createMessage(userId, contentId, description)));
    }


    static Stream<Arguments> createMessageTestData() {
        return Stream.of(
                Arguments.of(userId, contentId, description, message)
        );
    }


    //     Test case for update message
    @ParameterizedTest
    @MethodSource("updateMessageTestData")
    public void updateMessage(int id, int userId, int contentId, String description, boolean expectedResult) {
        ManageMessageServiceImpl manageMessageService = new ManageMessageServiceImpl();
        assertEquals(expectedResult, manageMessageService.updateMessage(id, userId, contentId, description));
    }

    static Stream<Arguments> updateMessageTestData() {
        return Stream.of(
                Arguments.of(id, userId, contentId, description, true),
                Arguments.of(-1, userId, contentId, description, false)
        );
    }


    //Test case for delete message
    @ParameterizedTest
    @MethodSource("deleteMessageTestData")
    public void deleteContent(int id, boolean expectedResult) {
        ManageMessageServiceImpl manageMessageService = new ManageMessageServiceImpl();
        assertEquals(expectedResult, manageMessageService.deleteMessage(id));
    }

    static Stream<Arguments> deleteMessageTestData() {
        return Stream.of(
                Arguments.of(1, true),
                Arguments.of(2, true),
                Arguments.of(-1, false)
        );
    }


}
