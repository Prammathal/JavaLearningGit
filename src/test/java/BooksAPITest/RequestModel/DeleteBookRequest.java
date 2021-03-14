package BooksAPITest.RequestModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeleteBookRequest {
    @JsonProperty("ID")
    String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
