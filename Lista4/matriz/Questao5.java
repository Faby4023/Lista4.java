public class Questao5 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int determinante = calcularDeterminante3x3(matriz);
        System.out.println("O determinante da matriz é: " + determinante);
    }

    public static int calcularDeterminante3x3(int[][] matriz) {
        int a = matriz[0][0];
        int b = matriz[0][1];
        int c = matriz[0][2];
        int d = matriz[1][0];
        int e = matriz[1][1];
        int f = matriz[1][2];
        int g = matriz[2][0];
        int h = matriz[2][1];
        int i = matriz[2][2];

        int determinante = a * (e * i - f * h) - b * (d * i - f * g) + c * (d * h - e * g);
        return determinante;
    }
}
