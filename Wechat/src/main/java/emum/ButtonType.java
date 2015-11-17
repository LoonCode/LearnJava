package emum;

/**
 * Created by Loon on 2015/11/17.
 */
public enum  ButtonType {
    CLICK("CLICK"), VIEW("VIEW"), MEDIAID("MEDIA_ID");

    private String type;

    ButtonType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
