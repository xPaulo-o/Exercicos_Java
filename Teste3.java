import java.util.Scanner;

public class Teste3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("informe o tanto de numeros que deseja digitar: ");
        int N = sc.nextInt();

        if (N <= 0){
            System.out.println("insira um numero maior que 0");
        } else {
            int maior = Integer.MIN_VALUE;

            for (int i = 1; i <= N; i++){
                    int atual = sc.nextInt();
                    if (atual > maior){
                         maior = atual ;
                    }
            }

            System.out.println("o maior numero e: " + maior );
        
        }
        sc.close();
    }
}
