import java.util.Scanner;

public class Questao03 {
    void main(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int numero = sc.nextInt();

        for (int i = 2; i <= numero; i++) {
            int quantidadeDivisores = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    quantidadeDivisores++;
                }
            }
            if (quantidadeDivisores == 2) {
                System.out.println(i);
            }
        }
    }
}
