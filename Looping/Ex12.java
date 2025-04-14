
package ex12;

public class Ex12 {

    public static void main(String[] args) {
        double habA = 80000;
        double habB = 200000;

        for (int anos = 1; ;anos++){
            habA = habA * 1.03;
            habB = habB * 1.015;
            if (habA >= habB){
            System.out.printf("%d anos", anos);
            break;
            }
            
        }
    }
    
}
