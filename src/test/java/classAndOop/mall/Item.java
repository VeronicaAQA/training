package classAndOop.mall;

public class Item {
    String name;
    double price;
    int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //уменьшает количество на складе на заданное значение, если достаточно товара
    public int sell(int amount) {
        if (quantity >= amount) {
            return quantity -= amount;
        } else {
            System.out.print("Недостаточное количество, количество не изменилось ");
            return quantity;
        }
    }

    //добавляет указанное количество на склад
    public int restock(int amount) {
        return quantity += amount;
    }

    //возвращает строку с информацией о товаре
    public String getInfo() {
        return "Товар " + name + " по цене " + price + " в количестве " + quantity;
    }
}
