/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alexandre.gomes.de.lira;
import java.util.Scanner;

/**
 *
 * @author CAMARGO
 */
public class ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        System.out.println("Selecione um numero: ");
        int n1 = entrada.nextInt();
      
        System.out.println("Selecione outro numero: ");
        int n2 = entrada.nextInt();
        
        int soma = n1 + n2;
        int sub = n1 - n2;
        int div = n1 / n2;
        int multi = n1 * n2;
             
        System.out.println("A soma e: " + soma + "  A subtracao e:" + sub + "  A divisao e: " + div + "  A multiplicao e: "+multi);
        
    }
    
}
