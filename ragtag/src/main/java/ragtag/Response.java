package ragtag;

import java.util.Optional;

/**
 *
 * @author weinpau
 */
public final class Response {

    ResponseStatus status = ResponseStatus.OK;
    MediaType type = MediaType.WILDCARD;
    Object body;

    private Response() {

    }

    public Optional<String> body() {
        if (body == null) {
            return Optional.empty();
        } else {
            return Optional.ofNullable(body.toString());
        }
    }

    public <T> Optional<T> body(Class<T> bodyType) {
        return Optional.empty();
    }

    public Response body(Object object) {
        return this;
    }

    public Optional<String> header(String name) {
        return Optional.empty();
    }

    public Response header(String name, String value) {
        return this;
    }

    public Response cookie(String name, String value) {
        return this;
    }

    public Response cookie(Cookie cookie) {
        cookie.name();
        return this;
    }

    public MediaType type() {
        return type;
    }

    public Response type(MediaType type) {
        return this;
    }

    public static Response ok() {
        return new Response();
    }

    public static Response ok(Object body) {
        return new Response();
    }

    public static Response created(Object body) {
        return new Response();
    }

    public static Response notFound() {
        return new Response();
    }

    public static Response serverError() {
        return new Response();
    }

    public static Response redirect(String path) {
        return new Response();
    }

    public static Response status(ResponseStatus responseStatus) {
        return new Response();
    }

}
