package project.exceptions;

public class ContentException extends FloppyFeedException {

    public ContentException(int statusCode, String message, String requestedPath, String description) {
        super(statusCode, message, requestedPath, description);
    }
}
