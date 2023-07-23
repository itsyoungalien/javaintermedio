package tutos.aleatorio;
import java.util.Random;
/* Created By Young Alien | @itsyoungalien
 * Version 1.0.0
 * Date 23/07/2023
 * Creando numeros aleatorios
 */
public class ClaseDos {
    public static void main(String[] args){
        int aleatorio = 0;

        Random r = new Random();

        aleatorio = (int)(r.nextFloat() * 100);
        System.out.println(aleatorio);
    }
}
