/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.util.Random;

/**
 *
 * @author jflores
 */
public class AleatorizadorSingleton implements Aleatorizador {

    private final int numeroGenerado;
    
    // Constructor privado para que no pueda llamarse externamente.
    private AleatorizadorSingleton(){ 
        numeroGenerado = new Random().nextInt(1000000);
    }

    @Override
    public int obtenerNumero() {
        return numeroGenerado;
    }

    // Punto de acceso para obtener una instancia.
    public static AleatorizadorSingleton obtenerInstancia() {
        return SingletonHelper.INSTANCIA;
    }
    
    // Implementación de Bill Pugh de una clase interna para obtener Singleton.
    private static class SingletonHelper {
        private static final AleatorizadorSingleton INSTANCIA = new AleatorizadorSingleton();
    }
}
