package tutos.sincronizaciondehilos.hilos;

/* Created By Young Alien | @itsyoung alien
 * Version 1.0.0
 * Date 19/07/2023
 */
public class Hilo2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.print("E");
            try {
                Hilo2.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en el Hilo 2." + e);
            }
        }
    }
}
