package tutos.listapila;
import javax.swing.JOptionPane;
/* Created By  Young Alien | @itsyoungalien
 * Version 1.0.1
 * Date 27/07/2023
 */
public class ClasePrincipal{
    public static void main(String[] args){
        Pila pila = new Pila();
        int opcion = 0, nodo = 0;

        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menu de opciones\n\n"
                    + "1. Insertar un nodo.\n"
                    + "2. Eliminar un nodo.\n"
                    + "3. La Pila esta vacia?\n"
                    + "4. Cual es el ultimo valor ingresado en la Pila?\n"
                    + "5. Cuantos nodos tiene la Pila?\n"
                    + "6. Vaciar Pila\n"
                    + "7. Mostrar contenido de la Pila.\n"
                    + "8. Salir.\n\n"
                ));
                switch(opcion){
                    case 1:
                    nodo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el valor del nodo: "));
                    pila.InsertarNodo(nodo);
                        break;
                    case 2:
                    if(!pila.PilaVacia()){
                        JOptionPane.showMessageDialog(null, "Se ha eliminado el nodo con valor: " + pila.QuitarNodo());
                    } else{
                        JOptionPane.showMessageDialog(null, "La pila esta vacia.");
                    }
                        break;
                    case 3:
                    if(pila.PilaVacia()){
                        JOptionPane.showMessageDialog(null, "La pila esta vacia.");
                    } else{
                        JOptionPane.showMessageDialog(null, "La pila NO esta vacia");
                    }
                        break;
                    case 4:
                        if(!pila.PilaVacia()){
                            JOptionPane.showMessageDialog(null, "El ultimo valor ingresado en la pila es: " + pila.UltimoValorIngresado());
                        } else{
                            JOptionPane.showMessageDialog(null, "La pila esta vacia.");
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "La pila contiene: " + pila.TamanoPila() + " nodos.");
                        break;
                    case 6:
                        if(!pila.PilaVacia()){
                            pila.VaciarPila();
                            JOptionPane.showMessageDialog(null, "Se ha vaciado la pila correctamente.");
                        } else{
                            JOptionPane.showMessageDialog(null, "La pila esta vacia.");
                        }
                        break;
                    case 7:
                        pila.MostrarValores();
                        break;
                    case 8:
                        opcion = 8;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta, vuelve a intentar nuevamente.");
                        break;
                }
            } catch(NumberFormatException e){

            }
        }while(opcion != 8);
    }
}
