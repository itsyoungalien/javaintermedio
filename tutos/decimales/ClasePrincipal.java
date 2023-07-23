package tutos.decimales;
import java.text.DecimalFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;
/* Created By Young Alien | @itstoungalien
 * Version 1.0.0
 * Date 22/07/2023
 * clase practica para metodos sobre decimales
 */
public class ClasePrincipal{
    public static void main(String[] args){
        double numero = 2;
        double raiz = Math.sqrt(numero);

        System.out.println("Raiz cuadrada de " + numero + " = " + raiz);

        // utilizando clase Decimal Format
        DecimalFormat df = new DecimalFormat("#.0000");
        System.out.println("Raiz cuadrada de " + numero + " = " + df.format(raiz));

        // utilizando String Format
        System.out.println("Raiz cuadrada de " + numero + " = " + String.format("%.3f", raiz));

        //utilizando clase Math.round
        System.out.println("Raiz cuadrada de " + numero + " = " + (double)Math.round(raiz * 100d)/100);

        // utilizando clase Big Decimal
        BigDecimal bd = new BigDecimal(raiz);
        bd = bd.setScale(1, RoundingMode.HALF_UP);
        System.out.println("Raiz cuadrada de " + numero + " = " + bd.doubleValue());
        
    }
}