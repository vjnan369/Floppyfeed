package project.model;

import java.util.Date;

public class UserAuthentication {
    private int id;
    private int userId;
    private String email;
    private String password;
    private String confirmationToken;
    private Date confirmedAt;
    private Date createdAt;
    private Date updatedAt;

    public UserAuthentication(int id, int userId, String email, String password, String confirmationToken, Date confirmedAt, Date createdAt, Date updatedAt) {
        this.id = id;
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.confirmationToken = confirmationToken;
        this.confirmedAt = confirmedAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String userName) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmationToken() {
        return confirmationToken;
    }

    public void setConfirmationToken(String confirmationToken) {
        this.confirmationToken = confirmationToken;
    }

    public Date getConfirmedAt() {
        return confirmedAt;
    }

    public void setConfirmedAt(Date confirmedAt) {
        this.confirmedAt = confirmedAt;
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
        return "UserAuthentication{" +
                "id=" + id +
                ", userId=" + userId +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", confirmationToken='" + confirmationToken + '\'' +
                ", confirmedAt=" + confirmedAt +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
