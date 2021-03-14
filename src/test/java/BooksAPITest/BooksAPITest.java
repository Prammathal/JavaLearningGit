package BooksAPITest;

import BooksAPITest.ResponseModel.AddBookResponse;
import BooksAPITest.ResponseModel.DeleteBookResponse;
import BooksAPITest.ResponseModel.GetBookResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import BooksAPITest.Helper;

import java.util.Random;

import static io.restassured.RestAssured.given;

public class BooksAPITest {
    private EndPoints endPoints;
    private Helper helper;

    @BeforeTest
    public void setUp()
    {
        RestAssured.baseURI="http://216.10.245.166/";
        endPoints = new EndPoints();
        helper = new Helper();
    }
    @Test
    public void verifyAddNewBookAPITest()
    {
        Book newBookRequest = helper.createNewBookRequest("Amar");

        AddBookResponse res =  endPoints.addBook(newBookRequest);

        Assert.assertEquals(res.msg,"successfully added");

    }
    @Test
    public void verifyAlreadyAddedBookAPITest() {

        Book request=new Book();
        request.setBook_name("Automation testing");
        request.setAuthor_name("Amar");
        request.setIsbn("772172");
        request.setAisle("09811");

        AddBookResponse addBookResponse = endPoints.addBook(request);
        Assert.assertEquals(addBookResponse.msg, "Add Book operation failed, looks like the book already exists");

    }
    @Test
    public void verifyAddAndGetBookAPITest()
    {
        Book newBookRequest = helper.createNewBookRequest("Amar");
        AddBookResponse res =  endPoints.addBook(newBookRequest);
        Assert.assertEquals(res.msg,"successfully added");
        GetBookResponse book = endPoints.GetBook(res.id);
        Assert.assertEquals(book.getAuthorName(),"Amar","Test failed ,Author name is not correct");
    }

    @Test
    public void verifyAddGetDeleteAndAddAgainBookAPITest()
    {
        Book newBookRequest = helper.createNewBookRequest("Amar");
        AddBookResponse addResponse =  endPoints.addBook(newBookRequest);
        Assert.assertEquals(addResponse.msg,"successfully added");

        GetBookResponse book = endPoints.GetBook(addResponse.id);
        Assert.assertEquals(book.getAuthorName(),"Amar","Test failed ,Author name is not correct");
        String iSBN=book.getIsbn();
        String aisel=book.getAisle();
        String authorName=book.getAuthorName();
        String bookName=book.getBook_name();
        DeleteBookResponse deleteResponse =  endPoints.DeleteBook(addResponse.id);
        Assert.assertEquals(deleteResponse.getMsg(),"book is successfully deleted");

        GetBookResponse deletedBook = endPoints.GetBook(addResponse.id);
        Assert.assertEquals(deletedBook.getMsg(),"The book by requested bookid / author name does not exists!");

        Book newBookRequestAfterDelete = helper.createNewBookRequest(iSBN,aisel,authorName,bookName);
        AddBookResponse addResponseAfterDelete =  endPoints.addBook(newBookRequestAfterDelete);
        Assert.assertEquals(addResponseAfterDelete.msg,"successfully added");

    }
    @Test
    public void validateBookByAuthorNameAPITest()
    {
        String authorName = "BoxomPr";
        helper.addBooksWithSameAuthorName(authorName,3);

        GetBookResponse[] books = endPoints.GetBooksByAuthorName(authorName);

        for (GetBookResponse book : books
        ) {
            System.out.println(book.getBook_name());

        }
        Assert.assertEquals(books.length,3);


    }

    @Test
    public void validateBookByAuthorNameAndDeleteBookAPITest()
    {
        helper.addBooksWithSameAuthorName("boxomTest11",3);

        GetBookResponse[] books = endPoints.GetBooksByAuthorName("boxomTest11");

        AddBookResponse boomBookResponse =  helper.addBooksWithSameAuthorName("boom",1)[0];
        DeleteBookResponse deleteResponse =  endPoints.DeleteBook(boomBookResponse.id);

        Assert.assertEquals(books.length,3);
        for (GetBookResponse book : books) {
        System.out.println(book.getBook_name());

    }


    }



}
