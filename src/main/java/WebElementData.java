public class WebElementData {
    private String tagName;
    private String text;

    public WebElementData() {
    }

    public WebElementData(String tagName, String text) {
        this.tagName = tagName;
        this.text = text;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
