package bai2;

public class PaymentFactory {

    public static Payment createPayment(String type) {

        if (type.equalsIgnoreCase("credit")) {
            return new CreditCardPayment();

        } else if (type.equalsIgnoreCase("paypal")) {
            return new PayPalPayment();

        } else if (type.equalsIgnoreCase("cash")) {
            return new CashPayment();

        } else {
            throw new IllegalArgumentException("Phương thức không hợp lệ!");
        }
    }
}
