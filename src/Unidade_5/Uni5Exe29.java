package Unidade_5;

import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        System.out.print("Informe o valor em R$: ");
        int valor = sc.nextInt();
        String saida = "";
        while (exit) {
            if (valor / 20 != 0){
                saida += "Notas de R$ 20: "+valor / 20;
                valor = valor - ((valor / 20) * 20);
            }else if(valor / 10 != 0){
                saida += "\nNotas de R$ 10: "+valor / 10;
                valor = valor - ((valor / 10) * 10);
            }else if(valor / 5 != 0){
                saida += "\nNotas de R$ 5: "+valor / 5;
                valor = valor - ((valor / 5) * 5);
            }else if(valor / 2 != 0){
                saida += "\nNotas de R$ 2: "+valor / 2;
                valor = valor - ((valor / 2) * 2);
            }else if(valor / 1 != 0){
                saida += "\nNotas de R$ 1: "+valor / 1;
                valor = valor - ((valor / 1) * 1);
            }
            if (valor == 0){
                exit = false;
            }
        }
        System.out.println(saida);
        sc.close();
    }
}
