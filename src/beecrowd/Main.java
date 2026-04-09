package beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double a, b, c, delta, x, y;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        sc.close();
        if (a == 0){
            System.out.println("Impossivel calcular");
        }else{
            delta = Math.pow(b, 2) - (4 * a * c);
            if (delta < 0){
                System.out.println("Impossivel calcular");
            }else{
                x = (-b + Math.sqrt(delta)) / (2 * a);
                y = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("R1 = %.5f%n",x);
                System.out.printf("R2 = %.5f",y);
            }
        }
    }
}
