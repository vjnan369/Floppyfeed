package project.services;

import project.utility.ResponseObject;

public interface ManageUserAuthenticationService {
    ResponseObject confirmToken(String token);
//    boolean createAuthentication(int userId, String userName, String password, String confirmationToken);
//    boolean updateAuthentication(int id, String userName, String password);
//    boolean deleteAuthentication(int id);
//    boolean createConfirmationToken();
//    boolean updateConfirmationToken(int id);
}
