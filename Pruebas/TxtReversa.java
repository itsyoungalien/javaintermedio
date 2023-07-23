package pruebas;
import java.util.Scanner;

public class TxtReversa{
    public static void main(String args[]){
       String txtOriginal = "", txtReversa = "";
       int i = 0;
       Scanner in = new Scanner(System.in);

       System.out.println("Ingresa el texto:");
       txtOriginal = in.nextLine();
    
       i = txtOriginal.length();
       while(i != 0){
        txtReversa += txtOriginal.substring(i-1, i);
        i--;
       }
       System.out.println("Texto en reversa:");
       System.out.print(txtReversa);
    }
}