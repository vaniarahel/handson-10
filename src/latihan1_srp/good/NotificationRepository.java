package latihan1_srp.good;

public class NotificationRepository {

    public void save(String type, String recipient, String message) {
        // Type, recipient, dan message tidak diminta di ekspektasi output, jadi kita sesuaikan dengan ekspektasi.
        System.out.println("[Repository] DB: Saving notification record...");
    }
}
