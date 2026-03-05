import java.util.Scanner;

public class Uni2Exe12 {
    public static void main(String[] args) {
        double x1,y1,x2,y2,resultado;
        Scanner scan = new Scanner(System.in);
        System.out.print("Valor de X1:");
        x1 = scan.nextFloat();
        System.out.print("Valor de Y1:");
        y1 = scan.nextFloat();
        System.out.print("Valor de X2:");
        x2 = scan.nextFloat();
        System.out.print("Valor de Y2:");
        y2 = scan.nextFloat();
        resultado = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
        System.out.printf("%.4f",resultado);
    }
}
