package project.services;

import project.model.Content;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ManageContentService {
    Optional<Content> getContentById(int id);

    List<Content> fetchAllContent();

    Content createContent(String type, String title, int userId, int mediaTypeId, String description, String status, Date publishedAt, Date createdAt, Date updatedAt);

    List<Content> searchContent(String searchText);

    boolean updateContent(int id, String type, String title, int userId, int mediaTypeId, String description, String status);

    boolean deleteContent(int id);
}
