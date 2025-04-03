/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package while05;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class While05 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Coloque 10 numeros: ");
        for (int in = 0; in < 10; in++) {
            numeros[in] = entrada.nextInt();
        }


        int NumMaio1 = numeros[0];
        int NumMaio2 = numeros[1];


        if (NumMaio2 > NumMaio1) {
            int temp = NumMaio1;
            NumMaio1 = NumMaio2;
            NumMaio2 = temp;
        }


        for (int i = 2; i < 10; i++) {
            if (numeros[i] > NumMaio1) {
                NumMaio2 = NumMaio1;
               NumMaio1 = numeros[i];
            } else if (numeros[i] > NumMaio2 && numeros[i] != NumMaio1) {
                NumMaio2 = numeros[i];
            }
        }

        if (NumMaio1 == NumMaio2) {
            System.out.println("Todos os números são iguais ou não há um segundo maior distinto.");
        } else {
            System.out.println("Os dois maiores numeros sao: " + NumMaio1 + " e " + NumMaio2);
        }

        entrada.close();
    }
}