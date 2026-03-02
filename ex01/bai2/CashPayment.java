package bai2;

public class CashPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " bằng Cash");
    }
}
