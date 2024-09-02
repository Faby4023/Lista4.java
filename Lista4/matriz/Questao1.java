package matriz;
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] n = new int[2][2];
        int[][] n2 = new int[2][2];
        int[][] n3 = new int[2][2];
        System.out.println("Digite os número dos matrizes: ");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                n[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                n2[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                n3[i][j] = n[i][j] + n2[i][j];
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(n3[i][j]);
            }

        }
    }
}




