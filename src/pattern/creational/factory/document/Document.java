package pattern.creational.factory.document;

public abstract class Document {
    private String title;
    private String date;
    private String text;
    private int priority;

    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String newDate) {
        date = newDate;
    }

    public String getText() {
        return text;
    }

    public void setText(String newText) {
        text = newText;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int newPriority) {
        priority = newPriority;
    }

    public void printContent(){
        System.out.println(getTitle() + " has priority " + getPriority() + "; Content: " + getText() + "\n"+getDate());
    }
}
