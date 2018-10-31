package project.services;

public interface ManageUserAuthenticationService {
    boolean confirmToken(String token);

    boolean createAuthentication(int userId, String email, String password, String confirmationToken);

    boolean updateAuthentication(int id, String email, String password);

    boolean deleteAuthentication(int id);

    String createConfirmationToken();
}
