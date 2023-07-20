package tutos.sincronizaciondehilos.main;

import tutos.sincronizaciondehilos.hilos.Hilo1;
import tutos.sincronizaciondehilos.hilos.Hilo2;
import tutos.sincronizaciondehilos.hilos.Hilo3;
/* Created By Young Alien | @itsyoung alien
 * Version 1.0.0
 * Date 19/07/2023
 */
public class ClasePrincipal{
    public static void main(String[] args){
        Hilo1 abc1 = new Hilo1();
        Hilo2 abc2 = new Hilo2();
        Hilo2 abc3 = new Hilo2();
        Hilo3 abc4 = new Hilo3();

        // ejecucion del hilo 1
        abc1.start();
        try {
            abc1.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Error de sincronizacion. " + e);
        }

        // ejecucion del hilo 2 rama 1
        abc2.start();
        try {
            abc2.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Error de sincronizacion. " + e);
        }

        // ejecucion del hilo 2 rama 2
        abc3.start();
        try {
            abc3.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Error de sincronizacion. " + e);
        }

        // ejecucion del hilo 3
        abc4.start();
        try {
            abc4.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Error de sincronizacion. " + e);
        }
    }
}
