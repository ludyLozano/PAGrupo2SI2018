package pruebas;

/**
 *
 * @author ONivia
 */
public class Programa2 {    
    public static void main(String[] args) {
        String nombre1 = "pedro";
        String nombre2 = "laura";        
        String nombre3 = "oskr";
        
        String[] nombres1 = new String[3];
        String[] nombres2 = {"pedro","laura","oskr"};
        
        for(String nombre : nombres2) {
            System.out.println(nombre);
        }
        
        /*
        int i=0;
        while(i < nombres2.length) {
            System.out.println(nombres2[i]);            
            
            i++;
        }
        */
    }    
}
