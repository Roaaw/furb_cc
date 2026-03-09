import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe15 {
    public static void main(String[] args) {
        float saque,troco;
        float nota100 = 0;
        float nota50 = 0;
        float nota20 = 0;
        float nota10 = 0;
        float nota5 = 0;
        float nota2 = 0;
        float moeda1 = 0;
        float moeda50 = 0;
        float moeda25 = 0;
        float moeda10 = 0;
        float moeda5 = 0;
        float moeda01 = 0;
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");
        df.setRoundingMode(RoundingMode.DOWN);
        System.out.printf("Informe o valor do saque: ");
        saque = scan.nextFloat();
        nota100 = saque / 100f;
        troco = saque % 100f;
        if (troco >= 50f){
            nota50 = troco / 50f;
            troco = troco % 50f;
        }
        if (troco >= 20f){
            nota20 = troco / 20f;
            troco = troco % 20f;
        }
        if (troco >= 10f){
            nota10 = troco / 10f;
            troco = troco % 10f;
        }
        if (troco >= 5f){
            nota5 = troco / 5f;
            troco = troco % 5f;
        }
        if (troco >= 2f){
            nota2 = troco / 2f;
            troco = troco % 2f;
        }
        if (troco >= 1f){
            moeda1 = troco / 1f;
            troco = troco % 1f;
        }
        if (troco >= 0.50f){
            moeda50 = troco / 0.50f;
            troco = troco % 0.50f;
        }
        if (troco >= 0.25f){
            moeda25 = troco / 0.25f;
            troco = troco % 0.25f;
        }
        if (troco >= 0.10f){
            moeda10 = troco / 0.10f;
            troco = troco % 0.10f;
        }
        if (troco >= 0.05f){
            moeda5 = troco / 0.05f;
            troco = troco % 0.05f;
        }
        if (troco >= 0.01f){
            moeda01 = troco / 0.01f;
        }
        System.out.printf("Você vai receber R$%.2f em notas de ",saque);
        if (nota100 >= 1){System.out.printf("%sx R$100,00", df.format(nota100));}
        if (nota50 >= 1){System.out.printf(" %sx R$50,00", df.format(nota50));}
        if (nota20 >= 1){System.out.printf(" %sx R$20,00", df.format(nota20));}
        if (nota10 >= 1){System.out.printf(" %sx R$10,00", df.format(nota10));}
        if (nota5 >= 1){System.out.printf(" %sx R$5,00", df.format(nota5));}
        if (nota2 >= 1){System.out.printf(" %sx R$2,00", df.format(nota2));}
        if (moeda1 > 0 || moeda50 > 0 || moeda25 > 0 || moeda10 > 0 || moeda5 > 0 || moeda01 > 0){System.out.println(" e moedas de ");
            if (moeda1 >= 1){System.out.printf(" %sx R$1,00", df.format(moeda1));}
            if (moeda50 >= 1){System.out.printf(" %sx R$0,50", df.format(moeda50));}
            if (moeda25 >= 1){System.out.printf(" %sx R$0,25", df.format(moeda25));}
            if (moeda10 >= 1){System.out.printf(" %sx R$0,10", df.format(moeda10));}
            if (moeda5 >= 1){System.out.printf(" %sx R$0,05", df.format(moeda5));}
            if (moeda01 >= 1){System.out.printf(" %sx R$0,01", df.format(moeda01));}
        }
        scan.close();
    }
}