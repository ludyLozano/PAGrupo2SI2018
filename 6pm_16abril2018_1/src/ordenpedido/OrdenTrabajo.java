package ordenpedido;

/**
 *
 * @author ONivia
 */
public class OrdenTrabajo extends Orden {
    public OrdenTrabajo() {
    }
    
    public void asociarDespachador() {
        System.out.println("se asocio despachador");
    }

    @Override
    public void finalizarOrden() {
        System.out.println("se finalizo la Orden de Trabajo");
    }
}
