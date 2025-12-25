import java.util.Scanner;

public class teste2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o numero para fazer a conagem: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++ ){
            System.out.println(i);
        }

        sc.close();
        
    }
    
}
