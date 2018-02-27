
package pruebas;

/**
 *
 * @author ONivia
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        ejercicio11();
    }
    
    public static void ejercicio11() {
        //D:\\
        //D:\\dir1
        //D:\\dir1\\
        //D:\\dir\\archiv.txt
        //\\dir1\\
        //:/
        String spath = "D:\\dir1/dir2/dir3\\dir4/salida.txt";
        int cantidadDirectorios = 0;
        String[] directorios = null;
        if(estaNormalizado(spath)) {
            cantidadDirectorios = obtieneCantidadDirectorios(spath);
            
            System.out.println("Cant Dirs: " + cantidadDirectorios);
            
            if(cantidadDirectorios > 0) {
                directorios = obtieneDirectorios(spath);
                System.out.println("Directorios:");
                for(String dir : directorios) {
                    System.out.println("\t" + dir);                                        
                }
            }            
            
            System.out.println("Cant Separadores: " + obtieneCantidadSeparadores(spath));
            
            if(cantidadDirectorios>0){
                System.out.println("primer directorio: "+ directorios[0]);
                System.out.println("ultimo directorio: "+ directorios[directorios.length - 1]);
            }
            
            if(tieneArchivo(spath)) {
                System.out.println("Archivo sin Ext: " + obtieneNombreArchivo(spath));
                System.out.println("Ext: "+ obtieneNombreExtension(spath));
            }
        }
    }
    
    public static boolean tieneArchivo(String spath) {
        return (spath.indexOf(".")>0);        
    }
    
    public static String obtieneNombreExtension (String spath){
        String cadenaNueva = estandarizaPath(spath);        
        String ultimaParte = spath.substring(spath.lastIndexOf(".") + 1,spath.length());
        
        return ultimaParte;
    }
    
    public static String obtieneNombreArchivo(String spath) {
        String cadenaNueva = estandarizaPath(spath);        
        String ultimaParte = spath.substring(spath.lastIndexOf("/") + 1,spath.indexOf("."));
        
        return ultimaParte;
    }
    
    public static int obtieneCantidadSeparadores(String spath) {
        String cadenaNueva = estandarizaPath(spath);
        int cantidadSeparadores = cadenaNueva.length() - cadenaNueva.replace("/", "").length();
        
        return cantidadSeparadores;                
    }
    
    public static String[] obtieneDirectorios(String spath) {
        String cadenaNueva = estandarizaPath(spath);
        String[] splitDirs = cadenaNueva.split("/");        
        String[] directorios = new String[obtieneCantidadDirectorios(spath)];
        
        System.arraycopy(splitDirs, 1, directorios, 0, obtieneCantidadDirectorios(spath));
        
        return directorios;
    }    
    
    public static int obtieneCantidadDirectorios(String spath) {
        String cadenaNueva = estandarizaPath(spath);
        String[] directorios = cadenaNueva.split("/");
        int descartados = 1;
        
        if(directorios[directorios.length -1 ].contains("."))
            descartados += 1;
        
        return (directorios.length - descartados);            
    }
    
    public static boolean estaNormalizado(String spath) {
        return (spath.indexOf(":\\")>0 || spath.indexOf(":/")>0);        
    }
    
    public static String estandarizaPath(String spath) {
        return (spath.replace("\\", "/"));
    }
}
