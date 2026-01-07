package classAndOop.marketplace;

import java.util.UUID;

public class Clothing extends Product {
    public Clothing(UUID id, String name, double price) {
        super(id, name, price);
    }

    //скидка 15% при покупке свыше $50
    @Override
    public void applyDiscount() {
        if (getPrice() > 50) {
            setPrice(getPrice() - getPrice() * 0.15);
        }
    }
}
