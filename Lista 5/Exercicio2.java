import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        
        System.out.println("Digite o número:");

        int num = sc.nextInt();
        sc.close();

        printSequencia(num);
    }

    static void printSequencia(int n) {
        for(int num = 1; num < n+1; num++) {
            for(int i = 1; i <= num; i++)
                System.out.print(i + " ");
            System.out.println();
        }
    }

}