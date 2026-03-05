import java.util.Scanner;

public class Uni2Exe03 {
    public static void main(String[] args) {
        while (true) {
            double circunferencia, raio, calculo, calculo1;
            double PI = Math.PI;
            Scanner scan = new Scanner(System.in);
            System.out.print("Circuferencia:");
            circunferencia = scan.nextInt();
            raio = circunferencia/2;
            System.out.println(raio);
            calculo1 = Math.pow(raio, 2);
            System.out.println(calculo1);
            calculo = calculo1 * PI;
            System.out.println(calculo);
        }
    }
}
