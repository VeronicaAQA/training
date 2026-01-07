package classAndOop.marketplace;

import java.util.UUID;

public class Admin extends User {
    public Admin(UUID id, String name, String email) {
        super(id, name, email);
    }

    //добавляет метод для изменения цены товара
    public void changePrice(Product product, double price) {
        product.setPrice(price);
    }
}
