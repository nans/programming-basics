package pattern.behavioral.mediator.chat;

public interface User {
    public void sendMessage(String message);
    public void getMessage(String message);
    public String getName();
}
