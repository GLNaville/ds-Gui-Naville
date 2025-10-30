public class Exercicio02 {

    public static void main(String[] args) {
        // Cálculo da primeira média: 8, 9 e 7
        double media1 = (8 + 9 + 7) / 3.0;

        // Cálculo da segunda média: 4, 5 e 6
        double media2 = (4 + 5 + 6) / 3.0;

        // Soma das duas médias
        double soma = media1 + media2;

        // Média das médias
        double mediatotal = soma / 2.0;

        // Exibição dos resultados
        System.out.println("Média dos números 8 9 7: " + media1);
        System.out.println("Média dos números 4 5 6: " + media2);
        System.out.println("Soma das duas médias: " + soma);
        System.out.println("Média das médias: " + mediatotal);
    }
}
