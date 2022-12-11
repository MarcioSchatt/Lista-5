import java.util.Scanner;

public class Exercicio3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 números:");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        sc.close();

        System.out.println("A soma é: " + sum3(num1, num2, num3));
    }

    static int sum3(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}
