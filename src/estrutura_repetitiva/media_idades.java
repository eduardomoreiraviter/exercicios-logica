package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class media_idades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double idade;

        System.out.println("Digite as idades: ");
        idade = sc.nextDouble();

        double x = 0;
        while (idade > 0 ){
            idade = sc.nextDouble();
             x =+ idade;
        }

        System.out.printf("MEDIA = &.2f", x);

        if (idade < 0){
            System.out.println("IMPOSSIVEL CALCULAR");
        }

        sc.close();
    }
}
