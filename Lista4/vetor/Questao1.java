import java.util.Scanner;

public class Questao1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite os número dos vetores: ");
        int n[] = new int[5];

        for (int i = 0; i < n.length; i++) {
            n[i] = s.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < n.length; i++) {
            soma += n[i];
        }
        System.out.print("a soma de todos os elementos do vetor: "+ soma);
    }
}