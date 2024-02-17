package assignments.assignment1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class OrderGeneratorTest {
    @Test
    public void testGenerateOrder() {
        assertEquals("TP", OrderGenerator.generateOrder());
    }
}
