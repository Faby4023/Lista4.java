import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n[] = new int[3];

        System.out.println("Digite os números dos vetores: ");
        for (int i = 0; i < 3; i++) {
            n[i] = s.nextInt();
        }

        int contPrimos = 0;
        for (int i = 0; i < 3; i++) {
            if (isPrimo(n[i])) {
                contPrimos++;
            }
        }

        System.out.println("O vetor tem quantos números primos: " + contPrimos);

    }

    public static boolean isPrimo(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
