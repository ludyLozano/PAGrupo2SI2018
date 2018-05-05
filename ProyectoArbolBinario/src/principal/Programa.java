package principal;

import base.ArbolBinario;
import base.Nodo;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ONivia
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        prueba_ArbolBinario();
    }
    
    public static void prueba_ArbolBinario() throws Exception {
        ArbolBinario ab = new ArbolBinario();
        
        ab.insertar(new Nodo(50, null));
        ab.insertar(new Nodo(20, null));
        ab.insertar(new Nodo(25, null));
        ab.insertar(new Nodo(10, null));        
        ab.insertar(new Nodo(30, null));
        ab.insertar(new Nodo(12, null));
        ab.insertar(new Nodo(80, null));        
        ab.insertar(new Nodo(70, null));
        ab.insertar(new Nodo(90, null));
        ab.insertar(new Nodo(75, null));
        
        ab.recorrerxAmplitud();
    }
}
