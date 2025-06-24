package projetocarro;

public class Kombi {
    String nomeKB;
    String  marcaKB;
    int anoKB;
    int velKB;
    
    //métodos
    void acelerar(int aceleracao){
        velKB+=aceleracao;
    }
    
    void freiar(int reduzir){
        velKB-=reduzir;
    }
    
    void buzinar(){
        System.out.println("Carro Buzinando");
    }
    
    void tocarmusica () {
        System.out.println("Amar não é pecado, e se eu tiver errado, que se dane o mundo, eu só quero voce... ");
}
}