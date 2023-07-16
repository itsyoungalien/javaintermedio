package tutos.division;
import java.util.Scanner;
/* Created By Young Alien | @itsyoungalien
 * Version 1.0.0
 * Date 16/07/2023
 * Clase practica para fallos en operaciones de codigo
 */
public class ClaseDivision{
    public static void main(String[] args){
        // metodo "try" el codigo a examinar va dentro de el
        try{
            int valor1, valor2, resultado;
            Scanner data = new Scanner(System.in);

            System.out.print("Ingresa el primer valor: ");
            valor1 = data.nextInt();

            System.out.print("Ingresa el segundo valor: ");
            valor2 = data.nextInt();

            resultado = valor1 / valor2;

            System.out.println("El resultado de tu division es: " + resultado);
        } catch(Exception e){ //metodo para mandar un mensaje cuando se ejecute un fallo
            System.out.println("Error!!! " + e);
        } finally{ // metodo para mandar mensaje final aunque la operacion haya fallado(no obligatorio)
            System.out.println("Operacion finalizada.");
        }
    }
}