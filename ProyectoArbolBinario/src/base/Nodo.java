
package base;

/**
 *
 * @author ONivia
 */
public class Nodo {
    public int llave;
    public Object valor;
    public int hAcumulado;
    public Nodo izq;
    public Nodo der;

    public Nodo() {
        this.llave = 0;
        this.valor = null;
        this.hAcumulado = 0;
        this.izq = null;
        this.der = null;
    }

    public Nodo(int llave, Object valor) {
        this.llave = llave;
        this.valor = valor;
        this.hAcumulado = 0;
        this.izq = null;
        this.der = null;
    }    
}
