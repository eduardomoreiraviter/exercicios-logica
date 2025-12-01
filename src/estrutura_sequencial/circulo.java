package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class circulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double r, area;
        double pi = 3.14159;

        System.out.print("Digite o valor do raio do circulo: ");
        r = sc.nextDouble();

        area = pi * (r * r);

        System.out.printf("AREA = %.3f", area);

        sc.close();

    }
}
