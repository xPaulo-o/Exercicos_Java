import java.util.Scanner;

public class teste4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a palavra: ");
        String palavra = sc.nextLine().toLowerCase();


        String vogais = "aeiou";
        int contador = 0;

        for (int i = 0; i < palavra.length(); i ++){
            char letraAtual = palavra.charAt(i);

            if (vogais.indexOf(letraAtual) != -1){
                contador ++;
            }
        }

        System.out.println("a quandidade de vogais e: "+ contador);
        sc.close();
    }
}