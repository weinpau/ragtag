package example;


import static ragtag.Ragtag.*;

public class HelloWorld {

    public static void main(String[] args) {
        get("/", (req, rsp) -> rsp.body("Hello World"));

        all("*", (req, rsp) -> {
            rsp.cookie("sample", "test");
        });

    }

}
