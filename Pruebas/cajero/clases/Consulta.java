package pruebas.cajero.clases;
/* Created By Young Alien | @itsyoungalien
 * Version 1.0.0
 * Date 14/07/2023
 */
public class Consulta extends Datos{
    @Override
    public void Transacciones(){
        System.out.println("Procesando operacion...");
        System.out.println("---------------------------");
        System.out.println("Saldo actual: " + getSaldo());
        System.out.println("---------------------------");
    }
}
