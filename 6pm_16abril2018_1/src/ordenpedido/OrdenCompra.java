package ordenpedido;

public class OrdenCompra extends Orden {
    public OrdenCompra() {
    }
    
    public void asociarCliente() {
        System.out.println("se asocio cliente");
    }

    @Override
    public void finalizarOrden() {
        System.out.println("se finalizo la Orden de Compra");
    }
}
