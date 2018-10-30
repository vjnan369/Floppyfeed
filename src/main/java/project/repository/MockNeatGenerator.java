package project.repository;

import net.andreinc.mockneat.MockNeat;

public class MockNeatGenerator {
    MockNeat mock = MockNeat.threadLocal();
    int number = mock.ints().val();
    String title = mock.words().val();
    String status = "drafted";
    String mediaType = "text";
    String type = "fictional";
    String description = mock.words().val();
    int getUserId() {
        return this.number;
    }

    int getMediaTypeId() {
        return this.number;
    }

    String getTitle() {
        return this.title;
    }

    String getType() {
        return this.type;
    }

    String getDescription() {
        return description;
    }

    String getStatus() {
        return status;
    }

}
