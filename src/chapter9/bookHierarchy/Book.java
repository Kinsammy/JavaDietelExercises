package chapter9.bookHierarchy;

public class Book {
    private String title;
    private int year;
    private String author;

    public Book(String title, int year, String author) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("The Book information:%n" +
                "Book Title: %s%n" +
                "Year: %d" +
                "Book Author: %s", title, year, author);
    }
}
