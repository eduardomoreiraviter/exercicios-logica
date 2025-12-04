package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class menor_de_tres {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int primeiro, segundo, terceiro;

        System.out.print("Primeiro valor: ");
        primeiro = sc.nextInt();

        System.out.print("Segundo valor: ");
        segundo = sc.nextInt();

        System.out.print("Terceiro valor: ");
        terceiro = sc.nextInt();

        if (primeiro < segundo && segundo < terceiro) {
            System.out.println("MENOR = " + primeiro);
        } else if (segundo < primeiro && primeiro < terceiro) {
            System.out.println("MENOR = " + segundo);
        } else {
            System.out.println("MENOR = " + terceiro);
        }

        sc.close();
    }
}
