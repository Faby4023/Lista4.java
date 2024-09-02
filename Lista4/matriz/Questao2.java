public class Questao2 {
    public static void main(String[] args) {

        int[][] produto1 = {{2, 3}, {2, 3}};
        int[][] produto2 = {{2, 4}, {2, 4}};
        int[][] mult = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mult[i][j] = produto1[i][j] * produto2[i][j];
            }
        }
        System.out.println("Resultado da multiplicação:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(mult[i][j] + " ");
            }
            System.out.println();
        }
    }
}

