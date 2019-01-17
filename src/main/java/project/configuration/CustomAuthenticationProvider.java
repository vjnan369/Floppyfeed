package project.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;
import project.model.UserAuthentication;
import project.services.ManageUserService;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private ManageUserService manageUserService;

    @Override
    public Authentication authenticate(Authentication authentication)
            throws AuthenticationException {
        UsernamePasswordAuthenticationToken auth = (UsernamePasswordAuthenticationToken) authentication;
        String username = String.valueOf(auth.getPrincipal());
        String password = String.valueOf(auth.getCredentials());
        UserAuthentication userAuthentication = manageUserService.getUserByEmail(username);
        if (userAuthentication == null || !userAuthentication.getPassword().equals(password)) {
            throw new BadCredentialsException("Bad Credentials");
        }
        return new UsernamePasswordAuthenticationToken(userAuthentication, null, auth.getAuthorities());
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
