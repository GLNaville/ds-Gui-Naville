/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex08;

import java.util.Scanner;

/**
 *
 * @author CAMARGO
 */
public class Ex08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite sua idade em anos: ");
        int anos = entrada.nextInt();

        System.out.println("Digite sua idade em meses: ");
        int meses = entrada.nextInt();

        System.out.println("Digite sua idade em dias: ");
        int dias = entrada.nextInt();
        
        int total = (anos * 365) + (meses + 30) + dias;
        
        System.out.println("A idade em dias e "+ total);
    }
    
}
