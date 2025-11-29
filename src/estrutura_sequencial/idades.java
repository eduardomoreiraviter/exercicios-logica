package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class idades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nomePrimeiraPessoa, nomeSegundaPessoa;
        double idadePrimeiraPessoa, idadeSegundaPessoa, media;

        System.out.println("Dados da primeira pessoa: ");

        System.out.print("Nome: ");
        nomePrimeiraPessoa = sc.nextLine();

        System.out.print("Idade: ");
        idadePrimeiraPessoa = sc.nextDouble();

        System.out.println("Dados da primeira pessoa: ");

        System.out.print("Nome: ");
        sc.nextLine();
        nomeSegundaPessoa = sc.nextLine();

        System.out.print("Idade: ");
        idadeSegundaPessoa = sc.nextDouble();

        media = (idadePrimeiraPessoa + idadeSegundaPessoa) / 2;

        System.out.println("A idade média de " + nomePrimeiraPessoa + " e " +
                nomeSegundaPessoa + " é de " + media + " anos" );

        sc.close();
    }
}
