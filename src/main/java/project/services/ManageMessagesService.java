package project.services;

import project.model.Message;

import java.util.List;

public interface ManageMessagesService {
    Message getMessageById(int id);

    List<Message> getAllMessagesByArticle();

    List<Message> getAllMessagesByUser();
    public boolean createMessage(Message message);
    public boolean updateMessage(Message message);
    public boolean deleteMessage(Message message);
}
