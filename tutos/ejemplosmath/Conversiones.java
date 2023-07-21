package tutos.ejemplosmath;
/* Created By Young Alien | @itsyoungalien
 * Version 1.0.0
 * Date 21/07/2023
 */
public class Conversiones{
    public static void main(String[] args){
        double anguloEnGrados = 45;
        double anguloEnRadianes = Math.toRadians(anguloEnGrados);

        System.out.println("Deg a Rad: " + anguloEnGrados + "° = " + anguloEnRadianes + " rad.");
        System.out.println("Rad a Deg: " + anguloEnRadianes + " rad = " + anguloEnGrados + "°.");
    }
}
