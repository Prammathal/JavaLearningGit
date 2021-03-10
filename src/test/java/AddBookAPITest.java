import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AddBookAPITest {
    @Test
    public void verifyAddBookTest()
    {
        RestAssured.baseURI="http://216.10.245.166/";
        AddBookRequest request=new AddBookRequest();
        request.setBook_name("Learning RestAPI");
        request.setIsbn("110987");
        request.setAisle("abcd");
        request.setAuthor_name("Piyush");
        Response responseAdd=given().header("Content-Type","application/json").
                          body(request).
                          when().
                          post("Library/Addbook.php").
                          then().assertThat().statusCode(200).extract().response();
        AddBookResponse res=responseAdd.body().as(AddBookResponse.class);
        Assert.assertEquals(res.getMsg(),"successfully added");
        Assert.assertEquals(res.getID(),"110987abcd");

    }
}
