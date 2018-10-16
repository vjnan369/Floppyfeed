package project.servicesImpl;

import project.model.Content;
import project.model.Message;
import project.services.ManageMessagesService;
import project.utility.MessagesInfo;

import java.util.List;

public class ManageMessagesServiceImpl implements ManageMessagesService {
    public Message getMessageById(int id){
        MessagesInfo messagesInfo = new MessagesInfo();
        return messagesInfo.message();
    }

    public List<Message> getAllMessagesByArticle() {
        MessagesInfo messagesInfo = new MessagesInfo();
        return messagesInfo.messages();
    }

    public List<Message> getAllMessagesByUser() {
        MessagesInfo messagesInfo = new MessagesInfo();
        return messagesInfo.messages();
    };

    public boolean createMessage(Message message) {
        return true;
    }

    public boolean updateMessage(Message message) {
        return true;
    }

    public boolean deleteMessage(Message message) {
        return true;
    }

}
