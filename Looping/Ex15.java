
package ex15;
import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         System.out.println("Entre com numero: ");
         int num = entrada.nextInt();
         
         System.out.println(num + "! = ");
         
         int fatorial = 1;
         for (int i  = 2; i <= num; i++){
             fatorial *= i;
         }
         System.out.println("Resultado: " + fatorial);
    }
    
}
