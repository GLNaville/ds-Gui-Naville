/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex06;
import java.util.Scanner;

/**
 CALCULAR O CUSTO ESTIMADO DE COMBUSTIVEL NUMA VIAGEM DE CARRO
**/
public class EX06 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("quanto o carro faz por litro? (em km) ");
         int ql = entrada.nextInt();
         System.out.println("qual a distancia total? ");
         int dt = entrada.nextInt();
         System.out.println("qual o valor da gasolina? ");
         float vg = entrada.nextFloat();
         
         float cg = ql * dt;
         float ct = vg * cg;
         System.out.println("o custo total da gasolina gasta e "+ct);
    }
    
}
