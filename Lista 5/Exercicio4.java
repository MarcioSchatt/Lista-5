import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");

        int num = sc.nextInt();
        sc.close();

        verifica(num);
    }

    static void verifica(int num) {
        if (num > 0) {
            System.out.println("P");
        } else if (num <= 0) {
            System.out.println("N");
        }
    }
}
