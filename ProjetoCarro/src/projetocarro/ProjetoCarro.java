package projetocarro;
import java.util.Scanner;
    


/**
 *
 * @author pc
 */
public class ProjetoCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    	System.out.println("O que você quer?\n 1- Carro\n 2- Moto\n 3- Kombi");
    	int escolhaAutomovel = sc.nextInt();
    	switch (escolhaAutomovel) 
        {
            case 1:	
        	System.out.println("Qual carro você quer escolher? \n 1- Audi TT 2 \n 2- Camaro Amarelo \n 3- Lamborghini Urus");
        	int escolhaCarro = sc.nextInt();
        	switch (escolhaCarro) {
                case 1:
                Carro c1 = new Carro();
                c1.nome = "Audi TT";
                c1.marca = "Audi";
                c1.ano = 2023;
                c1.vel = 180;
                c1.acelerar(100);
                System.out.println("Velocidade: " + c1.vel + " KM");
                c1.freiar(65);
                System.out.println("Velocidade Apos Freio: " + c1.vel + " km");
                c1.buzinar();
                break;

            case 2:
                Carro c2 = new Carro();
                c2.nome = "Camaro Amarelo";
                c2.marca = "Chevrolet";
                c2.ano = 2010;
                c2.vel = 120;
                c2.acelerar(30);
                System.out.println("Velocidade: " + c2.vel + " KM");
                c2.freiar(15);
                System.out.println("Velocidade Apos Freio: " + c2.vel + " km");
                c2.buzinar();
                break;

            case 3:
                Carro c3 = new Carro();
                c3.nome = "Lamborghini Urus";
                c3.marca = "Lamborghini";
                c3.ano = 2024;
                c3.vel = 200;
                c3.acelerar(45);
                System.out.println("Velocidade: " + c3.vel + " KM");
                c3.freiar(5);
                System.out.println("Velocidade Apos Freio: " + c3.vel + " km");
                c3.buzinar();
                break;

    		default:
    		System.out.println("Opção inválida.");
    		break;
        }
                case 2:
    		System.out.println("Qual moto você quer escolher? \n 1- Honda CG 160 \n  2- Yamaha YBR 150 \n  3- Honda Twister");
    		int escolhaMoto = sc.nextInt();

    		switch (escolhaMoto) {
    		    case 1:
    		        Moto m1 = new Moto();
    		        m1.nomeMoto = "CG 160";
    		        m1.marcaMoto = "Honda";
    		        m1.anoMoto = 2015;
    		        m1.velMoto = 70;
    		        m1.acelerarM(55);
    		        System.out.println("Velocidade: " + m1.velMoto + " KM");
    		        m1.freiarM(10);
    		        System.out.println("Velocidade Apos Freio: " + m1.velMoto + " km");
    		        m1.buzinarM();
    		        break;

    		    case 2:
    		        Moto m2 = new Moto();
    		        m2.nomeMoto = "YBR 150";
    		        m2.marcaMoto = "Yamaha";
    		        m2.anoMoto = 2000;
    		        m2.velMoto = 100;
    		        m2.acelerarM(10);
    		        System.out.println("Velocidade: " + m2.velMoto + " KM");
    		        m2.freiarM(2);
    		        System.out.println("Velocidade Apos Freio: " + m2.velMoto + " km");
    		        m2.buzinarM();
    		        break;

    		    case 3:
    		        Moto m3 = new Moto();
    		        m3.nomeMoto = "Twister";
    		        m3.marcaMoto = "Honda";
    		        m3.anoMoto = 2001;
    		        m3.velMoto = 125;
    		        m3.acelerarM(50);
    		        System.out.println("Velocidade: " + m3.velMoto + " KM");
    		        m3.freiarM(10);
    		        System.out.println("Velocidade Apos Freio: " + m3.velMoto + " km");
    		        m3.buzinarM();
    		        break;

    		    default:
    		        System.out.println("Opção inválida.");
    		        break;
    		}
    		break;
                
        
                case 3:
    		System.out.println("Qual caminhão você quer escolher? \n 1- Volvo FH540 \n  2- Scania R 450 \n  3- Mercedes-Benz Atego 2548");
    		int escolhaKombi = sc.nextInt();

    		switch (escolhaKombi) {
    		    case 1:
    		        Kombi k1 = new Kombi();
    		        k1.nomeKB = "FH540";
    		        k1.marcaKB = "Volvo";
    		        k1.anoKB = 2023;
    		        k1.velKB = 110;
    		        k1.acelerar(15);
    		        System.out.println("Velocidade: " + k1.velKB + " KM");
    		        k1.freiar(10);
    		        System.out.println("Velocidade Apos Freio: " + k1.velKB + " km");
    		        k1.buzinar();
    		        break;

    		    case 2:
    		        Kombi k2 = new Kombi();
    		        k2.nomeKB = "R 450";
    		        k2.marcaKB = "Scania";
    		        k2.anoKB = 2019;
    		        k2.velKB = 80;
    		        k2.acelerar(15);
    		        System.out.println("Velocidade: " + k2.velKB + " KM");
    		        k2.freiar(10);
    		        System.out.println("Velocidade Apos Freio: " + k2.velKB + " km");
    		        k2.buzinar();
    		        break;

    		    case 3:
    		        Kombi k3 = new Kombi();
    		        k3.nomeKB = "Atego 2548";
    		        k3.marcaKB = "Mercedes-Benz";
    		        k3.anoKB = 2021;
    		        k3.velKB = 120;
    		        k3.acelerar(20);
    		        System.out.println("Velocidade: " + k3.velKB + " KM");
    		        k3.freiar(10);
    		        System.out.println("Velocidade Apos Freio: " + k3.velKB + " km");
    		        k3.buzinar();
    		        break;

                        default:
    		        System.out.println("Opção inválida.");
    		        break;
    		}
    		break;

    		
        }
    }
}
    	

    	
     
    
    
       
    

        
        
        
            