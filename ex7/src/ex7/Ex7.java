package ex7;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] meses = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        double[] temp = new double[12];
        
        int maiorPos = 0, menorPos = 0;

        for (int i = 0; i < 12; i++) {
            System.out.print("Temperatura de " + meses[i] + ": ");
            temp[i] = scanner.nextDouble();

            if (temp[i] > temp[maiorPos]) {
                maiorPos = i;
            }
            if (temp[i] < temp[menorPos]) {
                menorPos = i;
            }
        }
        System.out.println("\nMaior: " + temp[maiorPos] + "C em " + meses[maiorPos]);
        System.out.println("Menor: " + temp[menorPos] + "C em " + meses[menorPos]);
    }
    
}
