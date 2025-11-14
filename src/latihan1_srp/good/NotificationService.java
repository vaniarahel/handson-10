package latihan1_srp.good;

public class NotificationService {

    private final MessageValidator validator;
    private final MessageFormatter formatter;
    private final EmailSender emailSender;
    private final SmsSender smsSender;
    private final NotificationLogger logger;
    private final NotificationRepository repository;

    public NotificationService(MessageValidator validator,
                               MessageFormatter formatter,
                               EmailSender emailSender,
                               SmsSender smsSender,
                               NotificationLogger logger,
                               NotificationRepository repository) {
        this.validator = validator;
        this.formatter = formatter;
        this.emailSender = emailSender;
        this.smsSender = smsSender;
        this.logger = logger;
        this.repository = repository;
    }

    public void sendNotification(String message, String type, String recipient) {
        try {
            // 1. Validate
            validator.validate(message);

            // 2. Format
            String formattedMessage = formatter.format(message);

            // 3. Send based on type
            // Menggunakan toUpperCase() untuk memastikan perbandingan
            switch (type.toUpperCase()) {
                case "EMAIL":
                    emailSender.send(recipient, formattedMessage);
                    break;
                case "SMS":
                    smsSender.send(recipient, formattedMessage);
                    break;
                default:
                    System.out.println("[NotificationService] ERROR: Unsupported notification type: " + type);
                    return;
            }

            // 4. Log
            logger.log(type, recipient);

            // 5. Save to database
            repository.save(type, recipient, formattedMessage);

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        // Tambahkan penanganan exception lain jika diperlukan
    }
}