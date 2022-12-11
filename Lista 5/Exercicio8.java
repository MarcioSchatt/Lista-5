import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o número: ");
        String numero = sc.nextLine();

        System.out.println("Quantidade de dígitos é: "+inverte(numero));
        sc.close();
    }

    static int inverte(String numero) {
        int tamanho = numero.length();
        return tamanho;
    }
}
