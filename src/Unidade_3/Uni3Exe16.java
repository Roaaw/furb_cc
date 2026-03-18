package Unidade_3;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe16 {
    private float valorCompra;
    private float valorCliente;

    public Uni3Exe16(float valorCompra, float valorCliente){
        this.valorCompra = valorCompra;
        this.valorCliente = valorCliente;
    }

    public float valorTroco(float valorCompra, float valorCliente){
        float result = (valorCliente - valorCompra);
        return result;
    }
    public float notas100(float result){
        float notas = (result / 100);
        return notas;
    }
    public float notas10(float result){
        float notas = ((result % 100) / 10);
        return notas;
    }
    public float notas1(float result){
        float notas = (result % 10);
        return notas;
    }

    public static void main(String[] args) {
        Uni3Exe16 classExec = new Uni3Exe16(0, 0);
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");
        df.setRoundingMode(RoundingMode.DOWN);
        System.out.print("Insira o valor total da compra: ");
        float valorCompra = sc.nextFloat();
        System.out.print("Insira o valor total dado pelo cliente: ");
        float valorCliente = sc.nextFloat();
        sc.close();
        float result = classExec.valorTroco(valorCompra, valorCliente);
        float troco = classExec.notas100(result);

        if(troco > 1){
            System.out.printf("Quantidade de notas de 100 necessária é: %s%n", df.format(troco));
        }
        troco = classExec.notas10(result);
        if(troco > 1){
        System.out.printf("Quantidade de notas de 10 necessária é: %s%n", df.format(troco));
        }
        troco = classExec.notas1(result);
        if(troco > 1){
        System.out.printf("Quantidade de notas de 1 necessária é: %s%n", df.format(troco));
        }
    }
}

/*
TESTE 1
Insira o valor total da compra: 1258
Insira o valor total dado pelo cliente: 1300
Quantidade de notas de 10 necessária é: 4
Quantidade de notas de 1 necessária é: 2

TESTE 2
Insira o valor total da compra: 3258
Insira o valor total dado pelo cliente: 6000
Quantidade de notas de 100 necessária é: 27
Quantidade de notas de 10 necessária é: 4
Quantidade de notas de 1 necessária é: 2

TESTE 3
Insira o valor total da compra: 58
Insira o valor total dado pelo cliente: 1000
Quantidade de notas de 100 necessária é: 9
Quantidade de notas de 10 necessária é: 4
Quantidade de notas de 1 necessária é: 2
*/