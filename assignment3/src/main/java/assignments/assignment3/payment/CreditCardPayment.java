package assignments.assignment3.payment;

public class CreditCardPayment implements DepeFoodPaymentSystem {
    private static final double TRANSACTION_FEE_PERCENTAGE = 0.02;

    @Override
    public long processPayment(long saldo, long amount) {
        return amount + (long) (amount * TRANSACTION_FEE_PERCENTAGE);
    }
}