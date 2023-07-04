package tutos.poliformismo;
import java.util.Scanner;
/*Created By Young Alien | @itsyoungalien
 * Date 03/07/2023
 * Version 1.0.0
 */

public abstract class ClasePadre {
    Scanner data = new Scanner(System.in);
    protected int resultado, valor1, valor2;

    //funcion para pedir datos
    public void Datos(){
    System.out.print("Dame el primer valor: ");
    valor1 = data.nextInt();

    System.out.print("Dame el segundo valor: ");
    valor2 = data.nextInt();
    }

    //declarando funcion para poliformismo
    public abstract void Operaciones();

    //funcion para resultado
    public void Resultado(){
        System.out.println("El resultado es: " + resultado);
    }
}
