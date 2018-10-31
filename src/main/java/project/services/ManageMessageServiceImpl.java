package project.services;

import project.model.Message;
import project.repository.MessagesInfo;

import java.util.List;
import java.util.Optional;

public class ManageMessageServiceImpl implements ManageMessagesService {
    private MessagesInfo messagesInfo = new MessagesInfo();

    // returns message details for given id
    public Optional<Message> getMessageById(int id) {
        return messagesInfo.getMessageById(id);
    }

    // returns list of messages for given content id
    public List<Message> getMessagesByContentId(int contentId) {
        return messagesInfo.getMessagesByContentId(contentId);
    }

    // returns messages for given user id
    public List<Message> getMessagesByUserId(int userId) {
        return messagesInfo.getMessagesByUserId(userId);
    }

    // returns message details after adding message
    public Message createMessage(int userId, int contentId, String description) {
        return messagesInfo.createMessage(userId, contentId, description);
    }

    // returns true if updating message is successful
    public boolean updateMessage(int id, int userId, int contentId, String description) {
        return messagesInfo.updateMessage(id, userId, contentId, description);
    }

    // returns true if deleting message is successful
    public boolean deleteMessage(int id) {
        return messagesInfo.deleteMessage(id);
    }

}
