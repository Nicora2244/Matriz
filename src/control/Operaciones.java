/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author nicolas.ramirez_ara
 */
public class Operaciones {
    
    // Método para la traslación
    public static double[][] traslacion(double x, double y, double z) {
        double[][] matriz = new double[4][4];

        matriz[0][0] = 1; matriz[0][1] = 0; matriz[0][2] = 0; matriz[0][3] = x;
        matriz[1][0] = 0; matriz[1][1] = 1; matriz[1][2] = 0; matriz[1][3] = y;
        matriz[2][0] = 0; matriz[2][1] = 0; matriz[2][2] = 1; matriz[2][3] = z;
        matriz[3][0] = 0; matriz[3][1] = 0; matriz[3][2] = 0; matriz[3][3] = 1;

        return matriz;
    }

    // Método para la rotación en X
    public static double[][] rotacionX(double angulo) {
        double[][] matriz = new double[4][4];

        double radianes = Math.toRadians(angulo);
        double coseno = Math.cos(radianes);
        double seno = Math.sin(radianes);

        matriz[0][0] = 1; matriz[0][1] = 0; matriz[0][2] = 0; matriz[0][3] = 0;
        matriz[1][0] = 0; matriz[1][1] = coseno; matriz[1][2] = -seno; matriz[1][3] = 0;
        matriz[2][0] = 0; matriz[2][1] = seno; matriz[2][2] = coseno; matriz[2][3] = 0;
        matriz[3][0] = 0; matriz[3][1] = 0; matriz[3][2] = 0; matriz[3][3] = 1;

        return matriz;
    }

    // Método para la rotación en Y
    public static double[][] rotacionY(double angulo) {
        double[][] matriz = new double[4][4];

        double radianes = Math.toRadians(angulo);
        double coseno = Math.cos(radianes);
        double seno = Math.sin(radianes);

        matriz[0][0] = coseno; matriz[0][1] = 0; matriz[0][2] = seno; matriz[0][3] = 0;
        matriz[1][0] = 0; matriz[1][1] = 1; matriz[1][2] = 0; matriz[1][3] = 0;
        matriz[2][0] = -seno; matriz[2][1] = 0; matriz[2][2] = coseno; matriz[2][3] = 0;
        matriz[3][0] = 0; matriz[3][1] = 0; matriz[3][2] = 0; matriz[3][3] = 1;

        return matriz;
    }

    // Método para la rotación en Z
    public static double[][] rotacionZ(double angulo) {
        double[][] matriz = new double[4][4];

        double radianes = Math.toRadians(angulo);
        double coseno = Math.cos(radianes);
        double seno = Math.sin(radianes);

        matriz[0][0] = coseno; matriz[0][1] = -seno; matriz[0][2] = 0; matriz[0][3] = 0;
        matriz[1][0] = seno; matriz[1][1] = coseno; matriz[1][2] = 0; matriz[1][3] = 0;
        matriz[2][0] = 0; matriz[2][1] = 0; matriz[2][2] = 1; matriz[2][3] = 0;
        matriz[3][0] = 0; matriz[3][1] = 0; matriz[3][2] = 0; matriz[3][3] = 1;

        return matriz;
    }

    // Método para la escala
    public static double[][] escala(double x, double y, double z) {
        double[][] matriz = new double[4][4];

        matriz[0][0] = x; matriz[0][1] = 0; matriz[0][2] = 0; matriz[0][3] = 0;
        matriz[1][0] = 0; matriz[1][1] = y; matriz[1][2] = 0; matriz[1][3] = 0;
        matriz[2][0] = 0; matriz[2][1] = 0; matriz[2][2] = z; matriz[2][3] = 0;
        matriz[3][0] = 0; matriz[3][1] = 0; matriz[3][2] = 0; matriz[3][3] = 1;

        return matriz;
    }

    // Método para la multiplicación de matrices
    public static double[][] multiplicacionMatrices(double[][] matriz1, double[][] matriz2) {
        double[][] matrizResultado = new double[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizResultado[i][j] = 0;
                for (int k = 0; k < 4; k++) {
                    matrizResultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        return matrizResultado;
    }
    
    public void imprimirMatriz(double[][] matriz) {
    
}
}
