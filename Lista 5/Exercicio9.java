import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o número: ");
        String numero = sc.nextLine();

        inverte(numero);
        sc.close();
    }

    static void inverte(String numero) {
        int tamanho = numero.length();
        for (int num = tamanho-1; num >= 0; num--) {
            if (num == tamanho-1) {
                System.out.print(numero.substring(num));
            } else {
                System.out.print(numero.substring(num, num+1));
            }
        }
    }
}