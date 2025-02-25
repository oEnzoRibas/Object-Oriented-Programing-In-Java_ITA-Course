package ITA_POO_JAVA.Module4.Product.Project;

import java.util.Objects;

public class SizedProduct extends Product{

    protected String size;

    public SizedProduct(String name, int code, Double price, String size) {
        super(name, code, price);
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        SizedProduct that = (SizedProduct) obj;
        return super.equals(obj) && size.equals(that.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),size);
    }

    @Override
    public String toString() {
        return super.toString() + " - Tamanho: " + size;
    }

}
