import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Digite a hora e os minutos:");
            
            int hora = sc.nextInt();
            int minutos = sc.nextInt();
            
            converte(hora, minutos);
            
            System.out.println("Deseja continuar? [S/N]");
            String fim = sc.next();
            if (fim.equals("N")) {
                break;
            }
        }
        sc.close();
    }

    static void converte(int hora, int minutos) {
        int conversao = 0;
        String tempo = "";
        if (hora > 12) {
            tempo = "A";
            conversao = hora%12;
        } else if (hora < 12) {
            conversao = hora;
            tempo = "P";
        }
        saida(conversao, minutos, tempo);
    }

    static void saida(int hora, int minutos, String valor) {
        System.out.println("A hora convertida é: "+hora+":"+minutos+" "+valor);
    }
}
