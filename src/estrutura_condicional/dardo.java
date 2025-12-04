package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class dardo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.println("Digite as tres distancias:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        if (a > b && b > c ){
            System.out.printf("MAIOR DISTANCIA = %.2f", a);
        } else if (b > a && a > c) {
            System.out.printf("MAIOR DISCANCIA = %.2f", b);
        } else {
            System.out.printf("MAIOR DISCANCIA = %.2f", c);
        }

        sc.close();
    }
}
