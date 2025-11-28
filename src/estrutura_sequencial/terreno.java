package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class terreno {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double larguraTerreno, comprimentoTerreno, metroQuadrado, areaTerreno, precoTerreno;

        System.out.println("Digite a largura do terreno: ");
        larguraTerreno = sc.nextDouble();

        System.out.println("Digite o comprimento do terreno: ");
        comprimentoTerreno = sc.nextDouble();

        System.out.println("Digite o valor do metro quadrado: ");
        metroQuadrado = sc.nextDouble();

        areaTerreno = larguraTerreno * comprimentoTerreno;

        System.out.printf("Area do terreno = %.2f\n", areaTerreno);

        precoTerreno = areaTerreno * metroQuadrado;

        System.out.printf("Preco do terreno = %.2f\n", precoTerreno);

        sc.close();

    }
}
