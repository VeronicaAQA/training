package classAndOop.marketplace;

public interface DatabaseOperations {
    public void saveOrder(Order order);

    public Order getOrder(int orderId);
}
