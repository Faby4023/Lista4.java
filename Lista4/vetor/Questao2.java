import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] vetor = new int[5];

        System.out.println("Digite os números do vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + i + ": ");
            vetor[i] = s.nextInt();
        }

        System.out.print("Digite o número a ser buscado: ");
        int numero = s.nextInt();

        int posicao = 0;
        for (int i = 0; i < 5; i++) {
            if (vetor[i] == numero) {
                posicao = i;
                break;
            }
        }

        if (posicao != 1) {
            System.out.println("Número " + numero + " encontrado na posição: " + posicao);
        } else {
            System.out.println("Número " + numero + " não encontrado no vetor.");
        }


    }
}
