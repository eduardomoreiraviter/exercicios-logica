package estrutura_repetitiva;

import java.util.Scanner;

public class crescente {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros: ");
        int X = sc.nextInt();
        int Y = sc.nextInt();
        while (X  != Y ){
            if (X > Y){
                System.out.println("DECRESCENTE!");
            } if (X < Y){
                System.out.println("CRESCENTE!");
            }
            System.out.println("Digite outros dois numeros: ");
            X = sc.nextInt();
            Y = sc.nextInt();
        }

    }
}
