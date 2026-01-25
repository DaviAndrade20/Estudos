/* Crie um funcao void chamada mostrarNumero que recebe numero inteiro e 
imprime: "O numero informado foi: X"
*/

import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        mostrarNumero(num);

        sc.close();
    }
    public static void mostrarNumero (int num) {
        System.out.print("O número informado foi: " + num);
    }
}
