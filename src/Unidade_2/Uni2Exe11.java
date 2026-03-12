package Unidade_2;
import java.util.Scanner;

public class Uni2Exe11 {
    public static void main(String[] args) {
        double valorA,valorB,valorC,areaTriangulo,areaCirculo,areaTrapezio,areaQuad,areaRet;
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira os valores(cm) de A, B e C: ");
        valorA = scan.nextDouble();valorB = scan.nextDouble();valorC = scan.nextDouble();
        System.out.printf("Valor A: %.2fcm ValorB: %.2fcm ValorC: %.2fcm%n",valorA,valorB,valorC);
        areaTriangulo = (valorA * valorC) / 2;
        System.out.printf("Area do Triangulo: %.2fcm%n",areaTriangulo);
        areaCirculo = Math.pow(valorC, 2) * Math.PI;
        System.out.printf("Area do Circulo: %.2fcm%n",areaCirculo);
        areaTrapezio = ((valorA + valorB) *valorC)/2;
        System.out.printf("Area do Trapezio: %.2fcm%n",areaTrapezio);
        areaQuad = Math.pow(valorA, 2);
        System.out.printf("Area do Quadrado: %.2fcm%n",areaQuad);
        areaRet = (valorA * valorB);
        System.out.printf("Area do Retangulo: %.2fcm%n",areaRet);
        scan.close();
    }
}
