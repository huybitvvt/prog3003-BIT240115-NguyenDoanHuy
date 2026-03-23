package Bai2;

public class Bai2_SetterInjection {

    public static void main(String[] args) {
        Notification notification = new Notification();

        // EmailService
        notification.setMessageService(new EmailService());
        notification.notifyUser("đây là thông báo qua Email");

        // SMSService
        notification.setMessageService(new SMSService());
        notification.notifyUser("đây là thông báo qua SMS");
    }
}
