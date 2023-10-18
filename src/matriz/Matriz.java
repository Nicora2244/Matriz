/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import static control.Operaciones.escala;
import static control.Operaciones.rotacionX;
import static control.Operaciones.rotacionY;
import static control.Operaciones.rotacionZ;
import static control.Operaciones.traslacion;

/**
 *
 * @author nicolas.ramirez_ara
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] matrizTranslacion = traslacion(3, 4, 5);
        imprimirMatriz(matrizTranslacion);

        double[][] matrizRotacionX = rotacionX(45);
        imprimirMatriz(matrizRotacionX);

        double[][] matrizRotacionY = rotacionY(45);
        imprimirMatriz(matrizRotacionY);

        double[][] matrizRotacionZ = rotacionZ(45);
        imprimirMatriz(matrizRotacionZ);

        double[][] matrizEscala = escala(2, 3, 4);
        imprimirMatriz(matrizEscala);
    }

    private static void imprimirMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
    }
    }
    
    
}
