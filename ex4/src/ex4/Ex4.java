package ex4;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho de X:");
        int n = scanner.nextInt();

        System.out.print("Digite o tamanho de Y:");
        int m = scanner.nextInt();

        int[] X = new int[n];
        int[] Y = new int[m];
        int[] Z = new int[n + m]; 

        System.out.print("Digite os elementos de X:");
        for (int i = 0; i < n; i++) {
            X[i] = scanner.nextInt();
            Z[i] = X[i]; 
        }
        
        int tamanhoZ = n;
        System.out.print("Digite os elementos de Y:");
        
        for (int i = 0; i < m; i++) {
            Y[i] = scanner.nextInt();

            boolean existe = false;
            for (int j = 0; j < tamanhoZ; j++) {
                if (Y[i] == Z[j]) {
                    existe = true;
                    break;
                }
            }

            if (!existe) {
                Z[tamanhoZ] = Y[i];
                tamanhoZ++;
            }
        }
        System.out.print("Vetor Uniao Z:");
        for (int i = 0; i < tamanhoZ; i++) {
            System.out.print(Z[i] + " ");
        }
    }
    
}
