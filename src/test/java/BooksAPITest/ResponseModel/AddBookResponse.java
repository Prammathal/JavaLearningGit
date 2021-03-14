package BooksAPITest.ResponseModel;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AddBookResponse
{
   @JsonAlias({"Msg","msg"})
    public String msg;
    @JsonAlias({"id","ID"})
    public String id;

}
