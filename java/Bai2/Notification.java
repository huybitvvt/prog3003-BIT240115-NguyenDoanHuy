package Bai2;

public class Notification {
    private MessageService messageService;

    // Setter Injection
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser(String message) {
        if (messageService != null) {
            messageService.sendMessage(message);
        } else {
            System.out.println("chưa thiết lập dịch vụ gửi tin nhắn");
        }
    }
}
