package ITA_POO_JAVA.Module4.Product.Tests;

import ITA_POO_JAVA.Module4.Product.Project.SizedProduct;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SizedProductTest {

    @Test
    void testEquals_SameObject() {
        SizedProduct product = new SizedProduct("Shirt", 101, 19.99, "M");
        assertTrue(product.equals(product));
    }

    @Test
    void testEquals_NullObject() {
        SizedProduct product = new SizedProduct("Shirt", 101, 19.99, "M");
        assertFalse(product.equals(null));
    }

    @Test
    void testEquals_DifferentClass() {
        SizedProduct sizedProduct = new SizedProduct("Shirt", 101, 19.99, "M");
        Object other = new Object();
        assertFalse(sizedProduct.equals(other));
    }

    @Test
    void testEquals_DifferentSizedProduct() {
        SizedProduct product1 = new SizedProduct("Shirt", 101, 19.99, "M");
        SizedProduct product2 = new SizedProduct("Shirt", 101, 19.99, "L");
        assertFalse(product1.equals(product2));
    }

    @Test
    void testEquals_DifferentName() {
        SizedProduct product1 = new SizedProduct("Shirt", 101, 19.99, "M");
        SizedProduct product2 = new SizedProduct("Pants", 101, 19.99, "M");
        assertFalse(product1.equals(product2));
    }

    @Test
    void testEquals_DifferentCode() {
        SizedProduct product1 = new SizedProduct("Shirt", 101, 19.99, "M");
        SizedProduct product2 = new SizedProduct("Shirt", 102, 19.99, "M");
        assertFalse(product1.equals(product2));
    }

    @Test
    void testEquals_DifferentPrice() {
        SizedProduct product1 = new SizedProduct("Shirt", 101, 19.99, "M");
        SizedProduct product2 = new SizedProduct("Shirt", 101, 24.99, "M");
        assertTrue(product1.equals(product2));
    }

    @Test
    void testEquals_SameAttributes() {
        SizedProduct product1 = new SizedProduct("Shirt", 101, 19.99, "M");
        SizedProduct product2 = new SizedProduct("Shirt", 101, 19.99, "M");
        assertTrue(product1.equals(product2));
    }
}