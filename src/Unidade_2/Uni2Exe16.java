package Unidade_2;
import java.util.Scanner;

public class Uni2Exe16 {
    public static void main(String[] args) {
        final float lata = 350;     //ml
        final float garrafa = 600;  //ml
        final float litro = 2000;   //ml
        float qtdlata,qtdgarrafa,qtdlitro, resultado;
        Scanner scan = new Scanner(System.in);
        System.out.print("Quantidade de Latas:");
        qtdlata = scan.nextInt();
        System.out.print("Quantidade de Garrafas 600:");
        qtdgarrafa = scan.nextInt();
        System.out.print("Quantidade de Garrafas 2L:");
        qtdlitro = scan.nextInt();
        resultado = ((lata * qtdlata) + (garrafa * qtdgarrafa) + (litro * qtdlitro));
        if (resultado >= 1000){
            System.out.printf("Comerciante comprou %.2f litros de refrigerante.",resultado);
        }
        else{
            System.out.printf("Comerciante comprou %.2f ml de refrigerante.",resultado);
        }
        scan.close();
    }
}
