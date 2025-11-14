package latihan1_srp.good;

public class MessageValidator {

    public void validate(String message) {
        if (message == null || message.trim().isEmpty()) {
            // Menggunakan message yang lebih spesifik sesuai ekspektasi output
            throw new IllegalArgumentException("[Validator] Error: Message cannot be null or empty.");
        }
        System.out.println("[Validator] Message validated successfully");
    }
}
