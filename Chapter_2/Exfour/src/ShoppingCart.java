public class ShoppingCart {

    private PaymentStrategy paymentMethod;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentMethod = strategy;
    }

    public void checkout(int amount) {
        paymentMethod.pay(amount);
    }
}
