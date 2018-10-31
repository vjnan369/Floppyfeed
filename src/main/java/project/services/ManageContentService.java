package project.services;

import project.model.Content;

import java.util.Date;
import java.util.List;

public interface ManageContentService {
    Content getContentById(int id);
    List<Content> fetchAllContent();
    Content createContent(String type, String title, int userId, int mediaTypeId, String description, String status, Date publishedAt, Date createdAt, Date updatedAt);
    List<Content> searchContent(String searchText);
    Content updateContent(int id, String type, String title, int userId, int mediaTypeId, String description, String status);
    boolean deleteContent(int id);
}
