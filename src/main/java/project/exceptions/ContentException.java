package project.exceptions;

public class ContentException extends Exception{
    private int errorCode;
    private String message;
    private String description;

    public ContentException(int errorCode, String message, String description) {
        this.errorCode = errorCode;
        this.message = message;
        this.description = description;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ContentException{" +
                "errorCode=" + errorCode +
                ", message='" + message + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
