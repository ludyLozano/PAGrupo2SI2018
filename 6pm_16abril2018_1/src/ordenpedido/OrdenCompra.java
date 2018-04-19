package ordenpedido;

import Interfaces.IDocumentoTotalizado;
import facturacion.Factura;

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

    @Override
    public void totalizar(IDocumentoTotalizado doctotalizado) {
        doctotalizado.totalizar(doctotalizado);
    }
}
