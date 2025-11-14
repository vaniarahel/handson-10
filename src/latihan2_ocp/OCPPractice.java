package latihan2_ocp;

import latihan2_ocp.good.*; // Import semua class good
import java.util.*; // Import untuk List dan ArrayList

public class OCPPractice {
    public static void main(String[] args) {
        /*
         * LATIHAN 2: OPEN/CLOSED PRINCIPLE (OCP)
         * ...
         */

        // ===== PART 1: BAD PRACTICE - Melanggar OCP =====
        System.out.println("=== BAD PRACTICE: Melanggar OCP ===\n");

        // Perbaikan Syntax dan FQCN
        latihan2_ocp.bad.NotificationService badService = new latihan2_ocp.bad.NotificationService();

        // Pemanggilan yang benar (3 argumen)
        badService.sendNotification("Hello", "EMAIL", "user@example.com");
        badService.sendNotification("Hello", "SMS", "081234567890");

        System.out.println("\n--- Analisis Masalah ---");
        // ... (Analisis masalah lainnya)
        System.out.println("\n" + "=".repeat(70));

        // ===== PART 2: GOOD PRACTICE - Mengikuti OCP (Uncommented) =====
        System.out.println("\n=== GOOD PRACTICE: Mengikuti OCP ===\n");

        // UNCOMMENT CODE DI BAWAH SETELAH REFACTORING SELESAI
        // Setup senders
        List<NotificationSender> senders = new ArrayList<>();
        senders.add(new EmailSender());
        senders.add(new SmsSender());
        senders.add(new WhatsAppSender()); // NEW channel! Zero modification needed

        NotificationService goodService = new NotificationService(senders);
        // Pemanggilan yang benar (2 argumen, karena GoodService meloop semua senders)
        goodService.sendNotification("Hello", "user@example.com");

        System.out.println("\n--- Keuntungan Setelah Refactoring ---");
        // ... (Keuntungan lainnya)
    }
}