import java.util.Scanner;

public class Uni2Exe01 {
    public static void main(String[] args) {
        int num1, num2, soma;
        Scanner scan = new Scanner (System.in);
        System.out.print("Digite os valores que deseja somar: ");
        num1 = scan.nextInt();num2 = scan.nextInt();
        soma = num1 + num2;
        System.out.printf("Resultado da soma: %s",soma);
        scan.close();
    }
}
