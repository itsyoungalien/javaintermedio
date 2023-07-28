package tutos.listapila;

import javax.swing.JOptionPane;

/* Created By Young Alien | @itsyoungalien
 * Version 1.0.0
 * Date 27/07/2023
 */
public class Pila{
    private Nodo UltimoValor;
    int tamano = 0;
    String Lista = "";

    public Pila(){
        UltimoValor = null;
        tamano = 0;
    }

    //metodo para verificar si la pila esta vacia
    public boolean PilaVacia(){
        return UltimoValor == null;
    }

    //metodo para instertar un nodo en la lista
    public void InsertarNodo(int nodo){
        Nodo NuevoNodo = new Nodo(nodo);
        NuevoNodo.siguiente = UltimoValor;
        UltimoValor = NuevoNodo;
        tamano++;
    }

    //metodo para quitar un nodo de la lista
    public int QuitarNodo(){
        int auxiliar = UltimoValor.informacion;
        UltimoValor = UltimoValor.siguiente;
        tamano--;
        return auxiliar;
    }

    //mostrar ultimo valor de la lista
    public int UltimoValorIngresado(){
        return UltimoValor.informacion;
    }

    //verificar el tamano de la lista
    public int TamanoPila(){
        return tamano;
    }

    //metodo para vaciar la lista
    public void VaciarPila(){
        while(!PilaVacia()){
            QuitarNodo();
        }
    }

    //metodo para mostrar el contenido de la lista
    public void MostrarValores(){
        Nodo recorrido = UltimoValor;
        while(recorrido != null){
            Lista += recorrido.informacion + "\n";
            recorrido = recorrido.siguiente;
        }
        JOptionPane.showMessageDialog(null, Lista);
        Lista = "";
    }
}
