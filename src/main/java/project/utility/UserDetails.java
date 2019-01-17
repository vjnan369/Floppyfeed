package project.utility;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import project.model.UserAuthentication;

@Component
public class UserDetails {
    public UserAuthentication currentUserCredentials(Authentication authentication) {
        return (UserAuthentication) authentication.getPrincipal();
    }

    public int currentUserId(Authentication authentication) {
        UserAuthentication userAuthentication = currentUserCredentials(authentication);
        return userAuthentication.getUserId();
    }
}
