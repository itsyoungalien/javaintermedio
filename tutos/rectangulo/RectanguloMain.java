package tutos.rectangulo;
import java.util.Scanner;
/* Created by @itsyoungalien (Young Alien)
 * Date: 26/06/2023
 * Version 1.0.0
 */

public class RectanguloMain{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Ingresa el valor de la base: ");
        int base = in.nextInt();

        System.out.print("Ingresa el valor de la altura: ");
        int altura = in.nextInt();

        // mandar datos a procesamiento
        Rectangulo mensajero = new Rectangulo(base, altura);
        // traer e imprimir datos procesados
        mensajero.Imprimir();
    }
}