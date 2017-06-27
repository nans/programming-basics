package pattern.structural.adapter.chat;

public class ChatApplication {
    public ChatApplication(){
        UserMessage firstMessage = new UserMessage();
        firstMessage.setContent("Text for test.");
        firstMessage.printContent();

        EncryptedUserMessage secondMessage = new EncryptedUserMessage();
        secondMessage.setDecryptedContent("Text for test.");
        secondMessage.printDecryptedContent();

        Message userMessage = new UserMessageAdapter(secondMessage);
        userMessage.printContent();
    }
}
