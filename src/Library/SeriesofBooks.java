package Library;



public class SeriesofBooks {
    private String title;
    private int year;
    private int countBooks;
    private Book[] books;
    private int currentIndexbook = 0;

    public SeriesofBooks(String title, int year, int countBooks) {
        this.title = title;
        this.year = year;
        this.countBooks = countBooks;
        books= new Book[countBooks];
    }

    public String getTitle() {return title;}



    public void setTitle(String title) {this.title = title;}



    public int getYear() {  return year;}



    public void setYear(int year) {this.year = year;}
    public void addBook(Book book) {
        if (currentIndexbook == countBooks) {

            return;
        }
        books[currentIndexbook++] = book;

    }

    public String getStringBooks(){
        String output = "";
        for (Book book: books){
            output += " * " + book.getTitle() + "  " + book.getAuthor().getName() + "\n";
        }
        return output;
    }
    }




