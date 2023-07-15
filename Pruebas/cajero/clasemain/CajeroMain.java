package pruebas.cajero.clasemain;
import pruebas.cajero.clases.Consulta;
import pruebas.cajero.clases.Datos;

/* Created By Young Alien | @itsyoungalien
 * Version 1.0.0
 * Date 14/07/2023
 */
public class CajeroMain{
    public static void main (String[] args){
        Datos abc = new Consulta();
        abc.setSaldo(500);
        abc.Operaciones();
    }
}
