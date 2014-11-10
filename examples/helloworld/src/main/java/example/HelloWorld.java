package example;

import static ragtag.Ragtag.*;
import static ragtag.RagtagTest.*;

public class HelloWorld {

    public static void main(String[] args) {
        get("/", (req, rsp) -> rsp.body("Hello World"));

        post("/", (req, rsp) -> rsp.body("Hello " + req.body().orElse("stranger")));

        all("*", (req, rsp) -> {
            rsp.cookie("sample", "test");
        });

        assert (on("/").get().body().isPresent());

        assert (on("/").post("Joe").body().isPresent());
    }

}
