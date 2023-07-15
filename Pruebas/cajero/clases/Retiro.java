package pruebas.cajero.clases;
/* Created By Young Alien | @itsyoungalien
 * Version 1.0.0
 * Date 14/07/2023
 */
public class Retiro extends Datos{
        @Override
        public void Transacciones(){
            System.out.print("Ingresa la cantidad que deseas retirar: ");
            Retirar();
            System.out.println("Procesando operacion...");
            if(valor <= getSaldo()){
               transacciones = getSaldo(); 
               setSaldo(transacciones - valor);
               System.out.println("---------------------------");
               System.out.println("Transacion exitosa");
               System.out.println("Retiraste: " + valor);
               System.out.println("Saldo actual: " + getSaldo());
               System.out.println("---------------------------");
            } else{
                System.out.println("Saldo insuficiente.");
            }
        }
}
