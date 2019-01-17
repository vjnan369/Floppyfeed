package project.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import project.model.UserAuthentication;
import project.model.UserRole;
import project.repository.UserRoleRepository;

@Component(value = "authorizer")
public class Authorizer {
    @Autowired
    private UserRoleRepository userRoleRepository;

    public boolean isAdmin(Authentication authentication) {
        UserAuthentication userAuthentication = (UserAuthentication) authentication.getPrincipal();
        UserRole userRole = userRoleRepository.findByUserId(userAuthentication.getUserId());
        System.out.println(userRole.getName());
        if(userRole.getName().equals("ROLE_ADMIN")){
            return true;
        }
        return false;
    }

    public boolean isAuthor() {
        System.out.println("Hello world");
        return true;
    }
}