package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String fc;

        System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
        fc = sc.nextLine();

        if (fc.equals("C")){
            System.out.print("Digite a temperatura em Celsius: ");
            double c = sc.nextDouble();
            double f = (c * 9 / 5) + 32;
            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f", f);
        } else {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = sc.nextDouble();
            double celsius = 5.0 / 9.0 * (fahrenheit - 32);
            System.out.printf("Temperatura equivalente em Celsius: %.2f", celsius);
        }

        sc.close();
    }
}
