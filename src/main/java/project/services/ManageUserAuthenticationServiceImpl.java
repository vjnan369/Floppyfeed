package project.services;

import project.repository.UserAuthenticationInfo;

public class ManageUserAuthenticationServiceImpl implements ManageUserAuthenticationService {
    private UserAuthenticationInfo userAuthenticationInfo = new UserAuthenticationInfo();

    // This will check token confirmation, returns ture if it is matched,
    // throws tokenvalidexception if it fails/notmatched.
    public boolean confirmToken(String token) {
        return userAuthenticationInfo.confirmToken(token);
    }

    //this will return true if the user authentication
    public boolean createAuthentication(int userId, String email, String password, String confirmationToken) {
        return userAuthenticationInfo.createAuthentication(userId, email, password, confirmationToken);
    }

    //return true if email, password updated successfully
    public boolean updateAuthentication(int id, String email, String password) {
        return userAuthenticationInfo.updateAuthentication(id, email, password);
    }

    // returns true if userAuthentication deleted successfully.
    public boolean deleteAuthentication(int id) {
        return userAuthenticationInfo.deleteAuthentication(id);
    }

    //It will generate confirmation token
    public String createConfirmationToken() {
        return userAuthenticationInfo.createConfirmationToken();
    }


}