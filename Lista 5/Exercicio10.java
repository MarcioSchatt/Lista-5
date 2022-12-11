import java.util.Random;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Random random = new Random();

        int num = random.nextInt(13);
        if (num < 2) {
            while(true) {
                num = random.nextInt(13);
                if (num >= 2) {
                    break;
                }
            }
        }
        craps(num);
    }

    static void craps(int num) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        if (num == 7 | num == 11) {
            System.out.println("Você é o mestre!! Ganhou!! Número: "+num);
        } else if (num == 2 | num == 3 | num == 12) {
            System.out.println("Craps!! Você perdeu!! Número: "+num);
        } else {
            System.out.println("Esse é o seu número, vamos jogar!! Número: "+num);
            System.out.print("Digite D para jogar o dado: ");
            String dado = sc.next();
            int novoNum = 0;
            if (dado.toUpperCase().equals("D")) {
                novoNum = random.nextInt(13);
                while(num != novoNum) {
                    System.out.println("Seu número foi: "+novoNum);
                    if (novoNum == 7) {
                        System.out.println("Você perdeu!!!");
                        break;
                    }
                    System.out.print("Digite D para jogar o dado: ");
                    dado = sc.next();
                    if (dado.toUpperCase().equals("D")) {
                        novoNum = random.nextInt(13);
                        System.out.println("Seu número foi: "+novoNum);
                        if (novoNum == 7) {
                            System.out.println("Você perdeu!!!");
                            break;
                        }
                    } else {
                        System.out.println("Comando não identificado.");
                        break;
                    }
                if (novoNum != 7) {
                    System.out.println("Você ganhou!!");
                    break;
                }
                }
            } else {
                System.out.println("Comando não identificado.");
            }
        }
        sc.close();
    }
}
