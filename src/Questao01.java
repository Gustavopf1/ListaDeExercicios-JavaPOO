import java.util.Scanner;

public class Questao01 {
    void main(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Informe a sua primeira nota: ");
        float nota1 = sc.nextFloat();

        System.out.print("Informe a sua segunda nota: ");
        float nota2 = sc.nextFloat();

        System.out.print("Informe a sua terceira nota: ");
        float nota3 = sc.nextFloat();

        float mediaPonderada = (nota1 + nota2 + (nota3 * 2 )) / 4;
        System.out.printf("%s ficou com %.2f na média\n", nome, mediaPonderada);

        if (mediaPonderada >= 7) {
            System.out.println("Aprovado!");
        }
        else {
            System.out.println("Reprovado!");
        }

    }
}
