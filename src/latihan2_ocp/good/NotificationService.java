package latihan2_ocp.good;

import java.util.List;

// Class ini TIDAK PERLU DIMODIFIKASI ketika ada channel baru
public class NotificationService { // <-- Hanya satu definisi public class

    private final List<NotificationSender> senders;

    public NotificationService(List<NotificationSender> senders) {
        this.senders = senders;
    }

    public void sendNotification(String message, String recipient) {
        // Loop through semua registered senders
        for (NotificationSender sender : senders) {
            sender.send(recipient, message);
        }
    }
}