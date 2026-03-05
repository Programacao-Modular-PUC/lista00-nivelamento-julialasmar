package ex2;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[3];
        
        System.out.print("Digite o numero para x:");
        numeros[0] = scanner.nextInt();
        System.out.print("Digite o numero para y:");
        numeros[1] = scanner.nextInt();
        System.out.print("Digite o numero para z:");
        numeros[2] = scanner.nextInt();
        
        int maior = numeros[0];
        for(int i = 0; i < 3; i++){
            if(maior < numeros[i]){
                maior = numeros[i];
            }
        }
        System.out.println("O maior numero dentre eles eh:" + maior);
        int menor = numeros[0];
        for(int i = 0; i < 3; i++){
            if(menor > numeros[i]){
                menor = numeros[i];
            }
        }
        System.out.println("O menor numero dentre eles eh:" + menor);
        
        int x = numeros[0];
        int y = numeros[1];
        int z = numeros[2];
        if(y <= z){
            if(x >= y && x <= z){
                System.out.print("O numero X esta dentro do intervalo [y,z]!");
            }else{
                System.out.print("O numero X nao esta dentro do intervalo [y,z]!");
            }
        }else{
            if(x >= z && x <= y){
                System.out.println("O numero X esta dentro do intervalo [y,z]!");
            }else{
                System.out.println("O numero X nao esta dentro do intervalo [y,z]!");
            }
        }
        if(x % y == 0 && x % z == 0){
            System.out.println("O X é divisivel por Y e por Z!");
        }else{
            System.out.println("O X nao e divisivel por Y e por Z!");
        }
 
    }
}