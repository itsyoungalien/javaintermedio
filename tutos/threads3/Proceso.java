package tutos.threads3;
/* Created By Young Alien | @itsyoungalien
 * Version 1.0.0
 * Date 18/07/2023
 * Clase para el proceso de hilos con el metodo "sleep" para retardar
 */
public class Proceso extends Thread{
    public void run(){
        for(int i = 0; i <= 7; i++){
            System.out.println(i + " " + getName());
            try{
                sleep(300);
            } catch(InterruptedException e){
                System.out.println("Error en el proceso " + e);
            }
        }
    } 
}