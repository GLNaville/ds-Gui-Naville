/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exec03;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class Exec03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        System.out.println("Qual seu nome?: ");
        String nome = entrada.nextLine();
        
        System.out.println("Qual seu salario fixo?: ");
        int salfixo = entrada.nextInt();
         
        System.out.println("Quantas vendas fizestes no mes? (em dinheiro): ");
        float tv = entrada.nextFloat();
        
        float pc = salfixo * 15 / 100;
        
        float com = tv * pc;
     
        System.out.println("O nome dele e: " +nome+ "  O salário fixo e: "+salfixo+"  O salario no fim do mes e: "+com);
    }
    
}
