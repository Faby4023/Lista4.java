import java.util.Scanner;
public class Questao7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[2][2];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matriz:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        if(2 == 2){
            int det = (matriz[0][0] * matriz [1][1]) - (matriz[0][1] * matriz [1][0]);
            System.out.println("O determinante é: " + det);
        }

        // Imprime a diagonal principal
//        System.out.println("Diagonal Principal:");
//        for (int i = 0; i < n; i++) {
//            System.out.print(matriz[i][i] + " ");
//        }
//        System.out.println();

        // Imprime a diagonal secundária
//        System.out.println("Diagonal Secundária:");
//        for (int i = 0; i < n; i++) {
//            System.out.print(matriz[i][n - 1 - i] + " ");
//        }
//        System.out.println();


    }
}
