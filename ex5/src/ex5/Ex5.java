package ex5;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maiorIdade = 0;
        int menorIdade = 999; 
        int mulheresEspecificas = 0; 
        
        int totalHabitantes = 0; 

        System.out.println("--- Inicio da Pesquisa ---");

        while (true) {
            System.out.print("Digite a idade (ou -1 para encerrar): ");
            int idade = scanner.nextInt();

            if (idade == -1) {
                break;
            }
            
            totalHabitantes++;
            
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (idade < menorIdade) {
                menorIdade = idade;
            }

            System.out.print("Sexo (m para masculino, f para feminino): ");
            String sexo = scanner.next();

            System.out.print("Cor dos olhos (a=azuis, v=verdes, c=castanhos): ");
            String olhos = scanner.next();

            System.out.print("Cor dos cabelos (l=louros, c=castanhos, p=pretos): ");
            String cabelos = scanner.next();

            if (sexo.equalsIgnoreCase("f") && idade >= 18 && idade <= 35 && olhos.equalsIgnoreCase("v") && cabelos.equalsIgnoreCase("l")) {
                mulheresEspecificas++;
            }
            System.out.println("-------------------------");
        }

        System.out.println("\n--- Resultados da Pesquisa ---");
        
        if (totalHabitantes == 0) {
            System.out.println("Nenhum habitante foi registrado.");
        } else {
            System.out.println("Maior idade: " + maiorIdade);
            System.out.println("Menor idade: " + menorIdade);
            System.out.println("Quantidade de mulheres (18-35 anos, olhos verdes, cabelos louros): " + mulheresEspecificas);
        }
    }
}
