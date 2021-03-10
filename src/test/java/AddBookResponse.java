import com.fasterxml.jackson.annotation.JsonProperty;

public class AddBookResponse
{
    String Msg;
    String ID;
@JsonProperty("Msg")
    public void setMsg(String msg) {
        Msg = msg;
    }
@JsonProperty("ID")
    public void setID(String ID) {
        this.ID = ID;
    }

    public String getMsg() {
        return Msg;
    }

    public String getID() {
        return ID;
    }
}
