package project.services;

import project.model.Content;
import project.repository.ContentInfo;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public class ManageContentServiceImpl implements ManageContentService {
    private ContentInfo contentInfo = new ContentInfo();

    //Returns content which having given content id
    public Optional<Content> getContentById(int id) {
        return contentInfo.getContentById(id);
    }

    // Returns list of all available contents
    public List<Content> fetchAllContent() {
        return contentInfo.fetchAllContent();
    }

    // Create new Content for provided content details
    public Content createContent(String type, String title, int userId, int mediaTypeId, String description, String status, Date publishedAt, Date createdAt, Date updatedAt) {
        return contentInfo.createContent(type, title, userId, mediaTypeId, description, status, publishedAt, createdAt, updatedAt);
    }

    // returns list contents which having given searchtext
    public List<Content> searchContent(String searchText) {
        return contentInfo.searchContent(searchText);
    }

    // updates given content details
    public boolean updateContent(int id, String type, String title, int userId, int mediaTypeId, String description, String status) {
        return contentInfo.updateContent(id, type, title, userId, mediaTypeId, description, status);
    }

    public boolean deleteContent(int id) {
        return contentInfo.deleteContent(id);
    }
}
