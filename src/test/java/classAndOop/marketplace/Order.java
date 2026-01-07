package classAndOop.marketplace;

import java.util.List;

public class Order {
    private int orderId;
    private Customer customer;
    private List<Product> productList;
    private double totalPrice;

    public Order(int orderId, Customer customer, List<Product> productList, double totalPrice) {
        this.orderId = orderId;
        this.customer = customer;
        this.productList = productList;
        this.totalPrice = totalPrice;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double totalCost() {
        totalPrice = 0;
        List<Product> products = getProductList();
        for (Product product : products) {
            product.applyDiscount();
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}
