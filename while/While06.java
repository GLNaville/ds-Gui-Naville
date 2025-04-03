/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package while06;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class While06 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Insira 10 numeros: ");
        for (int i = 0; i < 10; i++) {
            numeros[i] = entrada.nextInt();
        }

        int maiorNum = numeros[0];

        for (int numero : numeros) {
            if (numero > maiorNum) { 
                maiorNum = numero;
            }
        }

        System.out.println("O maior numero e: " + maiorNum);
        entrada.close();
    }
}