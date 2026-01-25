// Crie funcao void chamada verificarParOuImpar que recebe inteiro e imprime se é par ou impar
import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args) {

        lerNegativoOuPositivo();
    }
    public static void lerNegativoOuPositivo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int x = sc.nextInt();

        if (x < 0) {
            System.out.print(x + " é negativo.");
        }
        else if (x > 0) {
            System.out.print(x + " é positivo.");
        }
        else {
            System.out.print(x + " é nulo.");
        }

        sc.close();
    }
}
