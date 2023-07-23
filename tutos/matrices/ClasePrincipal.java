package tutos.matrices;
/* Created By Young Alien | @itsyoungalien
 * Version 1.0.0
 * Date 23/07/2023
 * codigo para matrices con numeros aleatorios
 */
public class ClasePrincipal{
    public static void main(String[] args){
        int MatrizUno [][] = new int [3][3];
        int MatrizDos [][] = new int [3][3];
        int  MatrizResultante [][] = new int [3][3];

        // asignando numeros a matriz uno
        for(int i = 0; i < MatrizUno.length; i++){
            for(int j = 0; j < MatrizUno.length; j++){
                MatrizUno [i][j] = (int)(Math.random()*5);
            }
        }

        // asignando numeros a matriz dos
        for(int i = 0; i < MatrizDos.length; i++){
            for(int j = 0; j < MatrizDos.length; j++){
                MatrizDos [i][j] = (int)(Math.random()*5);
            }
        }

        // suma de matrices
        for(int i = 0; i < MatrizUno.length; i++){
            for(int j = 0; j < MatrizDos.length; j++){
                MatrizResultante [i][j] = MatrizUno [i][j] + MatrizDos[i][j];
            }
        }

        // imprimir matrices
        for(int i = 0; i < MatrizUno.length; i++){
            for(int j = 0; j < MatrizUno.length; j++){
                System.out.print("[" + MatrizUno [i][j] + "]");
            }

            if(i == 1){
                System.out.print("   +   ");
            } else{
                System.out.print("       ");
            }

            for(int j = 0; j < MatrizDos.length; j++){
                System.out.print("[" + MatrizDos [i][j] + "]");
            }

            if(i == 1){
                System.out.print("   =   ");
            } else{
                System.out.print("       ");
            }

            for(int j = 0; j < MatrizResultante.length; j++){
                System.out.print("[" + MatrizResultante [i][j] + "]");
            }
            
            System.out.println("");
        }
    }
}