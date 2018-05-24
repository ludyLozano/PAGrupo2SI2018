package principal;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ONivia
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        m2();
    }
    
    public static void m2() {
        String sep = System.getProperty("line.separator");
        
        try(FileWriter fw = new FileWriter("C:\\Tmp\\Universidad\\PruebasJava\\Salida.txt", true)) {        
            //fw = null;
            fw.write("hola4" + sep);            
        } catch (IOException | NullPointerException ex) {
            if(ex instanceof IOException) {
                
            } else if(ex instanceof NullPointerException) {
                
            }
            System.out.println("IOException: " + ex.getMessage());                        
        }      
    }
    
    public static void m1() {
        FileWriter fw = null;
        String sep = System.getProperty("line.separator");
        try {
            fw = new FileWriter("C:\\Tmp\\Universidad\\PruebasJava\\Salida.txt", true);
            
            fw.write("hola3" + sep);
        } catch(Exception ex) {
            System.out.println("Exception: " + ex.getMessage());            
        } finally {
            try {
                if (fw != null)
                    fw.close();                
            } catch (IOException ex2) {
                System.out.println("IOException: " + ex2.getMessage());
            }
        }
    }    
}
