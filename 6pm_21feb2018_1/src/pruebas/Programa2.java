package pruebas;

/**
 *
 * @author ONivia
 */
public class Programa2 {    
    public static void main(String[] args) {
        //[2][3][4]
        int[][][] numeros =
        {
            {
                {5,2,1,9},
                {3,20,11,90},
                {10,21,12,91}                    
            },
            {
                {50,28,16,96},
                {3,25,17,95},
                {100,28,122,910}                    
            }
        };
        
        System.out.println(numeros[0][2][3]);
    }    
}
