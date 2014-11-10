package ragtag;

/**
 *
 * @author weinpau
 */
public final class RagtagTest {

    private RagtagTest() {
    }
    
    
    public static TestRequest on(String path) {
        return new TestRequest();        
    }
    
     public static TestRequest on(Router router) {
            return new TestRequest();        
    }
    
    
     public static TestRequest on(Router router, String path) {
            return new TestRequest();        
    }
    
    
}
