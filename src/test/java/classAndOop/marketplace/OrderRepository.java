package classAndOop.marketplace;

import java.util.HashMap;
import java.util.Map;

public class OrderRepository implements DatabaseOperations {
    private Map<Integer, Order> dataBase = new HashMap<>();

    @Override
    public void saveOrder(Order order) {
        dataBase.put(order.getOrderId(), order);
    }

    @Override
    public Order getOrder(int orderId) {
        return dataBase.get(orderId);
    }
}
