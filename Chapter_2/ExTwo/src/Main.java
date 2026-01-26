public class Main {
    public static void main(String[] args) {
        Notification n1 = NotificationFactory.createNotification("email");
        Notification n2 = NotificationFactory.createNotification("sms");

        n1.notifyUser();
        n2.notifyUser();
    }
}
