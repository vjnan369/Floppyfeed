package project.exceptions;

public class ResourceNotFoundException extends Exception{
    private String name;
    private String message;

    public ResourceNotFoundException(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }
}
