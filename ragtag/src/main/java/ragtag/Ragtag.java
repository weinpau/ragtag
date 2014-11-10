package ragtag;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 *
 * @author weinpau
 */
public final class Ragtag {

    static Router root = new Router() {

        @Override
        protected void configure() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    };

    private Ragtag() {
    }

    public static Router get(String path, Function<Request, Response> callback, MediaType... acceptTypes) {
        return root.get(path, callback, acceptTypes);
    }

    public static Router get(String path, BiConsumer<Request, Response> callback, MediaType... acceptTypes) {
        return root.get(path, callback, acceptTypes);
    }

    public static Router post(String path, Function<Request, Response> callback, MediaType... acceptTypes) {
        return root.post(path, callback, acceptTypes);
    }

    public static Router post(String path, BiConsumer<Request, Response> callback, MediaType... acceptTypes) {
        return root.post(path, callback, acceptTypes);
    }

    public static Router put(String path, Function<Request, Response> callback, MediaType... acceptTypes) {
        return root.put(path, callback, acceptTypes);
    }

    public static Router put(String path, BiConsumer<Request, Response> callback, MediaType... acceptTypes) {
        return root.put(path, callback, acceptTypes);
    }

    public static Router delete(String path, Function<Request, Response> callback, MediaType... acceptTypes) {
        return root.delete(path, callback, acceptTypes);
    }

    public static Router delete(String path, BiConsumer<Request, Response> callback, MediaType... acceptTypes) {
        return root.delete(path, callback, acceptTypes);
    }

    public static Router all(String path, Function<Request, Response> callback) {
        return root.all(path, callback);
    }

    public static Router all(String path, BiConsumer<Request, Response> callback) {
        return root.all(path, callback);
    }

    public static Router use(String path, Router route) {
        return root.use(path, route);
    }

    public static Router mapper(Mapper mapper, MediaType... types) {
        return root.mapper(mapper, types);
    }

    public static <E extends Exception> Router exception(Class<E> exceptionClass, BiFunction<E, Request, Response> callback) {
        return root.exception(exceptionClass, callback);
    }

    public static Router route(String path) {
        return root.route(path);
    }

}
