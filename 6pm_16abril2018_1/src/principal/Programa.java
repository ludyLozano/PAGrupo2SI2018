package principal;

import ordenpedido.Orden;
import ordenpedido.OrdenCompra;
import ordenpedido.OrdenTrabajo;

/**
 *
 * @author ONivia
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        procesarOrden();
    }
    
    public static void procesarOrden() {
        int tipoorden = 0;
        //TIPOORDEN tipo_orden = TIPOORDEN.ORDEN_COMPAR;
        
        //ya se definio que tipo de orden es la que se va a procesar.
        tipoorden = 1;
        Orden orden = Orden.crearOrden(tipoorden);
        
        finalizarOrden(orden);
    }
    
    private static void finalizarOrden(Orden orden) {
        //valido el monto
        orden.finalizarOrden();        
    }
}
