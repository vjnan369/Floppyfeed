package project.repository;

import project.model.Message;

import java.util.*;

public class MessagesInfo {

    List<Message> messages;
    int generateId = 0;

    public MessagesInfo() {
        messages = new ArrayList<>();
        messages.add(new Message(1, 1, 1, "hello world, how are you!",
                new Date(), new Date()));
        messages.add(new Message(2, 2, 2, "this is for second message!",
                new Date(), new Date()));
    }

    public Optional<Message> getMessageById(int id) {
        try {
            for (Message message : messages) {
                if (message.getId() == id) {
                    return Optional.of(message);
                }
            }
            return Optional.empty();
        } catch (NullPointerException e){
            return Optional.empty();
        }
    }

    public List<Message> getMessagesByContentId(int contentId) {
        List<Message> newMessages = new ArrayList<>();
        try {
            for (Message message : messages) {
                if (message.getContentId() == contentId) {
                    newMessages.add(message);
                }
            }
            return newMessages;
        } catch (NullPointerException e) {
            return Collections.EMPTY_LIST;
        }
    }

    public List<Message> getMessagesByUserId(int userId) {
        List<Message> newMessages = new ArrayList<>();
        try {
            for (Message message : messages) {
                if (message.getUserId() == userId) {
                    newMessages.add(message);
                }
            }
            return newMessages;
        } catch (NullPointerException e) {
            return Collections.EMPTY_LIST;
        }
    }

    public Message createMessage(int userId, int contentId, String description) {
        Date createdAt = new Date();
        Date updatedAt = new Date();
        Message newMessage = new Message(++generateId, userId, contentId, description, createdAt, updatedAt);
        messages.add(newMessage);
        return newMessage;
    }

    public boolean updateMessage(int id, int userId, int contentId, String description) {
        try{
            for (Message message : messages) {
                if (message.getId() == id) {
                    int messageIndex = messages.indexOf(message);
                    message.setUserId(userId);
                    message.setContentId(contentId);
                    message.setDescription(description);
                    message.setUpdatedAt(new Date());
                    messages.set(messageIndex, message);
                    return true;
                }
            }
            return false;
        } catch (NullPointerException e){
            return false;
        }
    }

    public boolean deleteMessage(int id) {
        int messageIndex = -1;
        try {
            for (Message message : messages) {
                if (message.getId() == id) {
                    messageIndex = messages.indexOf(message);
                    break;
                }
            }
            if (messageIndex > -1) {
                messages.remove(messageIndex);
                return true;
            }
            return false;
        } catch (NullPointerException e){
            return false;
        }
    }
}
