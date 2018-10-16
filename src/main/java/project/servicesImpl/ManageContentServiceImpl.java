package project.servicesImpl;

import project.model.Content;
import project.services.ManageContentService;
import project.utility.ContentInfo;

import java.util.List;

public class ManageContentServiceImpl implements ManageContentService {
    public Content getContentById(int id) {
        ContentInfo contentInfo = new ContentInfo();
        return contentInfo.content();
    }

    public boolean createContent(Content content) {
        return true;
    }

    public boolean updateContent(Content content) {
        return true;
    }

    public boolean deleteContent(Content content) {
        return true;
    }

    public List<Content> getAllContents() {
        ContentInfo contentInfo = new ContentInfo();
        return contentInfo.contents();
    }

    public List<Content> getContentsByAuthor() {
        ContentInfo contentInfo = new ContentInfo();
        return contentInfo.contents();
    }

    public List<Content> getContentsOfThisMonth() {
        ContentInfo contentInfo = new ContentInfo();
        return contentInfo.contents();
    }

    public List<Content> getContentsOfThisWeek() {
        ContentInfo contentInfo = new ContentInfo();
        return contentInfo.contents();
    }

    public Content searchContentByKeyword(String keyword){
        ContentInfo contentInfo = new ContentInfo();
        return contentInfo.content();
    }

    public Content searchContentByType(String keyword){
        ContentInfo contentInfo = new ContentInfo();
        return contentInfo.content();
    }

    public Content searchContentByMediaType(String keyword){
        ContentInfo contentInfo = new ContentInfo();
        return contentInfo.content();
    }

    public Content getDraftedContent() {
        ContentInfo contentInfo = new ContentInfo();
        return contentInfo.content();
    }
}
