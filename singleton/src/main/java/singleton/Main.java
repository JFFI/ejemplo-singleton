package singleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author jflores
 */
public class Main {
    public static void main(String args[]) throws IOException, Exception {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );
        System.out.println("Ejemplo patrón Singleton");
        System.out.println("Seleccione una acción");
        Aleatorizador aleatorizador = AleatorizadorSingleton.obtenerInstancia();
        while(true) {
            System.out.println("Clase:" + aleatorizador.getClass());
            System.out.println("Número generado:" + aleatorizador.obtenerNumero());
            listarAcciones();
            String accion = reader.readLine();
            switch(accion) {
                case "1":
                    aleatorizador = AleatorizadorSingleton.obtenerInstancia();
                    break;
                case "2":
                    aleatorizador = new AleatorizadorComun();
                    break;
                case "3":
                    System.exit(0);
                default:
                    System.out.println("No se reconoce número");
            }
            System.out.println("");
        }
    }
    
    public static void listarAcciones() {
        System.out.println("Ingrese un número");
        System.out.println("1 - Instanciar singleton");
        System.out.println("2 - Instanciar clase común");
        System.out.println("3 - Salir");
    }
}
