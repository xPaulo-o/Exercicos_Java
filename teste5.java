import java.util.Scanner;


public class teste5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("imforme o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("informe o segundo numero: ");
        int num2 = sc.nextInt();

        int r = maior (num1, num2);

        
        System.out.println("o numero maior e: "+ r);
       

        sc.close();
    }

    public static int maior(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }

    }
    
}
