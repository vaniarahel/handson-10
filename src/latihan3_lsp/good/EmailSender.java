package latihan3_lsp.good;

// Implementation yang FOLLOWS contract
public class EmailSender extends NotificationSender {

    public EmailSender() {
        super("EMAIL");
    }

    @Override
    public boolean send(String recipient, String message) {
        // Implementasi yang follow contract
        if (recipient == null || message == null) {
            System.out.println("[EmailSender] ✗ Gagal: Recipient atau Message null.");
            return false;
        }
        System.out.println("[EmailSender] ✓ Notification sent to: " + recipient);
        return true;
    }
}