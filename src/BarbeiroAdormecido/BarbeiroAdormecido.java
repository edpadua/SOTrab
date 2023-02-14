
package BarbeiroAdormecido;

import Semaforos.Semaforo;

/**
 *
 Classe que contém o cojunto de semáforos utilizado no controle de sincronismo para o problema
 * do barbeiro adormecido
 */

public class BarbeiroAdormecido {

   
    static Semaforo clientes = new Semaforo(0);
    static Semaforo barbeiros = new Semaforo(0);
    static Semaforo mutex = new Semaforo(1);
    static int waiting = 0;

    static void Barbeiro() {

        
         clientes = new Semaforo(0);
         barbeiros = new Semaforo(0);
         mutex = new Semaforo(1);
         waiting = 0;
    }

   
    

}

