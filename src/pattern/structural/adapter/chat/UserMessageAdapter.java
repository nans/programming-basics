package pattern.structural.adapter.chat;

public class UserMessageAdapter implements Message {

    private EncryptedUserMessage message;

    public UserMessageAdapter(EncryptedUserMessage message) {
        this.message = message;
    }

    public void printContent() {
        message.printDecryptedContent();
    }


    public void setContent(String text) {
        message.setDecryptedContent(text);
    }
}
