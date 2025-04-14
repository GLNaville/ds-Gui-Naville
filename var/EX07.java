/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex07;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class EX07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        System.out.println("Escolha um numero (nao pode ser 0): ");
        int a = entrada.nextInt();
        
        int ant = a - 1;
        
        System.out.println("O antecessor e:  " +ant);
        

    
}
}
