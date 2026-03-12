package Unidade_2;
import java.util.Scanner;

public class Uni2Exe03 {
    public static void main(String[] args) {
        double circunferencia, raio, resultado;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor do diâmetro(cm):");
        circunferencia = scan.nextInt();
        raio = (circunferencia/2);
        resultado = Math.pow(raio, 2)*Math.PI;
        System.out.printf("Diâmetro: '%.2f cm'%nRaio: '%.2f cm'%nCircunferência: '%.2f cm'",circunferencia,raio,resultado);
        scan.close();
    }
}
