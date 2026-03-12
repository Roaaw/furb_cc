package Unidade_2;
import java.util.Scanner;

public class Uni2Exe02 {
    public static void main(String[] args) {
        int num1, num2, mult;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite os valores que deseja multiplicar: ");
        num1 = scan.nextInt();num2 = scan.nextInt();
        mult = num1 * num2;
        System.out.printf("Resultado da multiplicaçâo: %s",mult);
        scan.close();
    }
}
