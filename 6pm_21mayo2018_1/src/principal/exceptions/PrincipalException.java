package principal.exceptions;

/**
 *
 * @author ONivia
 */
public class PrincipalException extends Exception {
    public int n;
    
    public PrincipalException() {
        super();
    }
    
    public PrincipalException(String msj, int n) {
        super(msj);
        
        this.n = n;
    }
    
}
