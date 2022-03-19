package Library;

public class Book {
    public String title;
    private int pagesinBook;
    private Author author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPagesinBook() {
        return pagesinBook;
    }

    public void setPagesinBook(int pagesinBook) {
        this.pagesinBook = pagesinBook;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Book(String title, int pagesinBook, Author author) {
        this.title = title;
        this.pagesinBook = pagesinBook;
        this.author = author;

    }
}
