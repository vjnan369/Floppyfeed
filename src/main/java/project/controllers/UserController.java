package project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import project.model.User;
import project.services.ManageUserService;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired(required = true)
    private ManageUserService manageUserService;

    @PreAuthorize("@authorizer.isAdmin(authentication)")
    @GetMapping("/users")
    public List<User> index(){
        return manageUserService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public User show(@PathVariable String id){
        int userId = Integer.parseInt(id);
        System.out.println(userId);
        return manageUserService.getUserById(userId);
    }

    @PostMapping("/user/registration")
    public Optional<User> create(@RequestBody Map<String, String> body){
        String firstName = body.get("firstName");
        String lastName = body.get("lastName");
        String phoneNumber = body.get("phoneNumber");
        String email = body.get("email");
        String password = body.get("password");
        return manageUserService.createUser(firstName, lastName, phoneNumber, email, password);
    }
}
