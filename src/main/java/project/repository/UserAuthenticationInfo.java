package project.repository;

import project.model.UserAuthentication;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserAuthenticationInfo {
    List<UserAuthentication> userAuthentications;
    public UserAuthenticationInfo(){
        userAuthentications = new ArrayList<>();
        userAuthentications.add(
                new UserAuthentication(1, 1, "jnan", "abcdefg", "asdfs-xiDrsdfS-RDFe", new Date(), new Date(), new Date())
        );
        userAuthentications.add(
                new UserAuthentication(2, 2, "samarth", "samsingh123", "asdfrs-xiDrswrssdfdfS-sdfRDFe", new Date(), new Date(), new Date())
        );
        userAuthentications.add(
                new UserAuthentication(3, 3, "ankit", "ankit12345", "asdfDsrds-xisdfrDrsdfS-RDFe", new Date(), new Date(), new Date())
        );
    }


//    boolean createAuthority(int id, int userId, String userName, String password, String confirmationToken){
//        UserAuthentication newUserAuthority = new UserAuthentication(id, userId, userName, password, confirmationToken)
//    }
//
//    boolean updateAuthority(int id, String userName, String password);
//    boolean deleteAuthority(int id);
//    boolean createConfirmationToken();
//    boolean confirmToken(String token);
//    boolean updateConfirmationToken(int id);
}
