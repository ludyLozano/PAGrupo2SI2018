package base;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ONivia
 */
public class ArbolBinario {
    private Nodo raiz;

    public ArbolBinario() {
        this.raiz = null;
    }
    
    public void insertar(Nodo nodo) throws Exception {
        if(raiz != null) {
            Nodo ne = raiz;
            while(true) {
                //se toma el sub-arbol izq
                if(nodo.llave < ne.llave) {
                    if(ne.izq != null) {
                        ne = ne.izq;
                    } else {
                        ne.izq = nodo;
                        break;
                    }                    
                } else if(nodo.llave > ne.llave) {
                    if(ne.der != null) {
                        ne = ne.der;
                    } else {
                        ne.der = nodo;
                        break;                        
                    }                    
                } else { //la llave ya existe
                    throw new Exception("Error, la llave: " + nodo.llave + " ya existe!.");                    
                }
            }            
        } else {
            raiz = nodo;
        }
    }
    
    public void recorrerxAmplitud() {
        Queue<Nodo> cola = null;
	Nodo nodoaux = null;	
	cola = new LinkedList<Nodo>();
        
        if(raiz != null) {
            cola.add(raiz);

            while(cola.size()>0)
            {
                    nodoaux = cola.poll();
                    if(nodoaux!=null)
                    {
                            System.out.println(nodoaux.llave);
                            cola.add(nodoaux.izq);
                            cola.add(nodoaux.der);
                    }
            }
        }
    }
}
