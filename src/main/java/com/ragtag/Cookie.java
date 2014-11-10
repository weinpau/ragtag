package com.ragtag;

/**
 *
 * @author weinpau
 */
public class Cookie {

    private final String name;
    private String value, domain, path;
    boolean secure = false;

    private Cookie(String name) {
        this.name = name;

    }

    public Cookie value(String value) {
        this.value = value;
        return this;
    }

    public Cookie path(String path) {
        this.path = path;
        return this;
    }

    public Cookie domain(String domain) {
        this.domain = domain;
        return this;
    }

    public Cookie secure() {
        secure = true;
        return this;
    }

    public String name() {
        return name;
    }

    public String value() {
        return value;
    }
    
    

    public static Cookie name(String name) {
        return new Cookie(name);
    }

}
