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
public class AleatorizadorComun implements Aleatorizador {
    private final int numeroGenerado;
    
    public AleatorizadorComun(){ 
        numeroGenerado = new Random().nextInt(1000000);
    }

    @Override
    public int obtenerNumero() {
        return numeroGenerado;
    }
}
