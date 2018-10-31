package project.services;

import project.exceptions.TokenValidationException;
import project.repository.UserAuthenticationInfo;
import project.utility.ResponseObject;

public class ManageUserAuthenticationServiceImpl implements ManageUserAuthenticationService{
    private UserAuthenticationInfo userAuthenticationInfo = new UserAuthenticationInfo();

    public ResponseObject confirmToken(String token){
        try{
            if(userAuthenticationInfo.confirmToken(token)){
                return new ResponseObject(true, 0, "confirmation successful");
            }
        } catch (TokenValidationException e){
            e.printStackTrace();
            if(e.getType().equals("invalid")){
                return new ResponseObject(false, 500, "the given token is invalid: "+e.getToken());
            }
            return new ResponseObject(false, 500, "the given token is expired: "+e.getToken());
        }
        return new ResponseObject(false, 500 , "Something went wrong, please contact administrator");
    }
}