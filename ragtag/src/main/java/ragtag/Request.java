package ragtag;

import java.util.Optional;

/**
 *
 * @author weinpau
 */
public interface Request {

    Optional<String> body();

    <T> Optional<T> body(Class<T> bodyType);
    
    RequestMethod requestMethod();
    
    PathParameters pathParams();
   
    String path();
    
    String contextPath();
    
    

}
