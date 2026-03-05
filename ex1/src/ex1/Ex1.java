package ex1;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero:");
        int numero = scanner.nextInt();
        
        int fatorial = 1;
        for(int i = 1; i <= numero; i++){
            fatorial *= i;
        }
        System.out.println("O resultado do faorial de " + numero + " eh: " + fatorial);
    }
}