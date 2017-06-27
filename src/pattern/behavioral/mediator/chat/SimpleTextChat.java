package pattern.behavioral.mediator.chat;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements Chat {
    User admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUserToChat(User user) {
        this.users.add(user);
    }

    public void sendMessage(String message, User newUser) {
        for (User user : users) {
            if (user == newUser) continue;
            user.getMessage(newUser.getName() + ": " + message);
        }
        admin.getMessage(newUser.getName() + ": " + message);
    }
}
