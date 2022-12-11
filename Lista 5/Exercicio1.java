import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        
        System.out.println("Digite o número:");

        int num = sc.nextInt();
        sc.close();

        printLine(num);
    }

    static void printLine(int n) {
        for(int num = 1; num < n+1; num++) {
            System.out.println();
            System.out.print(num + " ");
            for(int i = 0; i < num-1; i++)
                System.out.print(num + " ");
        }
    }

}