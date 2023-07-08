package tutos.cajero.clases;
import java.util.Scanner;
/* Created by Young Alien | @itsyoungalien
 * Version 1.0.0
 * Date 08/07/2023
 */
public class Procesamiento{
    protected int transacciones, retiro, deposito;
    private static int saldo;
    Scanner data = new Scanner(System.in);
    
    //pedir datos y procesar operaciones
    public void Operaciones(){
        int bandera = 0, opcion = 0;
        do{
            System.out.println("--------------------------------");          
            System.out.println("Selecciona una opcion:");
            System.out.println("    1.Retiro de efectivo.");
            System.out.println("    2.Deposito de fectivo.");
            System.out.println("    3.Consultar saldo.");
            System.out.println("    4.Salir.");
            opcion = data.nextInt();
            System.out.println("--------------------------------");
            do{
                if(opcion >= 1 && opcion <= 4){
                    bandera = 1;
                } else{
                    System.out.println("--------------------");
                    System.out.println("Orden desconocida");
                    System.out.println("--------------------");
                }
            } while(bandera == 0);
            if(opcion == 1){

            } else if(opcion ==2){

            } else if(opcion ==3){

            } else if(opcion == 4){
                System.out.println("-------------------");
                System.out.println("Sesion finalizada.");
                System.out.println("-------------------");
            }
        } while(bandera != 2);
    }
}
