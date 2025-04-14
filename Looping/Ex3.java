package ex3;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
  
        Scanner entrada = new Scanner (System.in);  
        
         System.out.println("Qual foram as duas notas do aluno (de 0 a 10)?: ");
         int n1 = entrada.nextInt();
         int n2 = entrada.nextInt();
    
         
         float med = (n1 + n2) / 2;
         System.out.println("O resultado da divisao eh: "+ med);
    }
    
}
