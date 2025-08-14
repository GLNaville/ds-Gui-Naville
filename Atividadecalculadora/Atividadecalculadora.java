import java.util.Scanner;

package Atividadecalculadora;



public class Atividade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Calculadora Alpha ===");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtracao");
            System.out.println("3 - Multiplicacao");
            System.out.println("4 - Divisao");
            System.out.println("5 - Raiz Quadrada");
            System.out.println("6 - Ver Signo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    operacaoBasica(sc, "+");
                    break;
                case 2:
                    operacaoBasica(sc, "-");
                    break;
                case 3:
                    operacaoBasica(sc, "*");
                    break;
                case 4:
                    operacaoBasica(sc, "/");
                    break;
                case 5:
                    System.out.print("Digite o numero: ");
                    double num = sc.nextDouble();
                    System.out.println("Raiz quadrada: " + Math.sqrt(num));
                    break;
                case 6:
                    signoZodiacal(sc);
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opçao invalida.");
            }
        } while(opcao != 0);
        
        sc.close();
    }

    static void operacaoBasica(Scanner sc, String op) {
        System.out.print("Digite o primeiro numero: ");
        double a = sc.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double b = sc.nextDouble();
        double resultado = 0;

        switch(op) {
            case "+": resultado = a + b; break;
            case "-": resultado = a - b; break;
            case "*": resultado = a * b; break;
            case "/": 
                if (b != 0) resultado = a / b;
                else {
                    System.out.println("Erro: Divisao por zero.");
                    return;
                }
                break;
        }
        System.out.println("Resultado: " + resultado);
    }

    static void signoZodiacal(Scanner sc) {
        System.out.print("Digite o dia de nascimento: ");
        int dia = sc.nextInt();
        System.out.print("Digite o mes de nascimento: ");
        int mes = sc.nextInt();

        String signo = "";

        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) signo = "Aries";
        else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) signo = "Touro";
        else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) signo = "Gemeos";
        else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) signo = "Cancer";
        else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) signo = "Leao";
        else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) signo = "Virgem";
        else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) signo = "Libra";
        else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) signo = "Escorpiao";
        else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) signo = "Sagitario";
        else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) signo = "Capricornio";
        else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) signo = "Aquario";
        else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) signo = "Peixes";
        else signo = "Data invalida.";

        System.out.println("Seu signo é: " + signo);
    }
}


    
 
    

