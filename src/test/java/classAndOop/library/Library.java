package classAndOop.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addedBook(String title, String author, int yearPublished, boolean isAvailable) {
        Book book = new Book(title, author, yearPublished, isAvailable);
        books.add(book);
    }

    public String findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book.getBookInfo();
            }
        }
        return ("Нет такой книги в библиотеке");
    }

    public List<Book> getAllBooksIsAvailable() {
        List<Book> allBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.isAvailable()) {
                allBooks.add(book);
            }
        }
        if (allBooks.isEmpty()) {
            System.out.println("Нет доступных книг");
        }
        return allBooks;
    }



    public static void main(String[] args) {
        Library library = new Library();
        library.addedBook("title", "author", 2002, true);
        library.addedBook("title2", "author2", 2002, false);
        library.addedBook("title3", "author3", 2002, false);
        library.addedBook("title4", "author4", 2002, true);
        System.out.println(library.findBook("title21"));
        System.out.println(library.getAllBooksIsAvailable().toString());
    }
}
