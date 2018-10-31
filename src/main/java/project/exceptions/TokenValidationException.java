package project.exceptions;

public class TokenValidationException extends Exception{
    private String token;
    private String type;
    public TokenValidationException(String token, String type){
        this.token = token;
        this.type = type;
    }

    public String getToken(){
        return token;
    }

    public String getType(){
        return type;
    }
}
