
package ex17;

import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
           int [] nums = new int[5];
           
           System.out.println("Insira um conjunto de 5 numeros entre 0 e 1000: ");
           for (int i = 0; i < 5; i++){
               int input;
               while (true){
               System.out.println("Numero " + (i + 1) + ": ");
               input = entrada.nextInt();
               
               if (input >= 0 && input <= 1000){
                   nums[i] = input;
                   break;
               } else {
                   System.out.println("Por favor, insira um numero de 0 a 1000.");
               }
            }
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
