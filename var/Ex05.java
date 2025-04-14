/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex05;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class Ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        System.out.println("Escolha um numero: ");
        int a = entrada.nextInt();
      
        System.out.println("Escolha outro numero: ");
        int b = entrada.nextInt();
        
        System.out.println("O primeiro numero e" +a+ "  O segundo e" +b);
        
        int x = a;
        int y = b;
              
        int troca = a = b;
        int troca2 = y = x;
             System.out.println("O primeiro numero e: "+troca+"  O segundo e:"+troca2);

           
    }
    
}
