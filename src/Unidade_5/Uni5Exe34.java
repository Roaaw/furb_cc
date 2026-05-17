package Unidade_5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        boolean exit = false;
        int menu = 0;
        String nomeH = "";
        int numDiarias = 0;
        float calculo = 0;
        String text = "";
        int contador = 0;
        do {
            System.out.println("1- Encerrar a conta de um hóspede\n2- Verificar número de contas encerradas\n3- Sair");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("Informe o nome do hóspede: ");
                    nomeH = sc.next();
                    sc.nextLine();
                    System.out.print("Informe o número de diárias: ");
                    numDiarias = sc.nextInt();
                    contador++;
                    if(numDiarias < 15){
                        calculo = (50 + 7.50f) * numDiarias;
                        text = "Nome: "+nomeH+" total a pagar: R$"+df.format(calculo)+"\n";
                    }else if(numDiarias == 15){
                        calculo = (50 + 6.50f) * numDiarias;
                        text = "Nome: "+nomeH+" total a pagar: R$"+df.format(calculo)+"\n";
                    }else if(numDiarias > 15){
                        calculo = (50 + 5.00f) * numDiarias;
                        text = "Nome: "+nomeH+" total a pagar: R$"+df.format(calculo)+"\n";
                    }
                    System.out.println(text);
                    break;
                case 2:
                    System.out.println("Número de contas encerradas: "+contador);
                    break;
                case 3:
                    exit = true;
                    break;
            
                default:
                    break;
            }
        } while (!exit);
        sc.close();
    }
}
