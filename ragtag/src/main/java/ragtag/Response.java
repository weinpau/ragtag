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
    
    
    public static Response ok() {
        return null;
    }

    public static Response ok(Object body) {
        return null;
    }

    public static Response created(Object body) {
       return null;
    }

    public static Response notFound() {
        return null;
    }

    public static Response serverError() {
       return null;
    }

    public static Response redirect(String path) {
        return null;
    }

    public static Response status(ResponseStatus responseStatus) {
        return null;
    }

}
