package pruebas.cajero.clases;
import java.util.Scanner;
/* Created By Young Alien | @itsyoungalien
 * Version 1.0.0
 * Date 14/07/2023
 */
public abstract class Datos{
    protected int valor, transacciones;
    private static int saldo;

    Scanner data = new Scanner(System.in);
    
    public void Operaciones(){
        int bandera = 0, opcion = 0;
        
        System.out.println("¡Bienvenido al Cajero!");
        
        do{
            do{
                System.out.println("------------------------------");
                System.out.println("Selecciona una opcion:");
                System.out.println("    1. Retirar efectivo.");
                System.out.println("    2. Depositar efectivo.");
                System.out.println("    3. Consultar saldo.");
                System.out.println("    4. Salir.");
                opcion = data.nextInt();
                System.out.println("------------------------------");
                
                if(opcion >= 1 && opcion <= 4){
                    bandera = 1;
                } else{
                    System.out.println("------------------");
                    System.out.println("Orden invalida.");
                    System.out.println("------------------");
                }
            } while(bandera == 0);

            if(opcion == 1){
                Datos abc = new Retiro();
                abc.Transacciones();
            }
            if(opcion == 2){
                Datos abc = new Deposito();
                abc.Transacciones();
            }
            if(opcion == 3){
                Datos abc = new Consulta();
                abc.Transacciones();
            }
            if(opcion == 4){
                System.out.println("--------------------");
                System.out.println("Sesion finalizada.");
                System.out.println("--------------------");
                bandera = 2;
            }
        } while(bandera != 2);
    }
    
    public void Retirar(){
        valor = data.nextInt();
    }
    
    public void Depositar(){
        valor = data.nextInt();
    }

    // metodo abstracto para operaciones
    public abstract void Transacciones();
    
    // metodos setter & getter para variable "saldo"
    public static int getSaldo(){
        return saldo;
    }

    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
    
}
