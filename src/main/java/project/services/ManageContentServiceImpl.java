package project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.model.Content;
import project.repository.ContentRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ManageContentServiceImpl implements ManageContentService {
    @Autowired
    private ContentRepository contentInfo;

//    private ContentInfo contentInfo = new ContentInfo();

    private static ManageContentServiceImpl instance = null;
    public static ManageContentServiceImpl getInstance(){
        if(instance == null){
            instance = new ManageContentServiceImpl();
        }
        return instance;
    }

    //Returns content which having given content id
    public Content getContentById(int id) {
        return contentInfo.findOne(id);
    }

    // Returns list of all available contents
    public List<Content> fetchAllContent() {
        return contentInfo.findAll();
    }

    // Create new Content for provided content details
    public Optional<Content> createContent(String type, String title, int userId, int mediaTypeId, String description, String status) {
        Date createdAt = new Date();
        Date updatedAt = new Date();
        Date publishedAt = null;
        if(status.equals("published")){
            publishedAt = new Date();
        }
        Content content = new Content(type, title, userId, mediaTypeId, description, status, publishedAt, createdAt, updatedAt);
        return Optional.of(contentInfo.save(content));
    }
//
//    // returns list contents which having given searchtext
//    public List<Content> searchContent(String searchText) {
//        return contentInfo.searchContent(searchText);
//    }
//
    // updates given content details
    public Content updateContent(int id, String type, String title, int userId, int mediaTypeId, String description, String status) {
        Content content = contentInfo.findOne(id);
        content.setType(type);
        content.setStatus(status);
        content.setTitle(title);
        content.setDescription(description);
        content.setUpdatedAt(new Date());
        content.setMediaTypeId(mediaTypeId);
        return contentInfo.save(content);
    }

    public boolean deleteContent(int id) {
        try{
            contentInfo.delete(id);
        } catch (Exception e){
            System.out.println(e);
            return false;
        }
        return true;
    }
}