package prog4.beadando.ws;

import java.util.Objects;

public class MovieDataResponse {

    private String id;
    private Double imdbRating;

    public MovieDataResponse() {}
    public MovieDataResponse(String id, Double rating) {
        this.id = id;
        this.imdbRating = rating;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(Double imdbRating) {
        this.imdbRating = imdbRating;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        MovieDataResponse that = (MovieDataResponse) o;
        return Objects.equals(id, that.id) && Objects.equals(imdbRating, that.imdbRating);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(id);
        result = 69 * result + Objects.hashCode(imdbRating);
        return result;
    }
}
