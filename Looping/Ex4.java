package ex44;

import java.util.Scanner;

public class Ex44 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char x;

        do {
            System.out.println("Qual foram as duas notas do aluno (de 0 a 10)?: ");
            int n1 = entrada.nextInt();
            int n2 = entrada.nextInt();

            float med = (n1 + n2) / 2f; 
            System.out.println("O resultado da divisao eh: " + med);

            do {
                System.out.println("Deseja realizar um novo cálculo? (S/N): ");
                x = entrada.next().toUpperCase().charAt(0);
            } while (x != 'S' && x != 'N'); 

        } while (x == 'S'); 

        entrada.close();
    }
}
