package latihan2_ocp.good;

// Implementation untuk EMAIL channel
public class EmailSender implements NotificationSender {

    @Override
    public void send(String recipient, String message) {
        System.out.println("[" + getType() + "] Sending to: " + recipient + " | Content: " + message);
    }

    @Override
    public String getType() {
        return "EMAIL";
    }
}
