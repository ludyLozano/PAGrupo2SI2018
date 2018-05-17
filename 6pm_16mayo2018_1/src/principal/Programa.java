package principal;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ONivia
 */
public class Programa {

    public static void main(String[] args) {
        m3();
    }

    public static void m1() {
        IOperacion suma = (x,y) -> x + y;
        IOperacion oper = new Operacion();
        
        int resultado1 = realizaSuma(5, 10, suma);
        int resultado2 = oper.realizarOperacion(10, 20);
        System.out.println(resultado1);
        System.out.println(resultado2);
    }
    
    private static int realizaSuma(int a, int b, IOperacion oper) {
        return (oper.realizarOperacion(a, b));
    }
    
    public static void m2() {
        Runnable rr = ()-> {
            int i = 0;
            while(i<100) {
                if(i%2!=0)
                    System.out.println(i);
                i++;
            }
        };        
        
        Thread hilo1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while(i<100) {
                    if(i%2==0)
                        System.out.println(i);
                    i++;
                }
            }
        });
        Thread hilo2 = new Thread(rr);
        hilo2.start(); //impares
        hilo1.start(); //pares
        System.out.println("Ejecutando Hilo");
    }
    
    public static void m3() {
        List<Integer> nums = Arrays.asList(20,10,40,50);
        List<String> noms = Arrays.asList("oskr","daniela","pedRo");
        
        boolean existe = nums.stream().anyMatch(x -> x==100);
        noms.stream()
                .filter(x -> x.toUpperCase().contains("R"))
                .forEach(x -> System.out.println(x));
    }
}
