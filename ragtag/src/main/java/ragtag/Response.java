package ragtag;

import java.util.Optional;

/**
 *
 * @author weinpau
 */
public interface Response {

    Optional<String> body();

    <T> Optional<T> body(Class<T> bodyType);

    Response body(Object object);

    Optional<String> header(String name);

    Response header(String name, String value);

    Response cookie(String name, String value);

    Response cookie(Cookie cookie);

    MediaType type();

    Response type(MediaType type);
    
    ResponseStatus status();
    
    Response status(ResponseStatus status);
    
    void clear();
    
    void send();
    
}
