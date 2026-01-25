// Crie uma funcao void chamada verificarParOuImpar que recebe inteiros e imprime par ou impar
import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();

        verificarParOuImpar(num);

        sc.close();
    }
    public static void verificarParOuImpar(int num) {
      
        if (num % 2 == 0) {
            System.out.println(num + " é par.");
        }
        else {
            System.out.println(num + " é ímpar.");
        }

    }
}
