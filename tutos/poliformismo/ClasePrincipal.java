package tutos.poliformismo;
/*Created By Young Alien | @itsyoungalien
 * Date 03/07/2023
 * Version 1.0.0
 */

public class ClasePrincipal{
    public static void main(String[] args){

        ClasePadre mensajero1 = new ClaseHija_Suma();
        mensajero1.Datos();
        mensajero1.Operaciones();
        mensajero1.Resultado();

        ClasePadre mensajero2 = new ClaseHija_Resta();
        mensajero2.Datos();
        mensajero2.Operaciones();
        mensajero2.Resultado();
    }
}
