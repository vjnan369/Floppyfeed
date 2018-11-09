package project.services;

import project.model.Content;

import java.util.List;
import java.util.Optional;

public interface ManageContentService {
    Content getContentById(int id);

    List<Content> fetchAllContent();

    Optional<Content> createContent(String type, String title, int userId, int mediaTypeId, String description, String status);
//
//    List<Content> searchContent(String searchText);
//
    Content updateContent(int id, String type, String title, int userId, int mediaTypeId, String description, String status);

    boolean deleteContent(int id);
}
