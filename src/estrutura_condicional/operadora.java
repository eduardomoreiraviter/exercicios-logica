package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class operadora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int min, guardaMinuto;

        double valor = 50.00;

        System.out.print("Digite a quantidade de minutos: ");
        min = sc.nextInt();

        if (min > 100){
            guardaMinuto = (min - 100) * 2;
            double addValor = guardaMinuto + 50.00;
            System.out.printf("Valor a pagar: R$ %.2f", addValor);
        } else {
            System.out.printf("Valor a pagar: R$ %.2f", valor);
        }

        sc.close();
    }
}
