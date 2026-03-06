import java.util.Scanner;

public class Uni2Exe14 {
    public static void main(String[] args) {
        int saque,valor,resto;
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o valor do saque: ");
        saque = scan.nextInt();
        valor = saque/100;
        resto = saque%100;
        if(valor > 0 || resto < 0){
            System.out.println("1");
        }
        if(resto > 0){
            System.out.println("2");
        }
    }
}
