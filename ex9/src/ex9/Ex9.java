package ex9;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[6];
        
        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o " + (i + 1) + " numero: ");
            numeros[i] = scanner.nextInt();
        }
        
        System.out.println("\n========== RELATORIO ==========");
        
        System.out.println("Os numeros pares sao:");
        int somaPares = 0;
        
        for (int i = 0; i < 6; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("numero " + numeros[i] + " na posicao " + (i + 1));
                somaPares = somaPares + numeros[i];
            }
        }
        
        System.out.println("Soma dos pares = " + somaPares);
        System.out.println();
        
        System.out.println("Os numeros impares sao:");
        int quantidadeImpares = 0;
        
        for (int i = 0; i < 6; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println("numero " + numeros[i] + " na posicao " + (i + 1));
                quantidadeImpares = quantidadeImpares + 1;
            }
        }
        System.out.println("Quantidade de impares = " + quantidadeImpares);
    }
}
