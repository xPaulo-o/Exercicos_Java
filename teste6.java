import java.util.Scanner;


public class teste6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero para fazer o fatorial dele; ");
        int fat = sc.nextInt();

        int r = resul (fat);

        System.out.println("o fatorial de "+ fat +" e: "+ r);

        sc.close();
    }

    public static int resul (int a) {

        int resul = 1;

        for (int i = a; i > 1; i--) {
            resul = resul * i;
        }

        return resul;
    }
}
