
package ex13;
import java.util.Scanner;

public class Ex13 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira ate qual termo de fibonacci voce gostaria de gerar: ");
        int n = entrada.nextInt();
        int termo1 = 0, termo2 = 1;
    System.out.println("Serie de Fibonacci ate o " + n + " termo:");

    for (int i = 1; i <= n; ++i) {
      System.out.print(termo1 + ", ");

      // compute the next term
      int proxTermo = termo1 + termo2;
      termo1 = termo2;
      termo2 = proxTermo;
    }
  }
}
