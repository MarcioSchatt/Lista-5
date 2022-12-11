import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Data: ");
        String data = sc.next();

        String[] listaData = data.split("/");
        String dia = listaData[0];
        String mes = listaData[1];
        String ano = listaData[2];
        sc.close();

        System.out.println(extenso(Integer.parseInt(dia), Integer.parseInt(mes), Integer.parseInt(ano)));
    }

    static String extenso(int dia, int mes, int ano) {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        String[] dias = {"Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez", "Onze", "Doze", "Treze", "Quatorze", "Quinze", "Dezesseis", "Dezessete", "Dezoito", "Dezenove", "Vinte", "Vinte e um", "Vinte e dois", "Vinte e três", "Vinte e quatro", "Vinte e cinco", "Vinte e seis", "Vinte e sete", "Vinte e oito", "Vinte e nove", "Trinta", "Trinta e um"};

        if (dia <= 0 | dia > 31 | mes > 12 | mes < 0) {
            System.out.println("Data inválida.");
            System.exit(0);
        }

        if (mes == 1|mes == 3|mes == 5|mes == 7|mes == 8|mes == 10|mes == 12) {
            if (dia > 31) {
                System.out.println("Data inválida.");
                System.exit(0);
            }
        } else if (mes == 4|mes == 6|mes == 9|mes == 11) {
            if (dia > 30) {
                System.out.println("Data inválida.");
                System.exit(0);
            }
        } else {
            if (dia == 29) {
                if (((ano%400 != 0) || (ano%4 != 0)) && (ano%100 == 0)) {
                    System.out.println("Data inválida.");
                    System.exit(0);
                }
            } else if (dia > 28) {
                System.out.println("Data inválida.");
                System.exit(0);
            }
        }

        String diaExt = dias[dia-1];
        String mesExt = meses[mes-1];

        String data = diaExt+" de "+mesExt+" de "+ano;
        return data;
    }
}
