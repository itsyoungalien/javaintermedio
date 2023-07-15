package tutos.cajero.clases;
import java.util.Scanner;
/* Created by Young Alien | @itsyoungalien
 * Version 1.0.2
 * Date 09/07/2023
 */
public abstract class Procesamiento{
    protected int transacciones, retiro, deposito;
    private static int saldo;
    Scanner data = new Scanner(System.in);
    
    //pedir datos y procesar operaciones
    public void Operaciones(){
        int bandera = 0, opcion = 0;
        do{
            do{
                System.out.println("--------------------------------");          
                System.out.println("Selecciona una opcion:");
                System.out.println("    1.Retiro de efectivo.");
                System.out.println("    2.Deposito de fectivo.");
                System.out.println("    3.Consultar saldo.");
                System.out.println("    4.Salir.");
                opcion = data.nextInt();
                System.out.println("--------------------------------");

                if(opcion >= 1 && opcion <= 4){
                    bandera = 1;
                } else{
                    System.out.println("--------------------");
                    System.out.println("Orden desconocida");
                    System.out.println("--------------------");
                }
            } while(bandera == 0);
            if(opcion == 1){
                Procesamiento abc = new Retiro();
                abc.Transacciones();
            } else if(opcion ==2){
                Procesamiento abc = new Deposito();
                abc.Transacciones();
            } else if(opcion ==3){
                Procesamiento abc = new Consulta();
                abc.Transacciones();
            } else if(opcion == 4){
                System.out.println("-------------------");
                System.out.println("Sesion finalizada.");
                System.out.println("-------------------");
                bandera = 2;
            }
        } while(bandera != 2);
    }
    // metodo para retiro
    public void Retiro(){
        retiro = data.nextInt();
    }
    // metodo para deposito
    public void Deposito(){
        deposito = data.nextInt();
    }
    // metodo abstracto
    public abstract void Transacciones();

    // metodos setter y getter
    public int getSaldo(){
        return saldo;
    }
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
}
