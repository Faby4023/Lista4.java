import java.util.Scanner;
public class Questao4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[][] matriz = new int[5][2];

        System.out.println("Digite os números do vetor:");
        for ( int i = 0;i < 5; i++){
            for (int j = 0; j < 2; j++){
                System.out.print("Número : ");
                matriz[i][j] = s.nextInt();
            }
        }

        System.out.print("Digite o número a ser buscado: ");
        int numero = s.nextInt();

        int linha =-1;
        int coluna=-1;
        for (int i = 0; i < 5; i++){
            for(int j = 0; j < 2; j++){
                if (matriz[i][j] == numero) {
                    linha = i;
                    coluna=j;
                    break;
                }
            }
        }

        if (linha >0 & coluna >0) {
            System.out.println("Número " + numero + " encontrado na posição linha: " + linha + " Posição coluna: " + coluna);
        } else {
            System.out.println("Número " + numero + " não encontrado no vetor.");
        }
    }
}