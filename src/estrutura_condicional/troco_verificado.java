package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class troco_verificado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double produto, quantidade, dinheiro, troco;

        System.out.print("Preço unitário do produto: ");
        produto = sc.nextDouble();

        System.out.print("Quantidade comprada: ");
        quantidade = sc.nextDouble();

        System.out.print("Dinheiro recebido: ");
        dinheiro = sc.nextDouble();

        troco = dinheiro - (produto * quantidade);

        if(troco < 0){
            double b = troco * -1;
            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS", b);
        } else {
            System.out.printf("TROCO = %.2f", troco);
        }

        sc.close();
    }
}
