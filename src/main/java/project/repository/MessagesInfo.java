package project.repository;

import project.model.Content;
import project.model.Message;
import project.model.User;
import sun.nio.ch.sctp.MessageInfoImpl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessagesInfo {

    List<Message> messages;

    public MessagesInfo(){
        messages = new ArrayList<Message>();
        messages.add(new Message(1,1,1, "hello world, how are you!",
                new Date(), new Date()));
        messages.add(new Message(2,2,2, "this is for second content!",
                new Date(), new Date()));
    }

    public Message getMessageById(int id) {
        for(Message message : messages) {
            if(message.getId() == id) {
                return message;
            }
        }
        return null;
    }

    public List<Message> fetchMessagesByContent(Content content) {
        List<Message> messages = new ArrayList<>();
        for(Message message : messages) {
            if(message.getContentId() == content.getId()) {
                messages.add(message);
            }
        }
        return messages;
    }

    public List<Message> fetchMessageByUser(User user){
        List<Message> messages = new ArrayList<>();
        for(Message message : messages){
            if(message.getUserId() == user.getId()){
                messages.add(message);
            }
        }
        return messages;
    }

    public Message createMessage(int id, int userId, int contentId, String description){
        Date createdAt = new Date();
        Date updatedAt = new Date();
        Message newMessage = new Message(id, userId, contentId, description, createdAt, updatedAt);
        messages.add(newMessage);
        return newMessage;
    }

    public Message updateMessage(int id, int userId, int contentId, String description){
        for(Message message : messages) {
            if(message.getId() == id){
                int messageIndex = messages.indexOf(message);
                message.setUserId(userId);
                message.setContentId(contentId);
                message.setDescription(description);
                message.setUpdatedAt(new Date());
                messages.set(messageIndex, message);
                return message;
            }
        }
        return null;
    }

    public boolean deleteMessage(int id){
        int messageIndex = -1;
        for(Message message : messages){
            if(message.getId() == id){
                messageIndex = messages.indexOf(message);
                break;
            }
        }
        if(messageIndex > -1){
            messages.remove(messageIndex);
        }
        return true;
    }
}
