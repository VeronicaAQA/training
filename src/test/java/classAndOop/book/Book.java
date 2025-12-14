package classAndOop.book;

public class Book {

    public String title;
    public String author;
    public int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void printInfo() {
        System.out.println("Название: " + title + " Автор: " + author + " Цена: " + price);
    }

    public static void main(String[] args) {
        Book book = new Book("Мастер и Маргарита", "М. Булгаков", 500);
        book.printInfo();
    }
}
