import java.util.Scanner;

public class Questao02 {
    void main(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = sc.nextInt();

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.printf("O número %d é múltiplo de 3 e de 5\n", numero);
        }
        else if (numero % 3 == 0) {
            System.out.printf("O número %d é múltiplo de 3\n", numero);
        }
        else if (numero % 5 == 0) {
            System.out.printf("O número %d é múltiplo de 5\n", numero);
        }
        else {
            System.out.printf("O número %d não é múltiplo de 3 nem de 5\n", numero);
        }
    }
}
