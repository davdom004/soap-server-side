package prog4.beadando.ws;

import jakarta.jws.WebService;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

@WebService(endpointInterface = "prog4.beadando.ws.MovieDataService", serviceName = "Movie", targetNamespace = "prog4.beadando.ws.soap")
public class SoapMovieDataService implements MovieDataService {
    private final Map<String, Double> map = new HashMap<>();

    @Override
    public MovieDataResponse getMovieData(MovieDataRequest request) {
        return new MovieDataResponse(
                request.getMovieId(),
                this.map.computeIfAbsent(
                        request.getMovieId(),
                        movieId -> Math.round(ThreadLocalRandom.current().nextDouble(1, 10) * 10) / 10.0
                )
        );
    }
}
