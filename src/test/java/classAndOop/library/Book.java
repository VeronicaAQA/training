package classAndOop.library;

public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private boolean isAvailable;

    public Book(String title, String author, int yearPublished, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    //помечает книгу как недоступную
    public void borrowBook() {
        isAvailable = false;
    }

    //помечает книгу как доступную
    public void returnBook() {
        isAvailable = true;
    }

    @Override
    public String toString() {
        return getBookInfo();
    }

    public String getBookInfo() {
        return ("Название: " + title + ", Автор: " + author + ", Год издания: " + yearPublished + ", Доступна: " + isAvailable + "\n");
    }

}
