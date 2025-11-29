package estrutura_sequencial;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X, Y, SOMA;

        System.out.print("Digite o valor de X: ");
        X = sc.nextInt();

        System.out.print("Digite o valor de Y: ");
        Y = sc.nextInt();

        SOMA = X + Y;

        System.out.println("SOMA = " + SOMA);

        sc.close();
    }
}
