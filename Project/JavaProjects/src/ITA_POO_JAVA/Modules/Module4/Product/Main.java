package ITA_POO_JAVA.Modules.Module4.Product;


import ITA_POO_JAVA.Modules.Module4.Product.Project.Cart;
import ITA_POO_JAVA.Modules.Module4.Product.Project.Product;
import ITA_POO_JAVA.Modules.Module4.Product.Project.SizedProduct;

public class Main {
    public static void main(String[] args) {

    Cart carrinho = new Cart();
    Product shirt = new Product("shirt", 101, 49.99);

    SizedProduct Shoes42 = new SizedProduct("Shoes", 102, 199.99, "42");
    SizedProduct Shoes43 = new SizedProduct("Shoes", 102, 199.99, "43");


        carrinho.addProduct(shirt, 2);
        carrinho.addProduct(Shoes42, 1);
        carrinho.addProduct(Shoes43, 3);

        System.out.println("Cart after adds:");
        carrinho.displayCart();

        carrinho.removeProduct(Shoes43, 1);

        System.out.println("\nCart after removes:");
        carrinho.displayCart();

        System.out.printf("\nTotal: R$%.2f%n", carrinho.calculateTotal());

    }
}

