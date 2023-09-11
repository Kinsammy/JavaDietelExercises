package chapter9.bookHierarchy;

public class AudioBook extends Book{
    private String size;
    private double length;
    private String artistName;
    public AudioBook(String title, int year, String author) {
        super(title, year, author);
    }

    public AudioBook(String title, int year, String author, String size, double length, String artistName) {
        super(title, year, author);
        this.size = size;
        this.length = length;
        this.artistName = artistName;
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "size='" + size + '\'' +
                ", length=" + length +
                ", artistName='" + artistName + '\'' +
                '}';
    }
}
