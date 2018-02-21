package pruebas;

/**
 *
 * @author ONivia
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = "hola", s2 = "mundo";
        String sformat = "%2$.3s";
        
        String mensaje1 = s2 + " " + s1;
        String mensaje2 = String.format("%1$-10d", 100);
        String mensaje3 = String.format("El total es: $%1$010.2f", 100.05423423);
        String mensaje4 = String.format("%1$e", 100.05423423);
        String mensaje5 = String.format("%1$g", 1.000542e+02);
        
        //System.out.println(mensaje1);
        System.out.println(mensaje5);
    }
}
