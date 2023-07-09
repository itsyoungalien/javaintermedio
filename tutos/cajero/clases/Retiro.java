package tutos.cajero.clases;
/* Created by Young Alien | @itsyoungalien
 * Version 1.0.0
 * Date 09/07/2023
 */
public class Retiro extends Procesamiento{
    @Override
    public void Transacciones(){
        System.out.print("Ingresa la cantidad que deseas retirar: ");
        Retiro();
        if(retiro <= getSaldo()){
            transacciones = getSaldo();
            setSaldo(transacciones - retiro);
            System.out.println("----------------------------");
            System.out.println("Retiraste: " + retiro);
            System.out.println("Saldo actual: " + getSaldo());
            System.out.println("----------------------------");
        } else{
            System.out.println("Saldo insuficiente.");
        }   
    }
}
