/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        int i = 0;
        for (i = 0; i < 10; i++) {
            //System.out.println(i);            
        }
        
        i = 0;
        while(i<10) {
            System.out.println(i);            
        }
        //System.out.println(i);
    }

    public static boolean evalua(int numero, int comparador) {
        boolean resultado = false;
        
        System.out.println("ok2"); //si se muestra
        resultado = (numero == comparador);
        
        return resultado;     
    }
}
