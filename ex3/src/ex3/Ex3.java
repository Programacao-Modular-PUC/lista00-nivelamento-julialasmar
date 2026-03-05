package ex3;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();

        int[] prog = new int[n];
        int[] model = new int[n];

        System.out.println("Digite os numeros do vetor de Programacao: ");
        for (int i = 0; i < n; i++) {
            prog[i] = scanner.nextInt();
        }

        System.out.println("Digite os numeros do vetor de Modelagem: ");
        for (int i = 0; i < n; i++) {
            model[i] = scanner.nextInt();
        }

        int contador = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (prog[i] == model[j]) {
                    contador++;
                    break;
                }
            }
        }
        System.out.println("Quantidade de alunos matriculados nas duas UCs: " + contador);
    }
}
