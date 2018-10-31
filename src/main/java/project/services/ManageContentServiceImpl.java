package project.services;

import project.model.Content;
import project.repository.ContentInfo;

import java.util.Date;
import java.util.List;

public class ManageContentServiceImpl implements ManageContentService {
    private ContentInfo contentInfo =  new ContentInfo();
    public Content getContentById(int id) {
        return contentInfo.getContentById(id);
    }

    public List<Content> fetchAllContent() {
        return contentInfo.fetchAllContent();
    }

    public Content createContent(String type, String title, int userId, int mediaTypeId, String description, String status, Date publishedAt, Date createdAt, Date updatedAt) {

        return contentInfo.createContent(type, title, userId, mediaTypeId, description, status, publishedAt, createdAt, updatedAt);
    }

    public List<Content> searchContent(String searchText){
        return contentInfo.searchContent(searchText);
    }

    public Content updateContent(int id, String type, String title, int userId, int mediaTypeId, String description, String status) {
        return contentInfo.updateContent(id, type, title, userId, mediaTypeId, description, status);
    }

    public boolean deleteContent(int id) {
        return contentInfo.deleteContent(id);
    }
}
