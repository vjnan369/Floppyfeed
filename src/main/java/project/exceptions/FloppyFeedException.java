package project.exceptions;

public class FloppyFeedException extends Exception {
    private int statusCode;
    private String message;
    private String requestedPath;
    private String description;

    public FloppyFeedException() {

    }

    public FloppyFeedException(int statusCode, String message, String requestedPath, String description) {
        this.statusCode = statusCode;
        this.message = message;
        this.requestedPath = requestedPath;
        this.description = description;
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

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getPath() {
        return requestedPath;
    }

    public void setPath(String requestedPath) {
        this.requestedPath = requestedPath;
    }

    @Override
    public String toString() {
        return "FloppyFeedException{" +
                "statusCode=" + statusCode +
                ", message='" + message + '\'' +
                ", requestedPath='" + requestedPath + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
