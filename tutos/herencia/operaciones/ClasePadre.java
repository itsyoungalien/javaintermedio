package tutos.herencia.operaciones;
import java.util.Scanner;

public class ClasePadre{
    protected int valor1, valor2, resultado;
    Scanner data = new Scanner(System.in);

    public void PedirValores(){
        System.out.println("Dame el primer valor: ");
        valor1 = data.nextInt();

        System.out.println("Dame el segundo valor: ");
        valor2 = data.nextInt();
    }
    public void Resultado(){
        System.out.println(resultado);
    }
}