import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada da porcentagem do IPI
        System.out.print("Informe a porcentagem do IPI: ");
        double ipi = scanner.nextDouble();

        // Leitura dos dados da peça 1
        System.out.print("Informe o código da peça 1: ");
        int p1 = scanner.nextInt();

        System.out.print("Informe o valor da peça 1: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Informe a quantidade da peça 1: ");
        int quant1 = scanner.nextInt();

        // Leitura dos dados da peça 2
        System.out.print("Informe o código da peça 2: ");
        int p2 = scanner.nextInt();

        System.out.print("Informe o valor da peça 2: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Informe a quantidade da peça 2: ");
        int quant2 = scanner.nextInt();

        // Cálculo do valor total
        double vt = (valor1 * quant1 + valor2 * quant2) * (ipi / 100 + 1);

        // Exibição dos resultados
        System.out.println("\n Entao a compra foi: ");
        System.out.println("Peça 1 - Código: " +  p1 + " | Quantidade: " + quant1 + " | Valor unitário: R$ " + valor1);
        System.out.println("Peça 2 - Código: " + p2 + " | Quantidade: " + quant2 + " | Valor unitário: R$ " + valor2);
        System.out.println("IPI aplicado: " + ipi + "%");
        System.out.println("Valor total a ser pago: R$ " + vt);

        scanner.close();
    }
}
