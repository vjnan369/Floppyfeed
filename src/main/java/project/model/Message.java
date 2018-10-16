package project.model;

import java.util.Date;

public class Message {
    static int id;
    static int userId;
    static int contentId;
    static String description;
    static Date createdAt;
    static Date updatedAt;

    public Message(int id, int userId, int contentId, String description, Date createdAt, Date updatedAt) {
        this.id = id;
        this.userId = userId;
        this.contentId = contentId;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Message.id = id;
    }

    public static int getUserId() {
        return userId;
    }

    public static void setUserId(int userId) {
        Message.userId = userId;
    }

    public static int getContentId() {
        return contentId;
    }

    public static void setContentId(int contentId) {
        Message.contentId = contentId;
    }

    public static String getDescription() {
        return description;
    }

    public static void setDescription(String description) {
        Message.description = description;
    }

    public static Date getCreatedAt() {
        return createdAt;
    }

    public static void setCreatedAt(Date createdAt) {
        Message.createdAt = createdAt;
    }

    public static Date getUpdatedAt() {
        return updatedAt;
    }

    public static void setUpdatedAt(Date updatedAt) {
        Message.updatedAt = updatedAt;
    }
}
