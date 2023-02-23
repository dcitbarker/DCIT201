package Assignment2;

/*
Driver class for creating a few Book objects from the Book class
We set the properties and get the properties
 */
public class BookDriver {
    // storing sample books in a multidimensional String array
    static String[][] book_data = {
            {"Anthony Barker", "Programming Fundamentals", "10981589", "2022-02-27", "200"},
            {"Anthony Barker", "JAVA - AN OOP", "10981589", "2019-02-27", "600"},
            {"Anthony Barker", "THE POWER OF PHP", "10981589", "2018-02-20", "501"}
    };

    public static void main(String[] args) {

        // a simple loop to create three book objects using data in Array
        for(int i = 0; i < 3; i++) {
            eachBook(new Book(), book_data[i], i);
        }
    }

    // method to set and get properties and methods of book Class
    public static void eachBook(Book book, String[] book_data, int counter) {

        // SETTERS FOR BOOK - Setting book object properties from array
        book.setAuthor(book_data[0]);
        book.setTitle(book_data[1]);
        book.setISBN(book_data[2]);
        book.setPublished_date(book_data[3]);
        book.setNumber_of_pages(Integer.parseInt(book_data[4])); // casting to int

        // using the getters in Book object to retrieve data stored in the properties
        System.out.println("BOOK " + (counter + 1) + " RECORDS:");
        System.out.println("Book Author: " + book.getAuthor());
        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Book ISBN: " + book.getISBN());
        System.out.println("Number of Pages: " + book.getNumber_of_pages());
        System.out.println("Published Date: " + book.getPublished_date());

        if(book.ifLong(book.getNumber_of_pages())) {
            System.out.print("This book is over 500 Pages ");
        }
        else {
            System.out.print("This book is less than 500 Pages ");
        }

        if(book.ifRecentlyPublished(book.getPublished_date())) {
            System.out.print("and Recently Published");
        }
        else {
            System.out.print("and published Over 5 years ago");
        }
        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println();
    }
}