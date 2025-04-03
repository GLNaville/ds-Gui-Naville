/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package while04;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class While04 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        System.out.println("Insira a quantidade de alunos na sua classe: ");
        int alunos = entrada.nextInt();
        
        double somaN = 0;
        int contador = 0;
        
        while (contador < alunos) {
            System.out.println("Digite a nota do aluno " + (contador + 1) + ": ");
            double nota = scanner.nextDouble();
            somaN += nota;
            contador++;
        }
        
        double media = somaN / alunos;
        System.out.println("A media da turma e: " + media);
        

    }
    
}
