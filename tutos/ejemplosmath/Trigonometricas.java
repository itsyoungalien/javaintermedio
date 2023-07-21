package tutos.ejemplosmath;
/* Created By Young Alien | @itsyoungalien
 * Version 1.0.0
 * Date 21/07/2023
 */
public class Trigonometricas{
    public static void main(String[] args){
        double resultado;
        double anguloEnGrados = 45;
        double anguloEnRadianes = Math.toRadians(anguloEnGrados);

        // seno
        resultado = Math.sin(anguloEnRadianes);
        System.out.println("Seno de " + anguloEnGrados + "° = " + resultado);

        // coseno
        resultado = Math.cos(anguloEnRadianes);
        System.out.println("Coseno de " + anguloEnGrados + "° = " + resultado);

        // tangente
        resultado = Math.tan(anguloEnRadianes);
        System.out.println("Tangente de " + anguloEnGrados + "° = " + resultado);

        double ValorIngresado = 0.707;

        // arcoseno
        anguloEnRadianes = Math.asin(ValorIngresado);
        anguloEnGrados = Math.toDegrees(anguloEnRadianes);
        System.out.println("ArcoSeno de " + ValorIngresado + " = " + anguloEnGrados + "°");

        // arcocoseno
        anguloEnRadianes = Math.acos(ValorIngresado);
        anguloEnGrados = Math.toDegrees(anguloEnRadianes);
        System.out.println("ArcoCoseno de " + ValorIngresado + " = " + anguloEnGrados + "°");

        // arcotangente
        anguloEnRadianes = Math.atan(ValorIngresado);
        anguloEnGrados = Math.toDegrees(anguloEnRadianes);
        System.out.println("ArcoTangente de " + ValorIngresado + " = " + anguloEnGrados + "°");
    }
}
