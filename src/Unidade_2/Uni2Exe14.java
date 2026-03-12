package Unidade_2;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe14 {
    public static void main(String[] args) {
        int saque,resto;
        int nota100 = 0;
        int nota50 = 0;
        int nota20 = 0;
        int nota10 = 0;
        int nota5 = 0;
        int nota2 = 0;
        int nota1 = 0;
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.print("Informe o valor do saque: ");
        saque = scan.nextInt();
        nota100 = saque / 100;
        resto = saque % 100;
        if(resto < 0){
            nota100 = saque / 100;
        }
        if(resto >= 50){
            nota50 = resto / 50;
            resto = resto % 50;
        }
        if(resto >= 20){
            nota20 = resto / 20;
            resto = resto % 20;
        }
        if(resto >= 10){
            nota10 = resto / 10;
            resto = resto % 10;
        }
        if(resto >= 5){
            nota5 = resto / 5;
            resto = resto % 5;
        }
        if(resto >= 2){
            nota2 = resto / 2;
            resto = resto % 2;
        }
        if(resto >= 1){
            nota1 = resto / 1;
        }
        System.out.printf("Você vai receber R$%s em notas de ",df.format(saque));
        if (nota100 > 0){System.out.printf("%sx R$100,00", nota100);}
        if (nota50 > 0){System.out.printf(", %sx R$50,00", nota50);}
        if (nota20 > 0){System.out.printf(", %sx R$20,00", nota20);}
        if (nota10 > 0){System.out.printf(", %sx R$10,00", nota10);}
        if (nota5 > 0){System.out.printf(", %sx R$5,00", nota5);}
        if (nota2 > 0){System.out.printf(", %sx R$2,00", nota2);}
        if (nota1 > 0){System.out.printf(", %sx R$1,00", nota1);}
        scan.close();
    }
}
