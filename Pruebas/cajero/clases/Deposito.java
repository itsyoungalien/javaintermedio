package pruebas.cajero.clases;
/* Created By Young Alien | @itsyoungalien
 * Version 1.0.0
 * Date 14/07/2023
 */
public class Deposito extends Datos{
    @Override
    public void Transacciones(){
        System.out.println("Ingresa la cantidad que deseas depositar: ");
        Retirar();
        System.out.println("Procesando operacion...");
        transacciones = getSaldo();
        setSaldo(transacciones + valor);
        System.out.println("----------------------------");
        System.out.println("Transaccion exitosa.");
        System.out.println("Depositaste: " + valor);
        System.out.println("Saldo actual: " + getSaldo());
        System.out.println("----------------------------");
    }
}
