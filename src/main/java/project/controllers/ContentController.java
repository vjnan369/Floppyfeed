package project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.model.Content;
import project.services.ManageContentService;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class ContentController {

    @Autowired(required = true)
    private ManageContentService manageContentService;

    @GetMapping("/contents")
    public List<Content> index(){
        return manageContentService.fetchAllContent();
    }


    @GetMapping("/")
    public String newIndex(){
        return "hello world";
    }

    @GetMapping("/content/{id}")
    public Content show(@PathVariable String id){
        int contentId = Integer.parseInt(id);
        System.out.println(contentId);
        return manageContentService.getContentById(contentId);
    }

    @PostMapping("/content")
    public Optional<Content> create(@RequestBody Map<String, String> body){
        String type = body.get("type");
        String title = body.get("title");
        int userId = 1; // TODO implement spring security to get userId
        int mediaTypeId = 1; body.get("mediaTypeId");
        String description = body.get("description");
        String status = body.get("status");
        return manageContentService.createContent(type, title, userId, mediaTypeId, description, status);
    }

    @PutMapping("/content/{id}")
    public Content update(@PathVariable int id, @RequestBody Map<String, String> body){
        String type = body.get("type");
        String title = body.get("title");
        String description = body.get("description");
        String status = body.get("status");
        int userId = 3; //TODO implement spring security to get userId
        int mediaTypeId = 1; //TODO fetch media type id
        return manageContentService.updateContent(id, type, title, userId, mediaTypeId, description, status);
    }

    @DeleteMapping("/content/{id}")
    public boolean delete(@PathVariable int id){
        return manageContentService.deleteContent(id);
    }
}
