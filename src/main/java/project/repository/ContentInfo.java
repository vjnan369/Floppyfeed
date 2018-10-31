package project.repository;

import project.model.Content;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ContentInfo {
    List<Content> contents;
    int generateId = 0;
    public ContentInfo() {
        contents = new ArrayList<>();
        contents.add(new Content(1, "fictional", "Percy jackson and sea of monsters",
                1,
                1,
                "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page",
                "published",
                new Date(),
                new Date(),
                new Date()
        ));
        contents.add(new Content(2, "political", "hello world , test data",
                2,
                2,
                "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page",
                "drafted",
                new Date(),
                new Date(),
                new Date()
        ));
        contents.add(new Content(3, "novel", "it is a novel content",
                3,
                3,
                "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page",
                "drafted",
                new Date(),
                new Date(),
                new Date()
        ));
        contents.add(new Content(4, "auto-biography", "its a autobiography",
                4,
                4,
                "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page",
                "drafted",
                new Date(),
                new Date(),
                new Date()
        ));
        contents.add(new Content(5, "regional", "testing regional content",
                5,
                5,
                "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page",
                "drafted",
                new Date(),
                new Date(),
                new Date()
        ));
    }

    public Content getContentById(int id) {
        try {
            for (Content content : contents) {
                if (content.getId() == id) {
                    return content;
                }
            }
            return null;
        } catch (NullPointerException e) {
            return null;
        }
    }

    public List<Content> fetchAllContent() {
        return contents;
    }

    public Content createContent(String type, String title, int userId, int mediaTypeId, String description, String status, Date publishedAt, Date createdAt, Date updatedAt) {
        try {
            Content newContent = new Content(++generateId, type, title, userId, mediaTypeId, description, status, publishedAt, createdAt, updatedAt);
            contents.add(newContent);
            return newContent;
        } catch (NullPointerException e) {
            return null;
        }
    }

    public List<Content> searchContent(String searchText) {
        List<Content> searchContents = new ArrayList<>();
        try {
            for (Content content : contents) {
                if (content.getTitle().toLowerCase().contains(searchText.toLowerCase())
                        || content.getDescription().toLowerCase().contains(searchText.toLowerCase())) {
                    searchContents.add(content);
                }
            }
            return searchContents;
        } catch (NullPointerException e) {
            return Collections.EMPTY_LIST;
        }
    }

    public Content updateContent(int id, String type, String title, int userId, int mediaTypeId, String description, String status) {
        try {
            for (Content content : contents) {
                if (content.getId() == id) {
                    int contentIndex = contents.indexOf(content);
                    content.setTitle(title);
                    content.setType(type);
                    content.setUserId(userId);
                    content.setMediaTypeId(mediaTypeId);
                    content.setDescription(description);
                    content.setStatus(status);
                    content.setUpdatedAt(new Date());
                    contents.set(contentIndex, content);
                    return content;
                }
            }
            return null;
        } catch (NullPointerException e) {
            return null;
        }
    }

    public boolean deleteContent(int id) {
        try {
            int contentIndex = -1;
            for (Content content : contents) {
                if (content.getId() == id) {
                    contentIndex = contents.indexOf(content);
                    break;
                }
            }
            if (contentIndex > -1) {
                contents.remove(contentIndex);
                return true;
            }
            return false;
        } catch (NullPointerException e) {
            return false;
        }
    }

}
