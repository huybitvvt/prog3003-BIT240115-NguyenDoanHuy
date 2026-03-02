package bai2;

public class Main {

    public static void main(String[] args) {

        Payment p1 = PaymentFactory.createPayment("credit");
        p1.pay(1000);

        Payment p2 = PaymentFactory.createPayment("paypal");
        p2.pay(500);

        Payment p3 = PaymentFactory.createPayment("cash");
        p3.pay(200);
    }
}
