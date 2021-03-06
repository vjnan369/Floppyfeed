package project.repository;

import project.model.Content;

import java.util.*;

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

    public Optional<Content> getContentById(int id) {
        try{
            for (Content content : contents) {
                if (content.getId() == id) {
                    return Optional.of(content);
                }
            }
            return Optional.empty();
        } catch (NullPointerException e){
            return Optional.empty();
        }
    }

    public List<Content> fetchAllContent() {
        return contents;
    }

    public Optional<Content> createContent(String type, String title, int userId, int mediaTypeId, String description, String status, Date publishedAt, Date createdAt, Date updatedAt) {
        try {
            Content newContent = new Content(++generateId, type, title, userId, mediaTypeId, description, status, publishedAt, createdAt, updatedAt);
            contents.add(newContent);
            return Optional.of(newContent);
        } catch (NullPointerException e){
            return Optional.empty();
        }
    }

    public List<Content> searchContent(String searchText) {
        try {
            List<Content> searchContents = new ArrayList<>();
            for (Content content : contents) {
                if (content.getTitle().toLowerCase().contains(searchText.toLowerCase())
                        || content.getDescription().toLowerCase().contains(searchText.toLowerCase())) {
                    searchContents.add(content);
                }
            }
            return searchContents;
        } catch (NullPointerException e){
            return Collections.emptyList();
        }
    }

    public boolean updateContent(int id, String type, String title, int userId, int mediaTypeId, String description, String status) {
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
                    return true;
                }
            }
            return false;
        }catch (NullPointerException e){
            return false;
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
