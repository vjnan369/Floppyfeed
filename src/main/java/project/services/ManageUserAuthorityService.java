package project.services;

public interface ManageUserAuthorityService {
    boolean createAuthority(int id, int userId, String userName, String password, String confirmationToken);
    boolean updateAuthority(int id, String userName, String password);
    boolean deleteAuthority(int id);
    boolean createConfirmationToken();
    boolean confirmToken(String token);
    boolean updateConfirmationToken(int id);
}
