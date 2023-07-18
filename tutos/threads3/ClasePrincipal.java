package tutos.threads3;
/* Created By Young Alien | @itsyoungalien
 * Version 1.0.0
 * Date 18/07/2023
 * Clase main para practica de metodos "sleep" y "stop" en hilos
 */
public class ClasePrincipal{
    public static void main(String[] args){
        Proceso abc1 = new Proceso();
        Proceso abc2 = new Proceso();

        abc1.start();
        try{
            abc1.sleep(3000);
        } catch(InterruptedException e){
            System.out.println("Error en el hilo 1 " + e);
        }

        
        abc2.start();
        abc2.stop();
        try{
            abc2.sleep(3000);
        } catch(InterruptedException e){
            System.out.println("Error en el hilo 2 " + e);
        }
    }
}
