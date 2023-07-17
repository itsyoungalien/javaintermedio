package tutos.threads2;
/* Created By Young Alien | @itsyoungalien
 * Version 1.0.0
 * Date 17/07/2023
 * clase main para ejecucion de hilos en simultaneo
 */
public class ClasePrincipal{
    public static void main(String[] args){
        Proceso abc1 = new Proceso("-Hilo 1");
        Proceso abc2 = new Proceso("-Hilo 2");
        Proceso abc3 = new Proceso("-Hilo 3");

        abc1.Valor(5);
        abc2.Valor(10);
        abc3.Valor(7);

        abc1.start();
        abc2.start();
        abc3.start();
    }
    
}
