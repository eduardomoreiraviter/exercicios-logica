package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class valicacao_de_nota {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota:");
        double x = sc.nextDouble();
        while (x < 0 || x > 10){
            System.out.print("Valor invalido! Tente novamente:");
            x = sc.nextDouble();
        }

        System.out.print("Digite a primeira nota:");
        double y = sc.nextDouble();
        while (y < 0 || y > 10){
            System.out.print("Valor invalido! Tente novamente:");
            y = sc.nextDouble();
        }

        double media = (x + y) / 2;

        System.out.printf("MEDIA = %.2f%n", media);


    }
}
