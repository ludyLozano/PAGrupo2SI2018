package ordenpedido;

/**
 *
 * @author ONivia
 */
public abstract class Orden {
    public abstract void finalizarOrden();
    
    public void autorizarOrden() {
        System.out.println("se autorizo la Orden");
    }
    
    public static Orden crearOrden(int tipoorden) {
        Orden orden = null;
        
        switch(tipoorden) {
            case 1:
                orden = new OrdenCompra();
                break;
            case 2:
                orden = new OrdenTrabajo();
                break;
        }
        
        return orden;
    }
}
