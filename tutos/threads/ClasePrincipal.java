package tutos.threads;
/* Created By Young Alien | @itsyoungalien
 * Version 1.0.0
 * Date 16/07/2023
 * Clase Main de clase parctica de Treads(hilos)
 */
public class ClasePrincipal{
    public static void main(String[] args){
        Proceso1 abc1 = new Proceso1();
        Thread abc2 = new Thread(new Proceso2());

        // los metodos se ejecutann en simultaneo
        abc1.start();
        abc2.start();
    }
}
