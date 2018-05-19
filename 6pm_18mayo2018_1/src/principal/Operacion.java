package principal;

/**
 *
 * @author ONivia
 */
public class Operacion {
    public Operacion() {
    }
    
    public int sumar(int n1, int n2) {
        return(n1 + n2);
    }
    
    public int restar(int n1, int n2) throws InterruptedException {
        Thread.sleep(5000);
        return(n2 - n1);
    }
}
