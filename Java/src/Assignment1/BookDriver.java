package Assignment1;
/*
Main class for creating a few Book objects from the Book class
We set the properties and get the properties
 */
public class BookDriver {
    // storing sample books in a String array
    static String[] bk1 = {"Anthony Barker", "Programming Fundamentals", "10981589", "200", "50.50"};
    static String[] bk2 = {"Anthony Barker", "JAVA - AN OOP", "10981589", "100", "200.50"};
    static String[] bk3 = {"Anthony Barker", "THE POWER OF PHP", "10981589", "400", "500.50"};

    public static void main(String[] args) {
        Book book_1 = new Book();   // first book object
        Book book_2 = new Book();   // first book object
        Book book_3 = new Book();   // first book object

        // SETTERS FOR BOOK 1
        // Setting book object properties from array
        book_1.setTitle(bk1[1]);
        book_1.setAuthor(bk1[0]);
        book_1.setISBN(bk1[2]);
        book_1.setPageCount(Integer.parseInt(bk1[3])); // casting to int
        book_1.setPrice(Double.parseDouble(bk1[4]));   // casting to double

        // SETTERS FOR BOOK 2
        book_2.setTitle(bk2[1]);
        book_2.setAuthor(bk2[0]);
        book_2.setISBN(bk2[2]);
        book_2.setPageCount(Integer.parseInt(bk2[3])); // casting to int
        book_2.setPrice(Double.parseDouble(bk2[4]));   // casting to double

        // SETTERS FOR BOOK 3
        book_3.setTitle(bk3[1]);
        book_3.setAuthor(bk3[2]);
        book_3.setISBN(bk3[2]);
        book_3.setPageCount(Integer.parseInt(bk3[3])); // casting to int
        book_3.setPrice(Double.parseDouble(bk3[4]));   // casting to double

        // using the getters in Book object to retrieve data stored in the properties
        System.out.println("BOOK 1 RECORDS:");
        System.out.println("Book Author: " + book_1.getAuthor());
        System.out.println("Book Title: " + book_1.getTitle());
        System.out.println("Book ISBN: " + book_1.getISBN());
        System.out.println("Page Count: " + book_1.getPageCount());
        System.out.println("Book Price: " + book_1.getPrice());

        System.out.println();
        System.out.println("--------------------------");
        System.out.println("BOOK 2 RECORDS:");
        System.out.println("Book Author: " + book_2.getAuthor());
        System.out.println("Book Title: " + book_2.getTitle());
        System.out.println("Book ISBN: " + book_2.getISBN());
        System.out.println("Page Count: " + book_2.getPageCount());
        System.out.println("Book Price: " + book_2.getPrice());

        System.out.println();
        System.out.println("--------------------------");
        System.out.println("BOOK 3 RECORDS:");
        System.out.println("Book Author: " + book_3.getAuthor());
        System.out.println("Book Title: " + book_3.getTitle());
        System.out.println("Book ISBN: " + book_3.getISBN());
        System.out.println("Page Count: " + book_3.getPageCount());
        System.out.println("Book Price: " + book_3.getPrice());
    }
}