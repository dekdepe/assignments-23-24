package assignments.assignment1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class OrderGeneratorTest {
    @Test
    public void testGenerateOrderID1() {
        assertEquals("HOLY1802202453C3", OrderGenerator.generateOrderID("Holycow!", "18/02/2024", "9928765403"));
    }

    @Test
    public void testGenerateBill1() {
        String solution = "Bill:\n" + //
                "Order ID: HOLY1802202453C3\n" + //
                "Tanggal Pemesanan: 18/02/2024\n" + //
                "Lokasi Pengiriman: S\n" + //
                "Biaya Ongkos Kirim: Rp 40.000\n" + //
                "";
        assertEquals(solution, OrderGenerator.generateBill("HOLY1802202453C3", "S"));
    }
}
