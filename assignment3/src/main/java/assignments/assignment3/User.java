package assignments.assignment3;

import java.util.ArrayList;
import java.util.List;

import assignments.assignment3.payment.DepeFoodPaymentSystem;

public class User {

    private String nama;
    private String nomorTelepon;
    private String email;
    public final String role;
    private String lokasi;

    private DepeFoodPaymentSystem paymentSystem;
    private long saldo;
    private ArrayList<Order> orderHistory;

    public User(String nama, String nomorTelepon, String email, String lokasi, String role,
            DepeFoodPaymentSystem paymentSystem, long saldo) {
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
        this.lokasi = lokasi;
        this.role = role;
        this.paymentSystem = paymentSystem;
        this.saldo = saldo;
        orderHistory = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }

    public String getNama() {
        return nama;
    }

    public String getLokasi() {
        return lokasi;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public long getSaldo() {
        return saldo;
    }

    public String getRole() {
        return role;
    }

    public DepeFoodPaymentSystem getPaymentSystem() {
        return paymentSystem;
    }

    public void addOrderHistory(Order order) {
        orderHistory.add(order);
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }

    public boolean isOrderBelongsToUser(String orderId) {
        for (Order order : orderHistory) {
            if (order.getOrderId().equals(orderId)) {
                return true;
            }
        }
        return false;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return String.format("User dengan nama %s dan nomor telepon %s", nama, nomorTelepon);
    }

}
