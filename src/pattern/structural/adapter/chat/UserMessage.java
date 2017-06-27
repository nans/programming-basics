package pattern.structural.adapter.chat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserMessage implements Message {
    private String content;
    private String date;

    public UserMessage() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        this.date = dateFormat.format(date);
    }

    public void printContent() {
        System.out.println(date + ": " + content);
    }

    public void setContent(String text) {
        content = text;
    }
}
