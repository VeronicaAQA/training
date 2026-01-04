package classAndOop.product;

import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private int id;

    public Product() {
    }

    public Product(String name, double price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (o == null || o.getClass() != getClass())
            return false;
        Product other = (Product) o;
        return Objects.equals(id, other.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return ("Продукт " + name + " по цене " + price + " с id = " + id);
    }

    @Override
    public Product clone() {
        return (new Product(name, price, id));
    }

    public static void main(String[] args) {
        Product product = new Product("шар", 230, 33);
        Product product2 = product.clone();
        System.out.println(product2.toString());
    }
}
