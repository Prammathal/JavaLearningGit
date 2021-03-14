package BooksAPITest;

import java.util.Random;
import BooksAPITest.EndPoints;
import BooksAPITest.ResponseModel.AddBookResponse;

public class Helper
{
    public AddBookResponse[] addBooksWithSameAuthorName(String authorName, int noOfBooks)
    {
        EndPoints endPoints = new EndPoints();
        AddBookResponse[] newBooksAddedResponse = new AddBookResponse[noOfBooks];
        for (int i = 0; i<noOfBooks; i++)
        {
            Book book = createNewBookRequest(authorName);
            AddBookResponse bookResponse = endPoints.addBook(book);
            newBooksAddedResponse[i] = bookResponse;
        }
        return newBooksAddedResponse;
    }
    public Book createNewBookRequest(String isbn,String aisle,String authorName,String bookName)
    {
        Book request=new Book();
        request.setBook_name(bookName);
        request.setAuthor_name(authorName);
        request.setIsbn(isbn);
        request.setAisle(aisle);
        return request;
    }

    public Book createNewBookRequest(String authorName)
    {
        Random r=new Random();

        String isbn = String.valueOf(r.nextInt(200));
        String aisle = String.valueOf(r.nextInt(400));
        Book request=new Book();
        request.setBook_name("Automation testing "+r.nextInt(100));
        request.setAuthor_name(authorName);
        request.setIsbn(isbn);
        request.setAisle(aisle);
        return request;
    }
}
