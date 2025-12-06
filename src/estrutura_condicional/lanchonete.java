package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class lanchonete {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo, quantidade;

        System.out.print("Codigo do produto comprado:");
        codigo = sc.nextInt();

        System.out.print("Quantidade comprada: ");
        quantidade = sc.nextInt();

        if (codigo == 1){
            double x = 5.00 * quantidade;
            System.out.printf("Valor a pagar: %.2f", x);
        } else if (codigo == 2) {
            double x = 3.50 * quantidade;
            System.out.printf("Valor a pagar: %.2f", x);
        } else if (codigo == 3) {
            double x = 4.80 * quantidade;
            System.out.printf("Valor a pagar: %.2f", x);
        } else if (codigo == 4) {
            double x = 8.90 * quantidade;
            System.out.printf("Valor a pagar: %.2f", x);
        } else {
            double x = 7.32 * quantidade;
            System.out.printf("Valor a pagar: %.2f", x);
        }

        sc.close();
    }
}
