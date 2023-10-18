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
     * Método principal que se utiliza para probar las operaciones de matrices.
     * Se crean matrices de traslación, rotación (en los ejes X, Y y Z) y escala,
     * y luego se imprimen en la consola.
     * @param args
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
    
    /**
     * Método para imprimir una matriz en la consola.
     * Recorre cada fila y columna de la matriz y muestra sus valores.
     *
     * @param matriz Matriz de tipo double a imprimir.
     */
    private static void imprimirMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
    }
    }
}
