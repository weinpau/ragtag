package example;

import ragtag.Response;

import static ragtag.Ragtag.*;

public class HelloWorld {

    public static void main(String[] args) {
        get("/", req-> Response.ok("Hello World"));
    }

}
