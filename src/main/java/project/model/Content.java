package project.model;

import java.util.Date;

public class Content {
    static int id;
    static String type;
    static String title;
    static int userId;
    static int mediaTypeId;
    static String description;
    static String status;

    public static Date getPublishedAt() {
        return publishedAt;
    }

    public static void setPublishedAt(Date publishedAt) {
        Content.publishedAt = publishedAt;
    }

    public static Date getCreatedAt() {
        return createdAt;
    }

    public static void setCreatedAt(Date createdAt) {
        Content.createdAt = createdAt;
    }

    public static Date getUpdatedAt() {
        return updatedAt;
    }

    public static void setUpdatedAt(Date updatedAt) {
        Content.updatedAt = updatedAt;
    }

    static Date publishedAt;
    static Date createdAt;
    static Date updatedAt;

    public Content(int id, String type, String title, int userId, int mediaTypeId, String description, String status, Date publishedAt, Date createdAt, Date updatedAt) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.userId = userId;
        this.mediaTypeId = mediaTypeId;
        this.description = description;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.publishedAt = publishedAt;
    }

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        Content.type = type;
    }

    public static String getTitle() {
        return title;
    }

    public static void setTitle(String title) {
        Content.title = title;
    }

    public static int getUserId() {
        return userId;
    }

    public static void setUserId(int userId) {
        Content.userId = userId;
    }

    public static int getMediaTypeId() {
        return mediaTypeId;
    }

    public static void setMediaTypeId(int mediaTypeId) {
        Content.mediaTypeId = mediaTypeId;
    }

    public static String getDescription() {
        return description;
    }

    public static void setDescription(String description) {
        Content.description = description;
    }

    public static String getStatus() {
        return status;
    }

    public static void setStatus(String status) {
        Content.status = status;
    }
}
