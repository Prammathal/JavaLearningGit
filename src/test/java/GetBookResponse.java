import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetBookResponse {
    String book_name;
    String isbn;
    String aisle;
    String author_name;

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAisle(String aisle) {
        this.aisle = aisle;
    }
@JsonProperty("author")
    public void setAuthorname(String author_name) {
        this.author_name = author_name;
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

    public String getAuthorname() {
        return author_name;
    }
}
