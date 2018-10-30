package project.services;

import project.model.Content;
import project.model.Message;
import project.model.User;
import project.repository.MessagesInfo;

import java.util.List;

public class ManageMessageServiceImpl implements ManageMessagesService {
    private MessagesInfo messagesInfo = new MessagesInfo();

    public Message getMessageById(int id) {
        return messagesInfo.getMessageById(id);
    }

    public List<Message> getMessagesByContent(Content content) {
        return messagesInfo.getMessagesByContent(content);
    }

    public List<Message> getMessagesByUser(User user) {
        return messagesInfo.getMessagesByUser(user);
    }

    public Message createMessage(int id, int userId, int contentId, String description) {
        return messagesInfo.createMessage(id, userId, contentId, description);
    }

    public Message updateMessage(int id, int userId, int contentId, String description) {
        return messagesInfo.updateMessage(id, userId, contentId, description);
    }

    public boolean deleteMessage(int id) {
        return messagesInfo.deleteMessage(id);
    }

}
