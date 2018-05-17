package principal;

/**
 *
 * @author ONivia
 */
public class Operacion implements IOperacion {

    @Override
    public int realizarOperacion(int a, int b) {
        return (a+b);
    }
}
