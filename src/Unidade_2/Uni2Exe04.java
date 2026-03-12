package Unidade_2;
import java.util.Scanner;

public class Uni2Exe04 {
    public static void main(String[] args) {
        float nota1, nota2, media;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nota 1: ");
        nota1 = scan.nextFloat();
        System.out.print("Nota 2: ");
        nota2 = scan.nextFloat();
        media = (nota1*3.5f + nota2*7.5f) / 11f;
        System.out.printf("Média: %.1f", media);
        scan.close();
    }
}
