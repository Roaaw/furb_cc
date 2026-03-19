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

    public float valorTroco(){
        return (this.valorCliente - this.valorCompra);
    }
    public float notas100(){
        return (valorTroco() / 100);
    }
    public float notas10(){
        return((valorTroco() % 100) / 10);
    }
    public float notas1(){
        return(valorTroco() % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");
        df.setRoundingMode(RoundingMode.DOWN);
        System.out.print("Insira o valor total da compra: ");
        float valorCompra = sc.nextFloat();
        System.out.print("Insira o valor total dado pelo cliente: ");
        float valorCliente = sc.nextFloat();
        sc.close();
        Uni3Exe16 classExec = new Uni3Exe16(valorCompra, valorCliente);

        if(classExec.notas100() > 1){
            System.out.printf("Quantidade de notas de 100 necessária é: %s%n", df.format(classExec.notas100()));
        }
        if(classExec.notas10() > 1){
        System.out.printf("Quantidade de notas de 10 necessária é: %s%n", df.format(classExec.notas10()));
        }
        if(classExec.notas1() > 1){
        System.out.printf("Quantidade de notas de 1 necessária é: %s%n", df.format(classExec.notas1()));
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