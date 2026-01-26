public class NotificationSender {

    private MessageService service;

    public void setMessageService(MessageService service) {
        this.service = service;
    }

    public void send(String message) {
        service.sendMessage(message);
    }
}
