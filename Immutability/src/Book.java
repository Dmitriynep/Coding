public class Book {
    private final String name;
    private final String author;
    private final int nmbrPages;
    private final String isbn;

    public Book(String name, String author, int nmbrPages, String isbn) {
        this.name = name;
        this.author = author;
        this.nmbrPages = nmbrPages;
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getNmbrPages() {
        return nmbrPages;
    }

    public String getIsbn() {
        return isbn;
    }
}
