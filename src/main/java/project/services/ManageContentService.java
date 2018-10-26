package project.services;

import project.model.Content;

import java.util.List;

public interface ManageContentService {
    Content getContentById(int id);
    List<Content> fetchAllContent();
}
