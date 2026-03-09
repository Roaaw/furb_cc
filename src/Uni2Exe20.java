import java.util.Scanner;

public class Uni2Exe20 {
    public static void main(String[] args) {
        int dobras;
        Scanner scan = new Scanner(System.in);
        System.out.printf("Insira o numero de dobras papel: ");
        dobras = scan.nextInt();
        double quadrados =Math.pow(dobras, 2);
        System.out.printf("Numero de quadrados: %.0f",quadrados);
        scan.close();
    }
}
