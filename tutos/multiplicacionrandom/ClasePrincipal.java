package tutos.multiplicacionrandom;
/* Created By Young Alien | @itsyoungalien
 * Version 1.0.0
 * Date 24/07/2023
 * multiplicacion de matrices
 */
public class ClasePrincipal{
    public static void main(String[] args){
        int matrizUno[][] = new int[2][3];
        int matrizDos[][] = new int[3][2];
        int matrizResultante[][] = new int[2][2];

        //llenando matriz uno
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                matrizUno[i][j] = (int)(Math.random()*5);
            }
        }

        //llenando matriz dos
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                matrizDos[i][j] = (int)(Math.random()*7);
            }
        }

        //multiplicacion de matrices | revisar codigo, por aluna razon las matrices 2, 3, y 4 dan cero
        if(matrizResultante[0][0] == 0){
            int temporal = (matrizUno[0][0] * matrizDos[0][0]) + (matrizUno[0][1] * matrizDos[1][0]) + (matrizUno[0][2] * matrizDos[2][0]);
            matrizResultante[0][0] = temporal;
        } else if(matrizResultante[1][0] == 0){
            int temporal = (matrizUno[1][0] * matrizDos[0][0]) + (matrizUno[1][1] * matrizDos[1][0]) + (matrizUno[1][2] * matrizDos[2][0]);
            matrizResultante[1][0] = temporal;
        } else if(matrizResultante[0][1] == 0){
            int temporal = (matrizUno[0][0] * matrizDos[0][1]) + (matrizUno[0][1] * matrizDos[1][1]) + (matrizUno[0][2] * matrizDos[2][1]);
            matrizResultante[0][1] = temporal;
        } else if(matrizResultante[1][1] == 0){
            int temporal = (matrizUno[1][0] * matrizDos[0][1]) + (matrizUno[1][1] * matrizDos[1][1]) + (matrizUno[1][2] * matrizDos[2][1]);
            matrizResultante[1][1] = temporal;
        }

        //imprimiendo matrices
        for(int i = 0; i < 3; i++){
            if(i < 2){
                for(int j = 0; j < 2; j++){
                    System.out.print("[" + matrizUno[i][j] + "]");
                }
                if(i == 1){
                    System.out.print("   x   ");
                } else{
                    System.out.print("       ");
                }
            } else{
                System.out.print("             ");
            }
            for(int j = 0; j < 2; j++){
                System.out.print("[" + matrizDos[i][j] + "]");
            }
            if(i == 1){
                System.out.print("   =   ");
            } else{
                System.out.print("       ");
            }
            if(i < 2){
                for(int j = 0; j < 2; j++){
                    System.out.print("[" + matrizResultante[i][j] + "]");
                }
            }
            System.out.println("");
        }
    }
}