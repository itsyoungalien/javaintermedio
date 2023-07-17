package tutos.threads2;
/* Created By Young Alien | @itsyoungalien
 * Version 1.0.0
 * Date 17/07/2023
 * clase para ejecucion de hilos en simultaneo
 */
public class Proceso extends Thread{
    int num;

    // metodo para asignar un nombre a los hilos desde clase main
    public Proceso(String nombre){
        super(nombre);
    }

    public void run(){
        for(int i = 0; i <= num; i++){
            System.out.println(i + this.getName());
        }
        System.out.println("");
    }
    
    // metodo para asignar un valor a los hilos desde clase main
    public void Valor(int valor){
        this.num = valor;
    }
}