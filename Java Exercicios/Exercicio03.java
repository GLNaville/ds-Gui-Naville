import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o saldo: ");
        double saldo = scanner.nextDouble();

        double reajuste = saldo + (saldo * 0.01);

        System.out.println("Saldo com reajuste de 1%: " + reajuste);

        scanner.close();
    }
}
