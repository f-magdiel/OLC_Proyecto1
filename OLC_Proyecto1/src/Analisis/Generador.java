
package Analisis;

/**
 *
 * @author Magdiel
 */
public class Generador {
    public static void main(String[] args){
        generarCompilador();
    }
    
    private static void generarCompilador(){
        try {
            String ruta = "src/Analisis/"; //ruta donde tenemos los archivos con extension .jflex y .cup
            String opcFlex[] = { ruta + "Lexico.jflex", "-d", ruta };
            JFlex.Main.generate(opcFlex);
            String opcCUP[] = { "-destdir", ruta, "-parser", "parser", ruta + "Sintactico.cup" };
            java_cup.Main.main(opcCUP);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
