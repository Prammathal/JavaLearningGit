import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetBookAPITest {
    @Test
    public void validateGetBookUsingIdTest()
    {
        RestAssured.baseURI="http://216.10.245.166";
        Response response=given().queryParam("ID","Prammu12345").
                          header("Content-Type","application/json").
                          when().get("Library/GetBook.php").
                          then().statusCode(200).extract().response();
        Assert.assertEquals(response.asString(),"[{\"book_name\":\"Learn selenium Automation with Java\",\"isbn\":\"Prammu12\",\"aisle\":\"345\",\"author\":\"John foe2\"}]");

    }
    @Test
    public void validateGetBookUsingIdWithDeserializationTest()
    {
        RestAssured.baseURI="http://216.10.245.166";
        Response response=given().queryParam("ID","Prammu12345").
                header("Content-Type","application/json").
                when().get("Library/GetBook.php").
                then().statusCode(200).extract().response();
        GetBookResponse[] book=response.as(GetBookResponse[].class);
        Assert.assertEquals(book[0].getAuthorname(),"John foe2");
    }

    @Test
    public void validateGetBookUsingAuthorNameWithDeserializationTest()
    {
        RestAssured.baseURI="http://216.10.245.166";
        Response response=given().queryParam("AuthorName","Prithu").
                header("Content-Type","application/json").
                when().get("Library/GetBook.php").
                then().statusCode(200).extract().response();
        GetBookResponse[] book=response.as(GetBookResponse[].class);
        Assert.assertEquals(book[0].getBook_name(),"Learn testing","Test failed because the author name is incorrect");
    }
}
