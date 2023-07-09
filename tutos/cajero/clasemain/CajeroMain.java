package tutos.cajero.clasemain;
import tutos.cajero.clases.Consulta;
import tutos.cajero.clases.Procesamiento;
/* Created by Young Alien | @itsyoungalien
 * Version 1.0.1
 * Date 09/07/20232
 */
public class CajeroMain{
    public static void main(String[] args){
        Procesamiento abc = new Consulta();
        abc.setSaldo(500);
        abc.Operaciones();
    }
}
