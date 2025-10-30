import java.util.Scanner;

public class Exercicio01 {

    // Função para calcular a idade em dias
    public static int calcular(int anos, int meses, int dias) {
        // Calcula a quantidade total de dias
        int totalDias = anos * 365 + meses * 30 + dias;
        return totalDias;
    }

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a idade em anos: ");
        int anos = scanner.nextInt();
        
        System.out.print("Digite a idade em meses: ");
        int meses = scanner.nextInt();
        
        System.out.print("Digite a idade em dias: ");
        int dias = scanner.nextInt();

        
        int totalDias = calcular(anos, meses, dias);

      
        System.out.println("A idade total em dias é: " + totalDias + " dias.");


        scanner.close();
    }
}
