package project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import project.exceptions.ContentException;
import project.model.Content;
import project.services.ManageContentService;
import project.utility.UserDetails;

import java.security.Principal;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class ContentController {

    @Autowired
    private ManageContentService manageContentService;

    @Autowired
    private UserDetails userDetails;

    @GetMapping("/contents")
    public List<Content> index() {
        return manageContentService.fetchAllContent();
    }


    @GetMapping("/")
    public String newIndex() {
        return "Welcome to FloppyFeed!";
    }

    @GetMapping("/content/{id}")
    public Content show(@PathVariable String id) {
        int contentId = Integer.parseInt(id);
        System.out.println(contentId);
        return manageContentService.getContentById(contentId);
    }

    @PostMapping("/content")
    @ExceptionHandler(ContentException.class)
    public Content create(@RequestBody Map<String, String> body, Authentication authentication) throws ContentException {
        String type = body.get("type");
        String title = body.get("title");
        int mediaTypeId = Integer.parseInt(body.get("mediaTypeId"));
        String description = body.get("description");
        String status = body.get("status");
        int userId = userDetails.currentUserId(authentication);
        Optional<Content> content = manageContentService.createContent(type, title, userId, mediaTypeId, description, status);
        if (content.isPresent()){
            return content.get();
        }
        throw new ContentException(500, "Error while creating content", "Unable to create content for given details");
    }

    @PutMapping("/content/{id}")
    public Content update(@PathVariable int id, @RequestBody Map<String, String> body) {
        String type = body.get("type");
        String title = body.get("title");
        String description = body.get("description");
        String status = body.get("status");
        int userId = 3; //TODO implement spring security to get userId
        int mediaTypeId = 1; //TODO fetch media type id
        return manageContentService.updateContent(id, type, title, userId, mediaTypeId, description, status);
    }

    @DeleteMapping("/content/{id}")
    public boolean delete(@PathVariable int id) {
        return manageContentService.deleteContent(id);
    }
}
