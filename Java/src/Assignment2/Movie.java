package Assignment2;

/*
MOVIE CLASS
 */
public class Movie {

    private String title, director;
    private int releaseYear, duration;
    private double rating;

    public Movie(String title, String director, int releaseYear, int duration, double rating) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.duration = duration;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isLongMovie() {
        return this.duration > 120; // in minutes
    }

    public boolean isHighlyRated() {
        return this.rating > 4.0;
    }
}
