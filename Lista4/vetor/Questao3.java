import java.util.Scanner;

public class Questao3{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] n = new int[3];

        System.out.println("Digite os números do vetor:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Número: ");
            n[i] = s.nextInt();
        }

        for (int i = 0; i < 3 / 2; i++) {
            int temp = n[i];
            n[i] = n[3 - 1 - i];
            n[3 - 1 - i] = temp;
        }

        System.out.println("Vetor invertido:");
        for (int i = 0; i < 3; i++) {
            System.out.print(n[i] + " ");
        }
    }
}
