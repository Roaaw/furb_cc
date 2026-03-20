package Unidade_4;

import java.util.Scanner;

public class Uni4Exe01 {
    private float horasMes, horasValor;

    public Uni4Exe01(float horasMes, float horasValor){
        this.horasMes = horasMes;
        this.horasValor = horasValor;
    }

    public float calculoSalario(){
        return (this.horasMes * this.horasValor);
    }
    public float calculoSalExtra(){
        if (this.horasMes > 160){
            float result = ((this.horasMes - 160) * (this.horasValor / 2));
            return result;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com as horas trabalhadas no mês: ");
        float horasMes = sc.nextFloat();
        System.out.print("Entre com o valor pago por hora: ");
        float horasValor = sc.nextFloat();
        Uni4Exe01 classExec = new Uni4Exe01(horasMes, horasValor);
        float salarioTotal = classExec.calculoSalario();
        if (salarioTotal > 160){
            float salarioExtra = classExec.calculoSalExtra();
            salarioTotal = salarioTotal + salarioExtra;
        }
        System.out.printf("O salário total é: %.2f",salarioTotal);
        sc.close();
    }
}
/*
TESTE 1
Entre com as horas trabalhadas no mês: 180
Entre com o valor pago por hora: 35
O salário total é: 6650,00

TESTE 2
Entre com as horas trabalhadas no mês: 155
Entre com o valor pago por hora: 35
O salário total é: 5337,50

TESTE 2.1
Entre com as horas trabalhadas no mês: 155
Entre com o valor pago por hora: 35
O salário total é: 5425,00

    No teste 2 a func calculoSalExtra estava direto no return sem o IF o que causava um BUG onde ele fazia a conta 
    ((horasMes - 160) * (horasValor / 2)) 
    (-5) * (17,5) = 87,5
    salarioTotal + 87,5
    5425 - 87,5 = 5337,5

TESTE 3
Entre com as horas trabalhadas no mês: 160
Entre com o valor pago por hora: 35
O salário total é: 5600,00
*/