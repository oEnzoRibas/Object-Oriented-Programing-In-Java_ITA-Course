package ITA_POO_JAVA.Module4.Product.Project;

import java.util.Objects;

public class Product {
    protected String name;
    protected int code;
    protected Double price;

    public Product(String name, int code, Double price) {
        this.name = name;
        this.code = code;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Product product = (Product) obj;
        return code == product.code && Objects.equals(name, product.name) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,code);
    }

    @Override
    public String toString() {
        return String.format("Produto: %s (Código: %d, Preço: R$%.2f)", name, code, price);
    }

}
