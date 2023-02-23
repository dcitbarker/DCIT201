package Assignment2;
/*
BOOK CLASS
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Book {
    private String title, author, ISBN, published_date;
    private int number_of_pages;

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

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPublished_date() {
        return published_date;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }

    public int getNumber_of_pages() {
        return number_of_pages;
    }

    public void setNumber_of_pages(int number_of_pages) {
        this.number_of_pages = number_of_pages;
    }

    public boolean ifLong(int pages) {
        return pages > 500; // simplified the if else statement
    }

    // Get current date and compare with published date
    public boolean ifRecentlyPublished(String date) {
        Date today = new Date();
        Calendar c = Calendar.getInstance();
        try {
            c.setTime(today);   // Convert Date to Calendar

            c.add(Calendar.YEAR, -5);       // remove 5 years - back date
            Date _yearsAgo = c.getTime();  // Convert calendar back to Date

            // prepare publish date for comparison
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date published_date = dateFormat.parse(date);

            return _yearsAgo.compareTo(published_date) < 0;

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
}
