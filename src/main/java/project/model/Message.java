package project.model;

import java.util.Date;

public class Message {
    private int id;
    private int userId;
    private int contentId;
    private String description;
    private Date createdAt;
    private Date updatedAt;

    public Message(int id, int userId, int contentId, String description, Date createdAt, Date updatedAt) {
        this.id = id;
        this.userId = userId;
        this.contentId = contentId;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Message message = (Message) obj;
        return (id == message.getId() && contentId == message.getContentId() && userId == message.getUserId()
                && description == message.getDescription()
        );
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + userId;
        result = prime * result + contentId;
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        return result;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", userId=" + userId +
                ", contentId=" + contentId +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
