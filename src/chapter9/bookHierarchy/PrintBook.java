package chapter9.bookHierarchy;

public class PrintBook extends Book{
    private String publisher;
    private String ISBN;


    public PrintBook(String title, int year, String author) {
        super(title, year, author);
    }

    public PrintBook(String title, int year, String author, String publisher, String ISBN) {
        super(title, year, author);
        this.publisher = publisher;
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "PrintBook{" +
                "publisher='" + publisher + '\'' +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }
}
