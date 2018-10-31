package project.services;

import project.model.Content;
import project.model.Message;
import project.model.User;

import java.util.List;

public interface ManageMessagesService {
    Message getMessageById(int id);
    List<Message> getMessagesByContent(Content content);
    List<Message> getMessagesByUser(User user);
    Message createMessage(int userId, int contentId, String description);
    Message updateMessage(int id, int userId, int contentId, String description);
    boolean deleteMessage(int id);
}
