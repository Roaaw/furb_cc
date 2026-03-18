package Unidade_3;

import java.util.Scanner;

public class Uni3Exe08 {
    private final float dolarHoje = 5.65f;
    private float dolarCliente,result;

    public Uni3Exe08(float dolarCliente){
        this.dolarCliente = dolarCliente;
    }
    public float dolarToReal(float dolarCliente){
        return dolarCliente * dolarHoje;
    }
    public static void main(String[] args) {
        Uni3Exe08 classExec = new Uni3Exe08(0);
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o valor em dólares: ");
        float dolarCliente = sc.nextFloat();
        System.out.printf("O atendente deve devolver R$ %.2f para o cliente.",classExec.dolarToReal(dolarCliente));
        sc.close();
    }
}
/*
TESTE 1
Insira o valor em dólares: 440
O atendente deve devolver R$ 2486,00 para o cliente.

TESTE 2
Insira o valor em dólares: 900
O atendente deve devolver R$ 5085,00 para o cliente.

TESTE 3
Insira o valor em dólares: 12675
O atendente deve devolver R$ 71613,75 para o cliente.

*/