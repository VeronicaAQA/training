package classAndOop.mall;

public class ItemMain {
    public static void main(String[] args) {
        Item item = new Item("черная ручка", 150.8, 23);
        System.out.println(item.restock(23));
        System.out.println(item.sell(47));
        System.out.println(item.getInfo());
    }
}
