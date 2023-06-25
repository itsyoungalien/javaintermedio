package tutos.suma;
import java.util.Scanner;

public class SumaMain {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.println("Dame el valor uno:");
        int ValorUno = in.nextInt();

        System.out.println("Dame el valor dos:");
        int ValorDos = in.nextInt();

        Suma valores = new Suma(ValorUno, ValorDos);
        valores.Imprimir();

    }  
}
