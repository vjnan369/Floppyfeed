package project.services.servicesImpl;

import project.model.Content;
import project.services.ManageContentService;
import project.utility.ContentInfo;

import java.util.List;

public class ManageContentServiceImpl implements ManageContentService {
    private ContentInfo contentInfo;
    public Content getContentById(int id) {
        ContentInfo contentInfo = new ContentInfo();
        return contentInfo.getContentById();
    }
}
