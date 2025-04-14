
package ex16;

import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {
           Scanner entrada = new Scanner(System.in);
           int [] nums = new int[5];
           
           System.out.println("Insira um conjunto de 5 numeros: ");
           for (int i = 0; i < 5; i++){
               System.out.println("Numero " + (i + 1) + ": ");
               nums[i] = entrada.nextInt();
           }
           
            int min = nums[0];
            int max = nums[0];
            int soma = 0;
            
            for (int i = 0; i < 5; i++){
                if (nums[i] < min){
                    min = nums[i];
                }
                if (nums[i] > max){
                    max = nums[i];
                }
                soma += nums[i];
            }
            
            System.out.println("Valor minimo: " + min);
            System.out.println("Valor maximo: " + max);
            System.out.println("Valor da soma: " + soma);
    }
    
}
