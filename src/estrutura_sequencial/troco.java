package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class troco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double unitario, quantidade, dinheiro, troco;

        System.out.print("Preço unitário do produto: ");
        unitario = sc.nextDouble();

        System.out.print("Quantidade comprada: ");
        quantidade = sc.nextDouble();

        System.out.print("Dinheiro recebido: ");
        dinheiro = sc.nextDouble();

        troco = dinheiro - (unitario * quantidade);

        System.out.printf("TROCO = %.2f", troco);
    }
}
