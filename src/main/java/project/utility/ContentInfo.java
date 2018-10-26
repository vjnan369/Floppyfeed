package project.utility;

import project.model.Content;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContentInfo {
    List<Content> contents;

    public ContentInfo() {
        contents = new ArrayList<Content>();
        contents.add(new Content(1, "fictional", "Percy jackson and sea of monsters",
                1,
                1,
                "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page",
                "drafted",
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
        for(Content content : contents) {
            if(content.getId() == id) {
                return content;
            }
        }
        return null;
    }

    public List<Content> fetchAllContent() {
        return contents;
    }
}
