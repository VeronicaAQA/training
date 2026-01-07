package classAndOop.marketplace;

import java.util.UUID;

public class Electronics extends Product {
    public Electronics(UUID id, String name, double price) {
        super(id, name, price);
    }

    //скидка 10% при покупке свыше $100
    @Override
    public void applyDiscount() {
        if (getPrice() > 100) {
            setPrice(getPrice() - getPrice() * 0.1);
        }
    }
}
