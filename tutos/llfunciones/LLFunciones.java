package tutos.llfunciones;
/* Created By @itsyoungalien (Young Alien)
 * Version 1.0.1
 * Date 27/06/2023
 * clase para las funciones logicas de una lavadora
 */
public class LLFunciones{
    int kilos = 0, TipoDeRopa = 0, llenadoCompleto = 0, SecadoCompleto = 0, LavadoCompleto = 0;
    
    public LLFunciones(int kilos, int TipoDeRopa){
        this.kilos = kilos;
        this.TipoDeRopa = TipoDeRopa;
    }
    // funcion para evaluar condiciones de llenado de la lavadora
    private void Llenado(){
        if(kilos <= 12){
            System.out.println("Llenando...");
            System.out.println("Llenado completo.");
            llenadoCompleto = 1;
        } else{
            System.out.println("Exceso de carga, por favor extrae algo de peso.");
        }
    }
    //funcion para evaluar condiciones de lavado
    private void Lavado(){
        Llenado();
        if(llenadoCompleto == 1){
            if(TipoDeRopa == 1){
                System.out.println("Ropa Blanca/Ciclo de lavado suave.");
                System.out.println("Lavando...");
            } else if(TipoDeRopa == 2){
                System.out.println("Ropa de color/Ciclo de lavado intenso.");
                System.out.println("Lavando...");
            } else{
                System.out.println("Ciclo de lavado no registrado, se iniciara lavado intenso");
            } 
            System.out.println("Ciclo de lavado finalizado.");
            LavadoCompleto =1;
        } else{
            System.out.println("Parece ser que algo anda mal, revisa que el llenado de la lavadora este completo.");
        }
    }
    // funcion para evaluar condiciones de secado
    private void Secado(){
        Lavado();
        if(LavadoCompleto == 1){
            System.out.println("Secando...");
            SecadoCompleto = 1;
        } else{
            System.out.println("Parece ser que algo anda mal, revisa que lavado haya finalizado.");
        }
    }
    // funcion para evaluar condiciones de ciclo terminado
    public void CicloFinalizado(){
        Secado();
        if(SecadoCompleto == 1){
            System.out.println("Tu ropa esta seca, sesion de lavado exitosa!.");
        } else{
            System.out.println("Parece que algo anda mal, revisa que el secado haya finalizado.");
        }
    }
    // metodos getter y setter
    public int getTipoDeRopa(){
        return TipoDeRopa;
    }
    public void setTipoDeRopa(int TipoDeRopa){
        this.TipoDeRopa = TipoDeRopa;
    }
}