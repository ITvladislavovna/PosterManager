import javax.swing.*;

public class OpenPoster {
    private String moviePoster;
    private String movieTitle;
    private String genre;

    public OpenPoster(String moviePoster, String movieTitle, String genre) {
        this.moviePoster = moviePoster;
        this.movieTitle = movieTitle;
        this.genre = genre;
    }

    public String getMoviePoster() {

        return moviePoster;
    }

    public void setMoviePoster(String moviePoster) {

        this.moviePoster = moviePoster;
    }

    public String getMovieTitle() {

        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {

        this.movieTitle = movieTitle;
    }

    public String getGenre() {

        return genre;
    }

    public void setGenre(String genre) {

        this.genre = genre;
    }
}


