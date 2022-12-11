import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Diga quantos +----+, entre 1 e 20: ");
        int linha = sc.nextInt();

        System.out.print("Diga quantos |    |, entre 1 e 20: ");
        int coluna = sc.nextInt();
        sc.close();

        desenhaMoldura(valorOmissao(linha), valorOmissao(coluna));
    }

    public static int faixaMinima(int valor) {
        if (valor < 1) {
            return 1;
        } else if (valor > 20) {
            return 20;
        } else {
            return valor;
        }
    }
 
    public static void criaLinha(int linha) {
        String l = "+";
        for (int num = linha-1; num >= 0; num--) {
            l = l + "-";
        }
        l = l + "+";
        System.out.println(l);
    }

    public static void criaColuna(int linha, int coluna) {
        for (int num = coluna-1; num >= 0; num--) {
            String c = "|";
            for (int n = linha-1;n >= 0; n--) {
                c = c + " ";
            }
            c = c + "|";
            System.out.println(c);
        }
    }

    static int valorOmissao(int valor) {
        if (valor >= 1 & valor <= 20) {
            return faixaMinima(valor);
        } else {
            return 1;
        }
    }

    static void desenhaMoldura(int linha, int coluna) {
        criaLinha(linha);
        criaColuna(linha, coluna);
        criaLinha(linha);
    }
}
