package ITA_POO_JAVA.Module4.Product.Tests;

import ITA_POO_JAVA.Module4.Product.Project.Cart;
import ITA_POO_JAVA.Module4.Product.Project.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CartTest {

    Cart cart;

    @BeforeEach
    public void CreateCart(){
        cart = new Cart();
    }

    @Test
    public void testAddProduct_NewProduct() {
        Product product = new Product("Apple", 101, 1.99);

        cart.addProduct(product, 5);

        assertTrue(cart.productHashMap.containsKey(product));
        assertEquals(5, cart.productHashMap.get(product));
    }

    @Test
    public void testAddProduct_ExistingProduct() {
        Product product = new Product("Apple", 101, 1.99);

        cart.addProduct(product, 5);
        cart.addProduct(product, 3);

        assertTrue(cart.productHashMap.containsKey(product));
        assertEquals(8, cart.productHashMap.get(product));
    }

    @Test
    public void testAddProduct_NegativeQuantity() {
        Product product = new Product("Apple", 101, 1.99);

        cart.addProduct(product, -3);

        assertTrue(cart.productHashMap.containsKey(product));
        assertEquals(-3, cart.productHashMap.get(product));
    }

    @Test
    public void testAddProduct_MultipleProducts() {
        Product product1 = new Product("Apple", 101, 1.99);
        Product product2 = new Product("Banana", 102, 0.99);

        cart.addProduct(product1, 5);
        cart.addProduct(product2, 10);

        assertTrue(cart.productHashMap.containsKey(product1));
        assertEquals(5, cart.productHashMap.get(product1));

        assertTrue(cart.productHashMap.containsKey(product2));
        assertEquals(10, cart.productHashMap.get(product2));
    }

    @Test
    public void testAddProduct_ZeroQuantity() {
        Product product = new Product("Orange", 103, 2.50);

        cart.addProduct(product, 0);

        assertTrue(cart.productHashMap.containsKey(product));
        assertEquals(0, cart.productHashMap.get(product));
    }
}