import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a porcentagem do imposto e o valor do produto:");

        double taxaImposto = sc.nextDouble();
        double custo = sc.nextDouble();
        sc.close();

        System.out.println("O custo total é: R$" + somaImposto(taxaImposto, custo));
    }

    static double somaImposto(double taxaImposto, double custo) {
        double total = custo + (custo/100 * taxaImposto);
        return total;
    }
}
