package pattern.behavioral.mediator.chat;

public class SimpleChatApplication {
    public SimpleChatApplication() {
        SimpleTextChat stc = new SimpleTextChat();
        User admin = new Admin(stc, "Admin");

        User user1 = new SimpleUser(stc, "Bob");
        User user2 = new SimpleUser(stc, "Jake");
        User user3 = new SimpleUser(stc, "Lana");


        stc.setAdmin(admin);
        stc.addUserToChat(user1);
        stc.addUserToChat(user2);
        stc.addUserToChat(user3);

        user1.sendMessage("Hi!");
        user2.sendMessage("Hi, Bob");
        admin.sendMessage("Note: no spam!");
    }
}
