package project.controllers;

import org.springframework.web.bind.annotation.*;
import project.model.Content;
import project.services.ManageContentService;
import project.services.ManageContentServiceImpl;

import java.util.List;
import java.util.Map;
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

//    @PostMapping("/content")
//    public Content create(@RequestBody Map<String, String> body){
//
//    }
}
