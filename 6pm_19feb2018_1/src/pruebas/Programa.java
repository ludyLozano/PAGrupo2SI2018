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
        int i = 15;
        int j = 10;
        
        //&& short circuit
        //&
        
        switch(i) {
            case 10:
            case 5:
                System.out.println("i es igual a 5 o a 10");
                break;
            default:
                System.out.println("i no es 5 ni 10");
                break;
        }       
       
    }

    public static boolean evalua(int numero, int comparador) {
        boolean resultado = false;
        
        System.out.println("ok2"); //si se muestra
        resultado = (numero == comparador);
        
        return resultado;     
    }
}
