import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do número
        System.out.print("Número (qualquer, desde que seja inteiro): ");
        int numero = scanner.nextInt();

        // Cálculo do antecessor e do sucessor
        int antecessor = numero - 1;
        int sucessor = numero + 1;

        // Exibição dos resultados
        System.out.println("\nO antecessor de " + numero + " é: " + antecessor);
        System.out.println("O sucessor de " + numero + " é: " + sucessor);

        scanner.close();
    }
}

