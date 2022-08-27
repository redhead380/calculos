package calculos;
import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        soma sum = new soma();
        Scanner scan = new Scanner (System.in);
     int escolha;
        System.out.println("Menu calculos");
        System.out.println("O que vamos calular hoje meu caro?");
        System.out.println("1 - SOMA");
        System.out.println("1 - SUBTRAÇAO");
        System.out.println("Digite sua escolha");
        escolha = scan.nextInt();
        switch (escolha){
                case 1: sum.soma();
                    break;
        }
        }
    
}
