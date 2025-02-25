package ITA_POO_JAVA.Module4.Purchase.Tests;

import ITA_POO_JAVA.Module4.Purchase.Project.Purchase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PurchaseTest {

    Purchase purchase;
    @BeforeEach
    void setUp() {
        purchase = new Purchase(100);
    }

    @AfterEach
    void tearDown() {
        purchase = null;
    }

    @Test
    void testTotal() {
        assertEquals(100, purchase.total(), "The total method should return the initialized value.");

        purchase = new Purchase(200);
        assertEquals(200, purchase.total(), "The total method should return the updated value.");

        purchase = new Purchase(0);
        assertEquals(0, purchase.total(), "The total method for value 0 should work correctly.");

        purchase = new Purchase(-50);
        assertEquals(-50, purchase.total(), "The total method for negative values should work as expected.");
    }
}