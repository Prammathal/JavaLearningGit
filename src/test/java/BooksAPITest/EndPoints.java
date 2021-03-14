package BooksAPITest;

import BooksAPITest.RequestModel.DeleteBookRequest;
import BooksAPITest.ResponseModel.AddBookResponse;
import BooksAPITest.ResponseModel.DeleteBookResponse;
import BooksAPITest.ResponseModel.GetBookResponse;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class EndPoints
{

    public AddBookResponse addBook(Book book)
    {

            Response responseAdd = given().header("Content-Type", "application/json").
                    body(book).
                    when().
                    post("Library/Addbook.php");
            if(responseAdd.statusCode() == 200)
            {
                return responseAdd.then().assertThat().statusCode(200).extract().response()
                        .body().as(AddBookResponse.class);
            }
            else if(responseAdd.statusCode() == 404)
            {
                return responseAdd.then().assertThat().statusCode(404).extract().response()
                        .body().as(AddBookResponse.class);
            }

        return responseAdd.then().assertThat().statusCode(200).extract().response()
                .body().as(AddBookResponse.class);

    }

    public GetBookResponse GetBook(String id) {
        Response getBookResponse = given().queryParam("ID", id).
                header("Content-Type", "application/json").
                when().
                get("Library/GetBook.php");
        if(getBookResponse.statusCode() == 200)
        {
            return getBookResponse.then().statusCode(200).extract().response()
                    .body().as(GetBookResponse[].class)[0];
        }
        else if(getBookResponse.statusCode() == 404)
        {
            return getBookResponse.then().statusCode(404).extract().response()
                    .body().as(GetBookResponse.class);
        }

        return getBookResponse.then().statusCode(200).extract().response()
                .body().as(GetBookResponse[].class)[0];

    }

    public DeleteBookResponse DeleteBook(String id)
    {
        DeleteBookRequest deleteReq=new DeleteBookRequest();
        deleteReq.setId(id);
        Response deleteResponse= given().
                header("Content-Type","application/json").
                body(deleteReq).
                when().
                delete("Library/DeleteBook.php").
                then().
                statusCode(200).
                extract().
                response();
        DeleteBookResponse deletedBook=deleteResponse.as(DeleteBookResponse.class);
        return deletedBook;
    }

    public GetBookResponse[] GetBooksByAuthorName(String authorName)
    {
        GetBookResponse[] books =  given().queryParam("AuthorName", authorName).
                header("Content-Type", "application/json").
                when().
                get("Library/GetBook.php").
                then().statusCode(200).extract().response()
            .body().as(GetBookResponse[].class);

        return books;

    }
}
