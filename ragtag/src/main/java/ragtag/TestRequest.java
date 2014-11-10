package ragtag;

/**
 *
 * @author weinpau
 */
public class TestRequest {

    public TestRequest cookie(String name, String value) {
        return this;
    }

    public TestRequest cookie(Cookie cookie) {
        return this;
    }

    public Response get() {
        return null;
    }

    public Response post(Object body) {
        return null;
    }
}
