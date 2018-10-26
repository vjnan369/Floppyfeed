package project.services;

import project.model.Content;
import project.utility.ContentInfo;

import java.util.List;

public class ManageContentServiceImpl implements ManageContentService {
    private ContentInfo contentInfo =  new ContentInfo();
    public Content getContentById(int id) {
        return contentInfo.getContentById(id);
    }

    public List<Content> fetchAllContent() {
        return contentInfo.fetchAllContent();
    }
}
