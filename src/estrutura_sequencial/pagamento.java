package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class pagamento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome;
        double valorHora, guardaValor, horasTrabalhadas;

        System.out.print("Nome: ");
        nome = sc.nextLine();

        System.out.print("Valor por hora: ");
        valorHora = sc.nextDouble();

        System.out.print("Horas Trabalhadas: ");
        horasTrabalhadas = sc.nextDouble();

        guardaValor = valorHora * horasTrabalhadas;

        System.out.printf("O pagamento para " + nome + "" +
                " deve ser %.2f", guardaValor);

        sc.close();

    }
}
