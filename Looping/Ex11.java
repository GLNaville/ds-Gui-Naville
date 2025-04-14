
package ex11;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        int a = entrada.nextInt();
        for(int i = 0; i <= 10; i++) {
            System.out.println(a + " x " + i + " = " + (a*i));
        }
    }
    
}