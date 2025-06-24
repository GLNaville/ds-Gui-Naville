/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetocarro;

/**
 *
 * @author CAMARGO
 */
public class Moto {
    
    String nomeMoto;
    String marcaMoto;
    int anoMoto;
    int velMoto;
    
    void acelerarM(int props){
        velMoto = velMoto + props;
        System.out.println("Sua moto foi para a velocidade: "+velMoto+"KM/h");
    }
    
    void freiarM(int para){
        velMoto = velMoto - para;
        System.out.println("Sua moto diminuiu a velocidade para: "+velMoto+"KM/h");
    }
    
    void buzinarM(){
        System.out.println("Moto buzinando");
    }
    
    void Grau(){
        System.out.println("GRAUUUUUUUUUU UHUUUUUUUUUUUUUUUL");

    
    }
}

