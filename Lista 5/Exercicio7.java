import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;
        int quantidade = 0;

        while(true) {
            System.out.println("Digite o valor da prestação:");
            double valor = sc.nextDouble();
            if (valor == 0) {
                break;
            }

            System.out.println("Digite o número de dias em atraso:");
            int dias = sc.nextInt();

            total = total + valorPagamento(valor, dias);
            quantidade = quantidade + 1;
        }
        sc.close();

        System.out.println("Quantidade total: R$"+quantidade);
        System.out.println("Valor total das prestações: R$"+total);
    }

    static double valorPagamento(double valor, int diasAtraso) {
        double juros = 0;
        if (diasAtraso == 0) {
            System.out.println(valor);
            return valor;
        } else {
            juros = 0.1 * diasAtraso;
            valor = valor + ((3*valor)/100) + juros;
            System.out.println(valor);
            return valor;
        }
    }
}
