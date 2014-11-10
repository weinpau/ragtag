package example;

import com.ragtag.Response;

import static com.ragtag.Ragtag.*;

public class HelloWorld {

    public static void main(String[] args) {
        get("/", req-> Response.ok("Hello World"));
    }

}
