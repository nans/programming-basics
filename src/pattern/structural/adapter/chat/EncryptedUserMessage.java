package pattern.structural.adapter.chat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EncryptedUserMessage {

    private String content;
    private String date;

    public EncryptedUserMessage() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        this.date = dateFormat.format(date);
    }

    public void printDecryptedContent() {
        System.out.println(date + ": " + decryptContent(content));
    }

    public void setDecryptedContent(String text) {
        content = encryptContent(text);
    }

    private String decryptContent(String encryptedText) {
        //decrypt content
        return encryptedText;
    }

    private String encryptContent(String decryptedText) {
        //encrypt content
        return decryptedText;
    }
}
