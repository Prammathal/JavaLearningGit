package BooksAPITest.ResponseModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetBookResponse {
    String book_name;
    String isbn;
    String aisle;
    @JsonProperty("author")
    String authorName;

    String msg;

    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAisle(String aisle) {
        this.aisle = aisle;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBook_name() {
        return book_name;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAisle() {
        return aisle;
    }

    public String getAuthorName() {
        return authorName;
    }


}
