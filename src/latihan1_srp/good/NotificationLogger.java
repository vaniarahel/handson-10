package latihan1_srp.good;

public class NotificationLogger {

    public void log(String type, String recipient) {
        // Recipient tidak diminta di ekspektasi output, jadi kita sesuaikan dengan ekspektasi.
        System.out.println("[Logger] LOG: Notification sent - Type: " + type);
    }
}
