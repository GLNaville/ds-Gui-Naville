
package ex14;


public class Ex14 {
    
    public static void main(String[] args) {
        int termo1 = 0, termo2 = 1;
    System.out.println("Serie de Fibonacci ate o termo:");

    while (termo1 <= 500) {
      System.out.print(termo1 + ", ");

      // compute the next term
      int proxTermo = termo1 + termo2;
      termo1 = termo2;
      termo2 = proxTermo;
    }
        System.out.println(termo1);
  }
}
