package classAndOop.marketplace;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Customer extends User {
    private List<Product> cart = new ArrayList<>();

    public Customer(UUID id, String name, String email) {
        super(id, name, email);
    }

    //метод для добавления товара в корзину cart
    public void addCart(Product product) {
        cart.add(product);
    }
}
