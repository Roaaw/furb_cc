package Unidade_4;

import java.util.Scanner;

public class Uni4Exe18 {
    Scanner sc = new Scanner(System.in);
    private float diaVencimento, diaPagamento, valorPrestacao, a, b;
    private final float desconto = 0.10f;
    private final float multa = 0.02f;
    private String result;

    public Uni4Exe18(){
        entrada();
        logica();
        saida();
    }

    private void entrada(){
        System.out.print("Informe o dia do vencimento: ");
        diaVencimento = sc.nextFloat();
        System.out.print("Informe o dia do pagamento: ");
        diaPagamento = sc.nextFloat();
        System.out.print("Informe o valor da prestação: ");
        valorPrestacao = sc.nextFloat();
    }
    private void logica(){
        if(diaVencimento >= diaPagamento){
            a = valorPrestacao - (valorPrestacao * desconto);
            result = "O pagamento está em dia.O valor da prestação = R$";
        }else if((diaVencimento + 5) >= diaPagamento){
            a = valorPrestacao;
            //a = (valorPrestacao * multa) + valorPrestacao;
            result = "O pagamento está atrasado, mas dentro do período de tolerância.O valor da prestação = R$";
        }else{
            b = diaPagamento - diaVencimento;
            a = (valorPrestacao * (b * multa)) + valorPrestacao;
            result = "O pagamento está atrasado.Multa de 2% por dia de atraso.Valor da prestação = R$";
        }
    }
    private void saida(){
        System.out.printf("%s %.2f", result, a);
    }
    public static void main(String[] args) {
        new Uni4Exe18();
    }
}
/*
TESTE 1

Informe o dia do vencimento: 10 
Informe o dia do pagamento: 9
Informe o valor da prestação: 100
O pagamento está em dia.O valor da prestação = R$90,00
TESTE 2

Informe o dia do vencimento: 10
Informe o dia do pagamento: 17   
Informe o valor da prestação: 100
O pagamento está atrasado.Multa de 2% por dia de atraso.Valor da prestação = R$ 114,00
TESTE 3

Informe o dia do vencimento: 10
Informe o dia do pagamento: 15
Informe o valor da prestação: 100
O pagamento está atrasado, mas dentro do período de tolerância.O valor da prestação = R$ 100,00
*/