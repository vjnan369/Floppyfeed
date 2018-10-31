package project.repository;

import project.exceptions.TokenValidationException;
import project.model.UserAuthentication;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserAuthenticationInfo {
    List<UserAuthentication> userAuthentications;
    int generateId = 0;
    public UserAuthenticationInfo(){
        userAuthentications = new ArrayList<>();
        userAuthentications.add(
                new UserAuthentication(1, 1, "jnan@gmail.com", "abcdefg", "asdfs-xiDrsdfS-RDFe", new Date(), new Date(), new Date())
        );
        userAuthentications.add(
                new UserAuthentication(2, 2, "samarth@gmail.com", "samsingh123", "asdfrs-xiDrswrssdfdfS-sdfRDFe", new Date(), new Date(), new Date())
        );
        userAuthentications.add(
                new UserAuthentication(3, 3, "ankit@gmail.com", "ankit12345", "asdfDsrds-xisdfrDrsdfS-RDFe", new Date(), new Date(), new Date())
        );
    }


    boolean createAuthentication(int userId, String email, String password, String confirmationToken){
        UserAuthentication newUserAuthority = new UserAuthentication(++generateId, userId, email, password, confirmationToken, null, new Date(), new Date());
        try {
            userAuthentications.add(newUserAuthority);
            return true;
        } catch (NullPointerException e){
            return false;
        }
    }

    // to update authentication details
    boolean updateAuthentication(int id, String email, String password){
        try{
            for(UserAuthentication userAuthentication : userAuthentications){
                if(userAuthentication.getId() == id){
                    int index = userAuthentications.indexOf(userAuthentication);
                    userAuthentication.setEmail(email);
                    userAuthentication.setPassword(password);
                    userAuthentications.set(index, userAuthentication);
                    return true;
                }
            }
            return false;
        } catch (NullPointerException e){
            return false;
        }
    }

    // to delete authentication details
    boolean deleteAuthentication(int id){
        int index = -1;
        try{
            for(UserAuthentication userAuthentication : userAuthentications){
                if(userAuthentication.getId() == id){
                    index = userAuthentications.indexOf(userAuthentication);
                    break;
                }
            }
            if(index > -1){
                userAuthentications.remove(index);
                return true;
            }
            return false;
        } catch (NullPointerException e){
            return false;
        }
    }

    String createConfirmationToken(){
        SecureRandom random = new SecureRandom();
        long token = Math.abs(random.nextLong());
        String randomToken = Long.toString(token, 16);
        return randomToken;
    }

    // This will check token confirmation, returns ture if it is matched,
    // throws tokenvalidexception if it fails/notmatched.
    public boolean confirmToken(String token) throws TokenValidationException {
        try{
            for(UserAuthentication userAuthentication : userAuthentications){
                if(userAuthentication.getConfirmationToken().equals(token)){
                    if(userAuthentication.getConfirmedAt() == null){
                        userAuthentication.setConfirmedAt(new Date());
                        return true;
                    } else {
                        throw new TokenValidationException(token, "expired");
                    }
                }
            }
            throw new TokenValidationException(token, "invalid");
        } catch (NullPointerException e){
            return false;
        }
    }
}
