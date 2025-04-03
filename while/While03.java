/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package while03;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class While03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Escolha um numero: ");
        int n1 = entrada.nextInt();
            System.out.println("Numeros impares de 1 ate o numero selecionado");
        for (int im = 1; im <= n1; im ++){
                if (im % 2 != 0){
                    System.out.println(im);
                }
            }
        
        System.out.println();
        System.out.println("Numeros pares de 1 ate o numero selecionado");
        for (int im = 1; im <= n1; im ++){
                if (im % 2 == 0){
                    System.out.println(im);
                }
            }
    }
    
}
