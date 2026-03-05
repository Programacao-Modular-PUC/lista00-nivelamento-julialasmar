package ex6;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        
        char[] gabarito = new char[8];
        int totalAprovados = 0;

        System.out.println("--- Cadastro do Gabarito ---");
        for (int i = 0; i < 8; i++) {
            System.out.print("Resposta da questao " + (i + 1) + ": ");
            gabarito[i] = scanner.next().charAt(0);
        }

        for (int aluno = 1; aluno <= 10; aluno++) {
            System.out.println("\n--- Dados do Aluno " + aluno + " ---");
            System.out.print("Digite o número do aluno: ");
            int numeroAluno = scanner.nextInt();
            
            int nota = 0;
            
            for (int i = 0; i < 8; i++) {
                System.out.print("Resposta do aluno para questao " + (i + 1) + ": ");
                char respostaAluno = scanner.next().charAt(0);
                
                if (respostaAluno == gabarito[i]) {
                    nota++;
                }
            }

            System.out.println("Aluno nº " + numeroAluno + " - Nota: " + nota);

            if (nota >= 6) {
                totalAprovados++;
            }
        }

        double porcentagemAprovacao = (totalAprovados * 100.0) / 10;
        System.out.println("\n------------------------------");
        System.out.println("Porcentagem de aprovação: " + porcentagemAprovacao + "%");
    }
}
