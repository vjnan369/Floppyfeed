package project.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import project.model.Content;
import project.services.ManageContentService;
import project.services.ManageContentServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
public class ContentController {
    ManageContentService manageContentService = new ManageContentServiceImpl();

    @GetMapping("/content")
    public List<Content> index(){
        return manageContentService.fetchAllContent();
    }

    @GetMapping("/content/{id}")
    public Optional<Content> show(@PathVariable String id){
        int contentId = Integer.parseInt(id);
        System.out.println(contentId);
        return manageContentService.getContentById(contentId);
    }
}
