package ex8;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] precos = new double[10];
        int[] quantidades = new int[10];
        
        for(int i = 0; i < 10; i++){
            System.out.println("--- Objeto " + (i + 1) + " ---");
            System.out.print("Digite o valor unitario: R$ ");
            precos[i] = scanner.nextDouble();
            System.out.print("Digite a quantidade vendida: ");
            quantidades[i] = scanner.nextInt();
        }
        double totalGeralVendas = 0;
        int maiorQuantidade = 0;
        int posicaoMaisVendido = 0;
        
        System.out.println("\n========== RELATORIO DE VENDAS ==========");
        for(int i = 0; i < 10; i++){
            double valorTotalObjeto = precos[i] * quantidades[i];
            totalGeralVendas = totalGeralVendas + valorTotalObjeto;
            System.out.println("Objeto " + i + " | Qtd: " + quantidades[i] + " | Valor Unitario: R$ " + precos[i] + " | Total: R$ " + valorTotalObjeto);
            if(quantidades[i] > maiorQuantidade){
                maiorQuantidade = quantidades[i];
                posicaoMaisVendido = i;
            }
        }
        double comissao = totalGeralVendas * 0.05;
        
        System.out.println("\n========== RESULTADOS FINAIS ==========");
        System.out.println("Valor geral das vendas: R$ " + totalGeralVendas);
        System.out.println("Valor da comissao paga ao vendedor: R$ " + comissao);
        
        System.out.println("\nO objeto MAIS VENDIDO teve a quantidade de: " + maiorQuantidade + " unidades.");
        System.out.println("O valor unitario desse objeto mais vendido: R$ " + precos[posicaoMaisVendido]);
        System.out.println("A posicao dele no vetor e: " + posicaoMaisVendido);
    }
}
