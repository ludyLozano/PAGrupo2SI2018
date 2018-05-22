package principal;

import principal.exceptions.PrincipalException;

/**
 *
 * @author ONivia
 */
public class Operacion {
    public Operacion() {
    }
    
    public int divide(int n1, int n2) throws PrincipalException {
        // 5/0
        if(n2==10)
            throw new PrincipalException("n2 NO puede ser igual a " + n2, n2);
        
        return (n1/n2);
    }
}
