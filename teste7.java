import java.util.Scanner;

public class teste7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de numeros que vai inserir: ");
        int n = sc.nextInt();

        int r = re(n);

        System.out.println("a qauntidade de numeros pares e: "+ r);

        sc.close();

    }

    public static int re (int a) {

        Scanner sc = new Scanner(System.in);
        int quantidade = 0;

        for (int i = 1; i <= a; i++) {
        System.out.println("informe o "+ i +" numero: ");
        int v = sc.nextInt();

        if (v % 2 == 0) {
            quantidade = quantidade + 1;
        }
        
        }

        sc.close();
        return quantidade;
           
    }
}
