package project.services;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import project.model.Content;

import java.util.*;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class ManageContentServiceImplTest {

    @Parameterized.Parameters
    public static Collection<Object[]> contentData() {
        return Arrays.asList(new Object[][]{
                {1, new Content(1, "fictional", "Percy jackson and sea of monsters",
                        1,
                        1,
                        "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page",
                        "drafted",
                        new Date(),
                        new Date(),
                        new Date()
                ).toString()}
        });
    }

    @Test
    @Parameters(method = "contentData")
    public void getContentById(int id, String content) {
        ManageContentServiceImpl manageContentService = new ManageContentServiceImpl();
        assertEquals(content, manageContentService.getContentById(id).toString());
    }


    @Parameterized.Parameters
    public static Collection<Object[]> allContentData() {
        List<Content> contents = new ArrayList<Content>();
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
        return Arrays.asList(new Object[][]{
                {contents.toString()}

        });
    }

    @Test
    @Parameters(method = "allContentData")
    public void fetchAllContent(String content) {
        ManageContentServiceImpl manageContentService = new ManageContentServiceImpl();
        assertEquals(content, manageContentService.fetchAllContent().toString());
    }
}
