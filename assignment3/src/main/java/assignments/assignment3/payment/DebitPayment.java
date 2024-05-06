package assignments.assignment3.payment;

public class DebitPayment implements DepeFoodPaymentSystem {
    private static final double MINIMUM_PAYMENT = 50000;

    @Override
    public long processPayment(long saldo, long amount) throws Exception {
        if (amount < MINIMUM_PAYMENT) {
            throw new Exception("Jumlah pesanan < 50000 mohon menggunakan metode pembayaran yang lain");
        }

        if (saldo < amount) {
            throw new Exception("Saldo tidak mencukupi mohon menggunakan metode pembayaran yang lain");
        }

        return amount;
    }
}