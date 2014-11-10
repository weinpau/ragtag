package ragtag;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/**
 *
 * @author weinpau
 */
public abstract class Router {

    protected abstract void configure();

    public Router get(String path, BiConsumer<Request, Response> callback, MediaType... acceptTypes) {
        return this;
    }

    public Router post(String path, BiConsumer<Request, Response> callback, MediaType... acceptTypes) {
        return this;
    }

    public Router put(String path, BiConsumer<Request, Response> callback, MediaType... acceptTypes) {
        return this;
    }

    public Router delete(String path, BiConsumer<Request, Response> callback, MediaType... acceptTypes) {
        return this;
    }

    public Router all(String path, BiConsumer<Request, Response> callback) {
        return this;
    }

    public Router use(String path, Router route) {
        return this;
    }

    public Router mapper(Mapper mapper, MediaType... types) {
        return this;
    }

    public <E extends Exception> Router exception(Class<E> exceptionClass, BiFunction<E, Request, Response> callback) {
        return this;
    }

    public Router route(String path) {
        return new Router() {

            @Override
            protected void configure() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        };
    }

}
