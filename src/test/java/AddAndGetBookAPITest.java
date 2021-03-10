import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class AddAndGetBookAPITest {
    @Test
    public void verifyAddAndGetBookAPITest()
    {
        RestAssured.baseURI="http://216.10.245.166";
        AddBookRequest request=new AddBookRequest();
        request.setBook_name("Selenium Automation testing");
        request.setAuthor_name("Amar");
        request.setIsbn("89jd37228");
        request.setAisle("4565");
        Response response=given().header("Content-Type","application/json").
                          body(request).
                          when().
                          post("Library/Addbook.php").
                          then().
                          assertThat().
                          statusCode(200).
                          extract().response();
        AddBookResponse addbookresponse=response.body().as(AddBookResponse.class);
       Response getBookResponse=given().queryParam("ID",addbookresponse.getID()).
                                header("Content-Type","application/json").
                                when().
                                get("Library/GetBook.php").
                                then().
                                statusCode(200).
                                extract().
                                response();
       GetBookResponse[] book=getBookResponse.as(GetBookResponse[].class);
        Assert.assertEquals(book[0].author_name,"Amar","Test failed ,Author name is not correct");
    }
}
