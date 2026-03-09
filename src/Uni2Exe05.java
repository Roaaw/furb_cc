import java.util.Scanner;

public class Uni2Exe05 {
    public static void main(String[] args) {
        int valorA, valorB, valorC, valorD, fomula;
        Scanner scan = new Scanner(System.in);
        System.out.print("Valor A: ");
        valorA = scan.nextInt();
        System.out.print("Valor B: ");
        valorB = scan.nextInt();
        System.out.print("Valor C: ");
        valorC = scan.nextInt();
        System.out.print("Valor D: ");
        valorD = scan.nextInt();
        fomula = (valorA * valorB) - (valorC * valorD);
        System.out.printf("Resultado: %s",fomula);
        scan.close();
    }
}
