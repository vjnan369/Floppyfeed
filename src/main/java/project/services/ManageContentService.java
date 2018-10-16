package project.services;

import project.model.Content;

import java.util.List;

public interface ManageContentService {
    Content getContentById(int id);
    List<Content> getAllContents();
    List<Content> getContentsByAuthor();
    List<Content> getContentsOfThisMonth();
    List<Content> getContentsOfThisWeek();
    Content searchContentByKeyword(String keyword);
    Content searchContentByType(String keyword);
    Content searchContentByMediaType(String keyword);
    Content getDraftedContent();
    boolean createContent(Content content);
    boolean updateContent(Content content);
    boolean deleteContent(Content content);
}
