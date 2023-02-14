

package Semaforos;

/**
 *
 * Classe que define um semáforo
 */
public class Semaforo {
private int value;
   public Semaforo(int v) {
     value=v;
   }

    public int getValue() {
        return value;
    }

    //Decrementa o valor do semáforo se este for menor ou igual a zero e põe o thread em espera
    public synchronized void P() {
      while(value<=0) {
        try {
          wait();//thread espera
        }
        catch (Exception e) {
        System.out.println("Erro na espera");
      }
     }
     value--;
    }

   //Incrementa o valor do semáforo e tira o thread da espera
   public synchronized void V() {
    ++value;
    notify(); //acorda thread
   }
}