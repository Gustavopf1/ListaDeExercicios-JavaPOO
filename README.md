# Questões Teóricas

 ##  Questão 05

 O Scanner serve para receber dados digitados pelo usuário e armazená-los em uma variável, dependendo do tipo de dados,
 como `int`, `double`, `float`, `String`, dentre outros.
 Um exemplo da utilização dele seria:

 ```java
Scanner sc = new Scanner(System.in);

System.out.print("Informe um número:");
double numero = sc.nextDouble();
```
Nesse exemplo, o programa pede um número ao usuário, o `sc.nextDouble();` faz a leitura do valor digitado e a variável `numero`, do tipo `double`, armazena esse valor.


Já o `System.out.printf` é utilizado para deixar a saída de dados mais organizada e formatada, em vez de utilizar o `+` várias 
vezes dentro de um `print`, podemos utilizar especificadores como `%d` para números inteiros e `%f` para números decimais, dentre outras formas também como `%c` para caractere, `%s` para String, etc.
Um exemplo seria: 
```java
System.out.print("Informe um número:");
double numero = sc.nextDouble();

System.out.printf("O número informado foi: %.2f", numero);
```
Aqui eu estou escolhendo quantas casas decimais eu quero que sejam exibidas utilizando o `%.2f`.

## Questão 06

O primeiro erro de sintaxe que tem no código é que está faltando um `[]` depois do `String`, o outro erro é que está faltando um ponto e vírgula no final do `System.out.println("Contador: " + contador)`. E o último erro é o `while` que está entrado em um loop infinito, pois o `contador`  não acrescenta nada ao seu valor a cada repetição, por isso, é necessário usar `contador++`; para aumentar o valor a cada loop e fazer com que o `while` pare quando a condição deixar de ser verdadeira.
O codigo correto seria:
```java
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }
    }
}

```
