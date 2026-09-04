import java.util.Scanner;

public class Questao04 {
    void main() {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Informe um número inteiro entre 1 e 30: ");
            numeros[i] = sc.nextInt();

            while (numeros[i] < 1 || numeros[i] > 30) {
                System.out.print("Número invalido! Informe um número entre  1 e 30: ");
                numeros[i] = sc.nextInt();
            }
        }

        for (int j = 0; j < numeros.length; j++) {
            for (int k = 0; k < numeros[j]; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
