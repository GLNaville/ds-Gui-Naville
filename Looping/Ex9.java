
package ex9;
import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        int n = entrada.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        while (n < 0) {
            System.out.println("O numero nao pode ser menor que 0."); 
            int a = entrada.nextInt();
        
        for (int i = 1; i <= a; i++) {
            System.out.println(i);
        }
        }
    }
    
}
