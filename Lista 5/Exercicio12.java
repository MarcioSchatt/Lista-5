import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.next();
        sc.close();

        System.out.println(embaralha(palavra));
    }

    static String embaralha(String palavra) {
        List<String> letras = new ArrayList<String>();
        String temp = "";
    
        for (int i = 0; i < palavra.length(); i++) {
            letras.add(String.valueOf(palavra.toLowerCase().charAt(i)));
        }

        Collections.shuffle(letras);
    
        for (int i = 0; i < palavra.length(); i++) {
            temp += letras.get(i);
        }
        return temp;
    }
}
