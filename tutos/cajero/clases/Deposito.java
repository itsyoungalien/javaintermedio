package tutos.cajero.clases;
/* Created by Young Alien | @itsyoungalien
 * Version 1.0.0
 * Date 09/07/2023
 */
public class Deposito extends Procesamiento{
    @Override
    public void Transacciones(){
        System.out.println("Ingresa la cantidad que deseas depositar");
        Deposito();
        transacciones = getSaldo();
        setSaldo(transacciones + deposito);
        System.out.println("----------------------------");
        System.out.println("Depositaste: " + deposito);
        System.out.println("Saldo actual: " + getSaldo());
        System.out.println("----------------------------");
    }
}
