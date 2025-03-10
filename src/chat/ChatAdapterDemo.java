package chat;

public class ChatAdapterDemo {
    public static void main(String[] args) {
        LegacyChatService legacyService = new LegacyChatService();
        ChatService chatService = new ChatServiceAdapter(legacyService);
        chatService.sendMessage("Hello world!");
    }
}