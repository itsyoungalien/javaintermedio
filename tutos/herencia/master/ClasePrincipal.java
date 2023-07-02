package tutos.herencia.master;
import tutos.herencia.operaciones.ClaseHija_Resta;
import tutos.herencia.operaciones.ClaseHija_Suma;

public class ClasePrincipal{
    public static void main(String[] args){
        ClaseHija_Suma mensajero = new ClaseHija_Suma();
        mensajero.PedirValores();
        mensajero.Suma();
        System.out.println("El resultado de tu suma es: ");
        mensajero.Resultado();;

        ClaseHija_Resta mensajero2 = new ClaseHija_Resta();
        mensajero2.PedirValores();
        mensajero2.Resta();
     
       System.out.println("El resultado de tu resta es: ");
        mensajero2.Resultado();
    }
}
