import java.util.Scanner;

public class Uni2Exe02 {
    public static void main(String[] args) {
        while (true) {
            int num1, num2, mult;
            Scanner scan = new Scanner(System.in);
            System.out.print("Num1: ");
            num1 = scan.nextInt();
            System.out.print("Num2: ");
            num2 = scan.nextInt();
            mult = num1 * num2;
            System.out.println("Multiplicaçâo: "+mult);
            //scan.close();
        }
    }
}
