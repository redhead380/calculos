package calculos;
import java.util.Scanner;
public class soma {
    public void soma(){
        Scanner scan = new Scanner (System.in);
        double a,b,valor;
        System.out.println("Calculadora soma TXT");
        do {            
        System.out.println("Digite o primeiro valor");
        a = scan.nextDouble();
        System.out.println("Digite o segundo valor");
        b = scan.nextDouble();
        valor = a + b;
            System.out.println("A + B = " + valor);
        } while (a!=0);
               
    }
    }
