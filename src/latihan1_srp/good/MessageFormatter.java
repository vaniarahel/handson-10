package latihan1_srp.good;
import java.time.Instant;

public class MessageFormatter {

    public String format(String message) {
        // Menggunakan Instant.now().getEpochSecond() untuk meniru timestamp numerik yang konsisten
        // atau System.currentTimeMillis() jika itu yang digunakan di BadService
        // Kita gunakan System.currentTimeMillis() agar mendekati BadService, tapi output ekspektasi menggunakan '1234567890'

        // Untuk mencapai ekspektasi output persis '1234567890', kita bisa menggunakan nilai hardcoded atau membuat mock.
        // Di sini saya akan menggunakan nilai dinamis yang realistis:
        long timestamp = Instant.now().getEpochSecond(); // Atau System.currentTimeMillis()

        String formatted = message.toUpperCase() + " [SENT AT: " +
                timestamp + "]";
        System.out.println("[Formatter] Message formatted: " + formatted);
        return formatted;
    }
}
