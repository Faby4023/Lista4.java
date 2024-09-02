import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] n = new int[5];

        System.out.println("Digite os números do vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + i + ": ");
            n[i] = s.nextInt();
        }
        double media = calcularMedia(n);
        double desvioPadrao = calcularDesvioPadrao(n, media);

        System.out.printf("Média: %.2f%n", media);
        System.out.printf("Desvio Padrão: %.2f%n", desvioPadrao);
    }

    public static double calcularMedia(int[] vetor) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return (double) soma / vetor.length;
    }

    public static double calcularDesvioPadrao(int[] vetor, double media) {
        double somaQuadrados = 0;
        for (int i = 0; i < vetor.length; i++) {
            somaQuadrados += Math.pow(vetor[i] - media, 2);
        }
        return Math.sqrt(somaQuadrados / vetor.length);
    }
}
