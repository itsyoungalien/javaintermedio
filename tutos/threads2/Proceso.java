package tutos.threads2;
/* Created By Young Alien | @itsyoungalien
 * Version 1.0.0
 * Date 17/07/2023
 * clase para ejecucion de hilos en simultaneo
 */
public class Proceso extends Thread{
    int num;

    public Proceso(String nombre){
        super(nombre);
    }

    public void run(){
        for(int i = 0; i <= num; i++){
            System.out.println(i + this.getName());
        }
        System.out.println("");
    }
    
    public void Valor(int valor){
        this.num = valor;
    }
}