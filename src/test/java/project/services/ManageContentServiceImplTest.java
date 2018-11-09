//package project.services;
//
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.Arguments;
//import org.junit.jupiter.params.provider.MethodSource;
//import project.model.Content;
//
//import java.util.*;
//import java.util.stream.Stream;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//public class ManageContentServiceImplTest {
//    static int id;
//    static String type;
//    static String title;
//    static int userId;
//    static int mediaTypeId;
//    static String description;
//    static String status;
//    static Date createdAt;
//    static Date updatedAt;
//    static Date publishedAt;
//    static Content content;
//    static List<Content> contents = new ArrayList<>();
//
//    // Initializing all variables
//    @BeforeAll
//    static void initializeAll() {
//        id = 1;
//        type = "fictional";
//        title = "Percy jackson and sea of monsters";
//        userId = 1;
//        mediaTypeId = 1;
//        description = "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page";
//        status = "published";
//        createdAt = new Date();
//        updatedAt = new Date();
//        publishedAt = new Date();
//        content = new Content(id,
//                type,
//                title,
//                userId,
//                mediaTypeId,
//                description,
//                status,
//                publishedAt,
//                createdAt,
//                updatedAt
//        );
//        contents.add(content);
//        contents.add(new Content(2, "political", "hello world , test data",
//                2,
//                2,
//                "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page",
//                "drafted",
//                new Date(),
//                new Date(),
//                new Date()
//        ));
//        contents.add(new Content(3, "novel", "it is a novel content",
//                3,
//                3,
//                "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page",
//                "drafted",
//                new Date(),
//                new Date(),
//                new Date()
//        ));
//        contents.add(new Content(4, "auto-biography", "its a autobiography",
//                4,
//                4,
//                "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page",
//                "drafted",
//                new Date(),
//                new Date(),
//                new Date()
//        ));
//        contents.add(new Content(5, "regional", "testing regional content",
//                5,
//                5,
//                "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page",
//                "drafted",
//                new Date(),
//                new Date(),
//                new Date()
//        ));
//    }
//
//
//    // Test case for getContentById method
//    @ParameterizedTest
//    @MethodSource("getContentByIdTestData")
//    public void getContentById(int id, Optional<Content> expectedResult) {
//        ManageContentServiceImpl manageContentService = new ManageContentServiceImpl();
//        assertTrue(expectedResult.equals(manageContentService.getContentById(id)));
//    }
//
//    static Stream<Arguments> getContentByIdTestData() {
//        return Stream.of(
//                Arguments.of(1, Optional.of(content)),
//                Arguments.of(-1, Optional.empty())
//        );
//    }
//
//
//    // Test case for fetchAllContent method
//    @Test
//    public void fetchAllContent() {
//        ManageContentServiceImpl manageContentService = new ManageContentServiceImpl();
//        assertEquals(contents.toString(), manageContentService.fetchAllContent().toString());
//    }
//
//
//    // Test case for creatContent method
//    @ParameterizedTest
//    @MethodSource("createContentTestData")
//    public void createContent(String type, String title, int userId, int mediaTypeId, String description, String status, Date publishedAt, Date createdAt, Date updatedAt, Content content) {
//        ManageContentServiceImpl manageContentService = new ManageContentServiceImpl();
//        assertTrue(Optional.of(content).equals(manageContentService.createContent(type, title, userId, mediaTypeId, description, status, publishedAt, createdAt, updatedAt)));
//    }
//
//
//    static Stream<Arguments> createContentTestData() {
//        return Stream.of(
//                Arguments.of(type, title, userId, mediaTypeId, description, status, publishedAt, createdAt, updatedAt, content)
//        );
//    }
//
//
//    // Test case for searchContent method
//    @ParameterizedTest
//    @MethodSource("searchContentTestData")
//    public void searchContent(String searchText, List<Content> expectedResult) {
//        ManageContentServiceImpl manageContentService = new ManageContentServiceImpl();
//        assertEquals(expectedResult, manageContentService.searchContent(searchText));
//    }
//
//    static Stream<Arguments> searchContentTestData() {
//        List<Content> searchContents = new ArrayList<>();
//        searchContents.add(content);
//        return Stream.of(
//                Arguments.of("jackson", searchContents),
//                Arguments.of("yrotsnwonknusti", Collections.emptyList())
//        );
//    }
//
//
//    // Test case for update content
//    @ParameterizedTest
//    @MethodSource("updateContentTestData")
//    public void updateContent(int id, String type, String title, int userId, int mediaTypeId, String description, String status, boolean expectedResult) {
//        ManageContentServiceImpl manageContentService = new ManageContentServiceImpl();
//        assertEquals(expectedResult, manageContentService.updateContent(id, type, title, userId, mediaTypeId, description, status));
//    }
//
//    static Stream<Arguments> updateContentTestData() {
//        return Stream.of(
//                Arguments.of(id, type, title, userId, mediaTypeId, description, status, true),
//                Arguments.of(-1, type, title, userId, mediaTypeId, description, status, false)
//        );
//    }
//
//
//    //Test case for delete content
//    @ParameterizedTest
//    @MethodSource("deleteContentTestData")
//    public void deleteContent(int id, boolean expectedResult) {
//        ManageContentServiceImpl manageContentService = new ManageContentServiceImpl();
//        assertEquals(expectedResult, manageContentService.deleteContent(id));
//    }
//
//    static Stream<Arguments> deleteContentTestData() {
//        return Stream.of(
//                Arguments.of(1, true),
//                Arguments.of(2, true),
//                Arguments.of(-1, false)
//        );
//    }
//}
