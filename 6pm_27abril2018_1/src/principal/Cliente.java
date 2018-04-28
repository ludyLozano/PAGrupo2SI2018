package principal;

/**
 *
 * @author onivia
 */
public class Cliente {
    public int nit;
    public String nombre;

    public Cliente(int nit, String nombre) {
        this.nit = nit;
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {        
        return (this.nit);
    }

    @Override
    public boolean equals(Object objcomparado) {
        Cliente c = (Cliente)objcomparado;
        return (c.nit == this.nit);
    }
    
    
}
