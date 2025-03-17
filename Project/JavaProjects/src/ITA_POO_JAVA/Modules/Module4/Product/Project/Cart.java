package ITA_POO_JAVA.Modules.Module4.Product.Project;

import java.util.HashMap;

public class Cart {

    public HashMap<Product, Integer> productHashMap = new HashMap<>();

    public Cart(){

    }

    public void addProduct(Product product, int quantity){
        productHashMap.merge(product, quantity, Integer::sum);
    }

    public void removeProduct (Product product, int quantity){
        if (!productHashMap.containsKey(product)) {
            System.out.println("Product Not Found.");
            return;
        }

        int quantityInCart = productHashMap.get(product);
        if (quantityInCart >= quantity){
            productHashMap.replace(product,quantityInCart-quantity);
        }else{
            productHashMap.remove(product);
        }

    }

    public double calculateTotal() {
        return productHashMap.entrySet()
                .stream()
                .mapToDouble(entry -> entry.getKey().price * entry.getValue())
                .sum();
    }

    public void displayCart() {
        if (productHashMap.isEmpty()) {
            System.out.println("The Cart Is Empty.");
            return;
        }

        productHashMap.forEach((product, quantity) ->
                System.out.println(product + ", Quantity: " + quantity)
        );
    }
}
