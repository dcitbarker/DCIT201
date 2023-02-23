package Assignment2;

/*
Driver class for creating a few movies objects from the Movie class
We set the properties and get the properties
 */
public class MovieDriver {
    // storing sample movies in a multidimensional String array
    static String[][] movie_data = {
            {"Titanic", "James Cameron", "1997", "195", "4.5"},
            {"Cinderella", "Kenneth Branagh", "2015", "106", "1.5"},
            {"The Woman King", "Gina Prince- Bythewood", "2022", "135", "3.0"}
    };

    public static void main(String[] args) {

        // a simple loop to create three movie objects using data in Array
        for(int i = 0; i < 3; i++) {
            eachBook(movie_data[i], i);
        }
    }

    // method to set and get properties and methods of Movie Class
    public static void eachBook(String[] movie_data, int counter) {
        Movie movie = new Movie(
                movie_data[0],
                movie_data[1],
                Integer.parseInt(movie_data[2]),
                Integer.parseInt(movie_data[3]),
                Double.parseDouble(movie_data[3]));

        // SETTERS FOR BOOK - Setting book object properties from array
        movie.setTitle(movie_data[0]);
        movie.setDirector(movie_data[1]);
        movie.setReleaseYear(Integer.parseInt(movie_data[2]));
        movie.setDuration(Integer.parseInt(movie_data[3]));
        movie.setRating(Double.parseDouble(movie_data[4])); // casting to double

        // using the getters in Book object to retrieve data stored in the properties
        System.out.println("MOVIE " + (counter + 1) + " RECORDS:");
        System.out.println("Movie Title: " + movie.getTitle());
        System.out.println("Movie Director: " + movie.getDirector());
        System.out.println("Release year: " + movie.getReleaseYear());
        System.out.println("Duration: " + movie.getDuration() + " mins");
        System.out.println("Rating: " + movie.getRating());

        if(movie.isLongMovie()) {
            System.out.print("This Movie is really long ");
        }
        else {
            System.out.print("This Movie is not Long ");
        }

        if(movie.isHighlyRated()) {
            System.out.print("and Highly Rated");
        }
        else {
            System.out.print("and Not highly rated");
        }
        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println();
    }
}