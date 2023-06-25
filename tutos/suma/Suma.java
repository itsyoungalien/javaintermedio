package tutos.suma;
 
public class Suma{
    private int VUno, VDos, Resultado;

    public Suma(int ValorUno, int ValorDos){
        this.VUno = ValorUno;
        this.VDos = ValorDos;
    }
    public void Operacion(){
        Resultado = VUno + VDos;
    }
    public void Imprimir(){
        Operacion();
        System.out.println("El resultado de tu suma es:");
        System.out.print(Resultado);
    }
}