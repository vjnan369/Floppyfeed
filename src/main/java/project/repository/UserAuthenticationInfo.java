package project.repository;

import project.model.UserAuthentication;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserAuthenticationInfo {
    List<UserAuthentication> userAuthentications;
    int generateId = 0;

    public UserAuthenticationInfo() {
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


    public boolean createAuthentication(int userId, String email, String password, String confirmationToken) {
        try {
            UserAuthentication newUserAuthority = new UserAuthentication(++generateId, userId, email, password, confirmationToken, null, new Date(), new Date());
            userAuthentications.add(newUserAuthority);
            return true;
        } catch (NullPointerException e) {
            return false;
        }
    }

    public boolean updateAuthentication(int id, String email, String password) {
        try {
            for (UserAuthentication userAuthentication : userAuthentications) {
                if (userAuthentication.getId() == id) {
                    int index = userAuthentications.indexOf(userAuthentication);
                    userAuthentication.setEmail(email);
                    userAuthentication.setPassword(password);
                    userAuthentications.set(index, userAuthentication);
                    return true;
                }
            }
            return false;
        } catch (NullPointerException e) {
            return false;
        }
    }

    // to delete authentication details
    public boolean deleteAuthentication(int id) {
        int index = -1;
        try {
            for (UserAuthentication userAuthentication : userAuthentications) {
                if (userAuthentication.getId() == id) {
                    index = userAuthentications.indexOf(userAuthentication);
                    break;
                }
            }
            if (index > -1) {
                userAuthentications.remove(index);
                return true;
            }
            return false;
        } catch (NullPointerException e) {
            return false;
        }
    }

    public String createConfirmationToken() {
        SecureRandom random = new SecureRandom();
        long token = Math.abs(random.nextLong());
        String randomToken = Long.toString(token, 16);
        return randomToken;
    }

    public boolean confirmToken(String token) {
        try {
            for (UserAuthentication userAuthentication : userAuthentications) {
                if (userAuthentication.getConfirmationToken().equals(token)) {
                    if (userAuthentication.getConfirmedAt() == null) {
                        userAuthentication.setConfirmedAt(new Date());
                        return true;
                    }
                }
            }
            return false;
        } catch (NullPointerException e) {
            return false;
        }
    }


}
