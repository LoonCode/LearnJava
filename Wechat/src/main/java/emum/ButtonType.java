package emum;

/**
 * Created by Loon on 2015/11/17.
 */
public enum  ButtonType {
    CLICK("click"), VIEW("view"), MEDIAID("media_id");

    private String type;

    ButtonType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
