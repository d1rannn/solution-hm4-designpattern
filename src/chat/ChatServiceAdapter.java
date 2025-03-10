package chat;

/**
 * Adapter Class
 */
public class ChatServiceAdapter implements ChatService {
    private final LegacyChatService legacyChatService;

    public ChatServiceAdapter(LegacyChatService legacyChatService) {
        this.legacyChatService = legacyChatService;
    }

    @Override
    public void sendMessage(String message) {
        legacyChatService.sendLegacyMessage(message);
    }
}