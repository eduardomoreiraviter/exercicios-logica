package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class consumo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double distancia, combustivel, consumo;

        System.out.print("Distancia percorrida: ");
        distancia = sc.nextDouble();

        System.out.print("Combustivel gasto: ");
        combustivel = sc.nextDouble();

        consumo = distancia / combustivel;

        System.out.printf("Consumo medio = %.3f", consumo);

        sc.close();
    }
}
