public class Main {
    public static void main(String[] args) {
        NotificationSender sender = new NotificationSender();

        sender.setMessageService(new EmailService());
        sender.send("Hello via Email");

        sender.setMessageService(new SMSService());
        sender.send("Hello via SMS");
    }
}
