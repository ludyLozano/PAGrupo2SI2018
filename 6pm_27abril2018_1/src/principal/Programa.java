package principal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author onivia
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //prueba_List();
        //prueba_Map();        
        prueba_Set();
    }
    
    public static void prueba_List() {
        //LinkedList - ArrayList
        LinkedList<Cliente> lista = new LinkedList<Cliente>();
                
        lista.add(new Cliente(100,"oskr")); //0
        lista.add(new Cliente(200,"lulu")); //1
        lista.add(new Cliente(300,"maria")); //2
        
        //System.out.println(lista.get(1).nombre);
        lista.remove(1);

        for(Cliente c : lista) {
            System.out.println(c.nit + " - " + c.nombre);            
        }
    }
    
    public static void prueba_Map() {
        HashMap<Integer,Cliente> mapa = new HashMap<Integer,Cliente>();
        mapa.put(500,new Cliente(100,"oskr"));
        mapa.put(600,new Cliente(200,"lulu"));
        mapa.put(700,new Cliente(300,"maria"));
        mapa.put(700,new Cliente(300,"mariax"));
        
        //System.out.println(mapa.get(600).nombre);
        //mapa.remove(600);
        
        for(Map.Entry<Integer,Cliente> c :mapa.entrySet()) {
            System.out.println(c.getKey() + "-" + c.getValue().nit + "-" + c.getValue().nombre);            
        }
    }
    
    public static void prueba_Set() {
        HashSet<Cliente> set = new HashSet<Cliente>();
        
        set.add(new Cliente(100,"oskr"));
        Cliente cliente1 = new Cliente(200,"lulu");
        set.add(cliente1);
        set.add(new Cliente(300,"maria"));
        set.add(new Cliente(300,"mariax"));
        
        Cliente cliente2 = new Cliente(200,"lulu");
        set.remove(cliente2);
                       
        for(Cliente c : set) {
            System.out.println(c.nit + " - " + c.nombre);            
        }
    }
}
