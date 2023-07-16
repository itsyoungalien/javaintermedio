package tutos.threads;
/* Created By Young Alien | @itsyoungalien
 * Version 1.0.0
 * Date 16/07/2023
 * Extension de clase parctica de Treads(hilos)
 */
public class Proceso2 implements Runnable{
    @Override
    public void run(){
        for(int i = 0; i<= 13; i++){
            System.out.println("Proceso 2");
        }
    }
}
