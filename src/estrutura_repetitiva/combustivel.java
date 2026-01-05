package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class combustivel {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
        int x = sc.nextInt();

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (x != 4){
            System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
            x = sc.nextInt();
            if (x == 1){
                alcool += x;
            } else if (x == 2) {
                gasolina += x;
            } else if (x == 3){
                diesel += x;
            }
        }

        System.out.println("MUITO OBRIGADO");

        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}
