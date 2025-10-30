import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Informe o valor do salário mínimo: ");
        double sm = scanner.nextDouble();

        System.out.print("Informe o valor do seu salário: ");
        double su = scanner.nextDouble();

        // Cálculo da quantidade de salários mínimos
        double quantidadedesal = su / sm;

        // Exibição do resultado
        System.out.println("\nVocê ganha o equivalente a " + quantidadedesal + " salários mínimos.");

        scanner.close();
    }
}

