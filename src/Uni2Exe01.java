import java.util.Scanner;

public class Uni2Exe01 {
    public static void main(String[] args) {
        while (true) {
            int num1, num2, soma;
            Scanner scan = new Scanner (System.in);
            System.out.print("Num1:");
            num1 = scan.nextInt();
            System.out.print("Num2:");
            num2 = scan.nextInt();
            soma = num1 + num2;
            System.out.println("Soma: "+soma);
            //scan.close();
        }
    }
}
