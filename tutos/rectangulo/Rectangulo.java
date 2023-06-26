package tutos.rectangulo;
/* Created by @itsyoungalien (Young Alien)
 * Date: 26/06/2023
 * Version 1.0.0
 */

public class Rectangulo {
    int base, altura, area;
    
    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    public void Operaciones(){
        area = base * altura;
    }
    public void Imprimir(){
        Operaciones();
        System.out.print("El area del rectangulo es: " + area);
    }
}
