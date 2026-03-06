import java.util.Scanner;

public class Uni2Exe18 {
    public static void main(String[] args) {
        final float valorAzulejo = 112.50f;
        float altura, comprimento,sqrm;
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe a altura da parede: ");
        altura = scan.nextInt();
        System.out.print("Informe a comprimento da parede: ");
        comprimento = scan.nextInt();
        sqrm = (altura * comprimento)*valorAzulejo;
        System.out.printf("Você vai gastar %.2f em azulejos.",sqrm);


    }
}
//1m quad = 9 azulejos