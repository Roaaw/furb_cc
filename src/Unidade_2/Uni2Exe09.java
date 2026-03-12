package Unidade_2;
import java.util.Scanner;

public class Uni2Exe09 {
    public static void main(String[] args) {
        float dolar,reais;
        float dolarcotacao = 5.23f;
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira a quantidade de dolar que deseja converter em reais: ");
        dolar = scan.nextFloat();
        reais = dolar * dolarcotacao;
        System.out.printf("Você recebeu %.2f",reais);
        scan.close();
    }
}
