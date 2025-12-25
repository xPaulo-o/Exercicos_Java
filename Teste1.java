
import java.util.Scanner;

public class Teste1 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("informe um numero para verificar se ele e par ou impar: ");
       int numero = sc.nextInt();

       if (numero % 2 == 0){
        System.out.println("seu numero e par!");
       } else {
        System.out.println("seu numero e impar!");
       }

       sc.close();
        
    }
}