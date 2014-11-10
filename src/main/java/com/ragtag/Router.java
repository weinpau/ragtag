package com.ragtag;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 *
 * @author weinpau
 */
public abstract class Router {

    protected abstract void configure();

    public Router get(String path, Function<Request, Response> callback, MediaType... acceptTypes) {
        return this;
    }

    public Router post(String path, Function<Request, Response> callback, MediaType... acceptTypes) {
        return this;
    }

    public Router put(String path, Function<Request, Response> callback, MediaType... acceptTypes) {
        return this;
    }

    public Router delete(String path, Function<Request, Response> callback, MediaType... acceptTypes) {
        return this;
    }

    public Router use(String path, Router route) {
        return this;
    }

    public Router all(String path, Function<Request, Response> callback) {
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
