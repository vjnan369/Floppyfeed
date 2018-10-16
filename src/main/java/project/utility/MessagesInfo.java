package project.utility;

import project.model.Message;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessagesInfo {

    static int id3 = 1;
    static int userId3 = 1;
    static int contentId3 = 1;
    static String description3 = "hello world, how are you!";
    static Date createdAt3 = new Date();
    static Date updatedAt3 = new Date();
    static int id4 = 2;
    static int userId4 = 2;
    static int contentId4 = 2;
    static String description4 = "hello world, very bad service";
    static Date createdAt4 = new Date();
    static Date updatedAt4 = new Date();

    Message message1 = new Message(
            id3, userId3, contentId3, description3, createdAt3, updatedAt3
    );

    Message message2 = new Message(
            id4, userId4, contentId4, description4, createdAt4, updatedAt4
    );

    public Message message() {
        return message1;
    }

    public List<Message> messages() {
        List<Message> messages = new ArrayList<>();
        messages.add(message1);
        messages.add(message2);
        return messages;
    }
}
