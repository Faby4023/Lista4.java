package matriz;

public class Questao6 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Dimensões da matriz
        int n = matriz.length;
        int[][] rotacionada = new int[n][n];

        // Rotacionar a matriz 90 graus no sentido horário
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotacionada[j][n - 1 - i] = matriz[i][j];
            }
        }

        // Exibir a matriz rotacionada
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rotacionada[i][j] + " ");
            }
            System.out.println();
        }
    }
}
