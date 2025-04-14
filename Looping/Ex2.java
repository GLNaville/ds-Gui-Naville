
package ex2;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
   
        Scanner entrada = new Scanner (System.in);  
        
        System.out.println("Escolha dois numeros: ");
        int x = entrada.nextInt();
        int y = entrada.nextInt();
        
        if (y == 0);
        {
            System.out.println("valor inválido"); 
        }
        while (y == 0){
            System.out.println("Escolha dois numeros: ");
        x = entrada.nextInt();
        y = entrada.nextInt();
        }
       
       float div = x / y;
            System.out.println("O resultado da divisao eh: "+ div);
    }
    
}


    
