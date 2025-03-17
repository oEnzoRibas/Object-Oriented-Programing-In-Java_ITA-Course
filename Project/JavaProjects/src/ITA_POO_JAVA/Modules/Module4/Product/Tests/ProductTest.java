package ITA_POO_JAVA.Modules.Module4.Product.Tests;

import ITA_POO_JAVA.Modules.Module4.Product.Project.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    /**
     * Test class for the Product class's equals method.
     * This ensures the equals method behaves correctly when called
     * with various input scenarios, verifying the expected behavior
     * in different contexts.
     */

    @Test
    void testEqualsWithSameObject() {
        Product product = new Product("Laptop", 101, 999.99);
        assertTrue(product.equals(product), "The equals method should return true when comparing the same object.");
    }


    @Test
    void testEqualsWithDifferentCaseNames() {
        Product product1 = new Product("Laptop", 101, 999.99);
        Product product2 = new Product("Notebook", 101, 999.99);
        assertFalse(product1.equals(product2), "The equals method should return false when comparing objects with different case names.");
    }

    @Test
    void testEqualsWithNull() {
        Product product = new Product("Laptop", 101, 999.99);
        assertFalse(product.equals(null), "The equals method should return false when comparing with null.");
    }

    @Test
    void testEqualsWithDifferentClass() {
        Product product = new Product("Laptop", 101, 999.99);
        String other = "Not a Product";
        assertFalse(product.equals(other), "The equals method should return false when comparing with an object of a different class.");
    }



    @Test
    void testEqualsWithDifferentObjectDifferentCode() {
        Product product1 = new Product("Laptop", 101, 999.99);
        Product product2 = new Product("Smartphone", 102, 699.99);
        assertFalse(product1.equals(product2), "The equals method should return false when comparing objects with different codes.");
    }
}