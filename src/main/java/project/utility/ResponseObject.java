package project.utility;

public class ResponseObject {
    private boolean status;
    private int errorCode;
    private String message;

    public ResponseObject(boolean status, int errorCode, String message){
        this.status = status;
        this.errorCode = errorCode;
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getMessage() {
        return message;
    }
}
