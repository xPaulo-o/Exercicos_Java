import java.util.Scanner;

public class teste8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("informe a palavra para verificar se e palindormo: ");
        String palin = sc.nextLine();

        String inver = new StringBuilder(palin).reverse().toString();

        if ( palin.equals(inver)) {
            System.out.println("sim e palindromo");
        } else {
            System.out.println("não e palindromo");
        }

        sc.close();

    }
}
