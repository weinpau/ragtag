package ragtag;

/**
 *
 * @author weinpau
 */
public interface Mapper {
    
    String serialize(Object object);
    
    Object deserialize(String data);  
    
}
