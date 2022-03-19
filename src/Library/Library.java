package Library;



public class Library {
    public static void main(String[] args) {
     Author aut1 = new Author("Ray Bradberry","Prose");
     Author aut2 = new Author("George Oruell","Fantastic");
     Author aut3 = new Author("David Roberts","Adventures");
     Author aut4= new Author("Mihail Bulgakov","honor");

        Book book1 = new Book("Freedom everywhere", 500, aut1);
        Book book2 = new Book("3 Friends", 654, aut1);
        Book book3 = new Book("Flowers", 769, aut2);
        Book book4 = new Book("Small Prince", 900, aut2);
        Book book5 = new Book("Java for Beginners", 345, aut3);
        Book book6 = new Book("HTML", 697, aut3);
        Book book7 = new Book("Tail Stories", 456, aut4);
        Book book8 = new Book("King of Jungle", 233, aut4);

        SeriesofBooks futureBooks = new SeriesofBooks("good in Time",2021,6);
        SeriesofBooks tomorrowBooks = new SeriesofBooks("Always Fresh",2019,4);

        futureBooks.addBook(book1);
        futureBooks.addBook(book2);
        futureBooks.addBook(book3);
        futureBooks.addBook(book4);
        futureBooks.addBook(book5);
        futureBooks.addBook(book6);
        futureBooks.addBook(book7);
        futureBooks.addBook(book8);

        tomorrowBooks.addBook(book1);
        tomorrowBooks.addBook(book2);
        tomorrowBooks.addBook(book3);

        System.out.println(futureBooks.getStringBooks());
       // System.out.println(tomorrowBooks.getStringBooks());
    }
}

