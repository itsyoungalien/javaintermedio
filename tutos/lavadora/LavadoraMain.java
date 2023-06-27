package tutos.lavadora;
import tutos.llfunciones.LLFunciones;
import java.util.Scanner;
/* Created By @itsyoungalien (Young Alien)
 * Version 1.0.0
 * Date 27/06/2023
 */

public class LavadoraMain {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("¿La ropa es blanca o de color?");
        System.out.println("Presiona 1 - Blanca / 2 - Ropa de color");
        int TipoDeRopa = in.nextInt();

        System.out.println("¿Cuantos kilos de ropa?");
        int kilos = in.nextInt();

        // procesamiento de datos
        LLFunciones mensajero = new LLFunciones(kilos, TipoDeRopa);
        mensajero.CicloFinalizado();
    }
}
