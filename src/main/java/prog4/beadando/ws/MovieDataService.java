package prog4.beadando.ws;

import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface MovieDataService {
    MovieDataResponse getMovieData(MovieDataRequest request);
}
