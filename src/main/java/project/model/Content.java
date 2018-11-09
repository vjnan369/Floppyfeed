package project.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="content")
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String type;
    private String title;
    private int userId;
    private int mediaTypeId;
    private String description;
    private String status;
    private Date publishedAt;

    @JoinColumn(name="created_at")
    private Date createdAt;

    private Date updatedAt;

    public Content(){

    }
    public Content(String type, String title, int userId, int mediaTypeId, String description, String status, Date publishedAt, Date createdAt, Date updatedAt) {
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

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Content content = (Content) obj;
        return (id == content.getId() && type == content.getType() && title == content.getTitle()
                && userId == content.getUserId() && mediaTypeId == content.getMediaTypeId()
                && description == content.getDescription() && status == content.getStatus()
        );
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + userId;
        result = prime * result + mediaTypeId;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime *     result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        return result;
    }

    public Date getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Date publishedAt) {
        this.publishedAt = publishedAt;
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

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getMediaTypeId() {
        return mediaTypeId;
    }

    public void setMediaTypeId(int mediaTypeId) {
        this.mediaTypeId = mediaTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Content{" +
                "id=" + id +
                "type=" + type +
                "title=" + title +
                "mediaTypeId=" + mediaTypeId +
                "userId=" + userId +
                "description=" + description +
                "status=" + status +
                "publishedAt=" + publishedAt +
                "createdAt=" + createdAt +
                "updatedAt=" + updatedAt +
                "}";
    }
}
