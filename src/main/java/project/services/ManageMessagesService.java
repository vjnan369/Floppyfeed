package project.services;

import project.model.Content;
import project.model.Message;
import project.model.User;

import java.util.List;
import java.util.Optional;

public interface ManageMessagesService {
    Optional<Message> getMessageById(int id);
    List<Message> getMessagesByContentId(int contentId);
    List<Message> getMessagesByUserId(int userId);
    Message createMessage(int userId, int contentId, String description);
    boolean updateMessage(int id, int userId, int contentId, String description);
    boolean deleteMessage(int id);
}
