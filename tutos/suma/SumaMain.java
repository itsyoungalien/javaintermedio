package tutos.suma;
import java.util.Scanner;
/* By @itsyoungalien (Young Alien)
 * version 1.0.0
 * 25/05/2023
 */
public class SumaMain {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.println("Dame el valor uno:");
        int ValorUno = in.nextInt();

        System.out.println("Dame el valor dos:");
        int ValorDos = in.nextInt();
        
        // imprimir valores en pantalla
        Suma valores = new Suma(ValorUno, ValorDos);
        valores.Imprimir();

    }  
}
