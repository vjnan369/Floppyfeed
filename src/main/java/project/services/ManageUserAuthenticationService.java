package project.services;

public interface ManageUserAuthenticationService {
    boolean createAuthentication(int id, int userId, String userName, String password, String confirmationToken);
    boolean updateAuthentication(int id, String userName, String password);
    boolean deleteAuthentication(int id);
    boolean createConfirmationToken();
    boolean confirmToken(String token);
    boolean updateConfirmationToken(int id);
}
