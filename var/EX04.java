/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex04;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class EX04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        System.out.println("Determine a base do triangulo: ");
        int b = entrada.nextInt();
      
        System.out.println("Determine a altura do triangulo: ");
        int h = entrada.nextInt();
        
        int a = (b*h)/2;
        System.out.println("A area do triangulo e:  " +a);
    }
    
}
