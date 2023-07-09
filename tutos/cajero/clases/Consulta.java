package tutos.cajero.clases;

public class Consulta extends Procesamiento{
    @Override
    public void Transacciones(){
        System.out.println("-----------------------------");
        System.out.println("Saldo actual: " + getSaldo());
        System.out.println("-----------------------------");
    }
}