package films;

public class Movie {
    private String title;
    private String description;
    private int releaseYear;
    private Director director;

    public Movie() {
    }

    public Movie(String title, String description, int releaseYear, Director director) {
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", releaseYear=" + releaseYear +
                ", director=" + director +
                '}';
    }
}
