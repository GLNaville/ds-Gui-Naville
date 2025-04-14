/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class EX02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        System.out.println("Determine a distancia total: ");
        int dt = entrada.nextInt();
      
        System.out.println("Determine o consumo total de combustivel gasto: ");
        int tcg = entrada.nextInt();
        
        int consumomedio = dt / tcg;
        System.out.println("O consumo medio é de:  " +consumomedio);
    }
    
}
