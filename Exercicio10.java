/* Crie funcao void calcularMedia que recebe duas notas, calcula a media e
   imprime se aprovado ou reprovado
*/
import java.util.Locale;
import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        calcularMedia(nota1, nota2);

        sc.close();
    }
    public static void calcularMedia (double x, double y) {
        double media = (x + y)/2;
        System.out.printf("A média de %.1f e %.1f é igual a %.1f%n", x, y, media);
        if (media < 7) {
            System.out.print("Reprovado.");
        }
        else {
            System.out.print("Aprovado.");
        }
    }
}
