package Unidade_3;

import java.util.Scanner;

public class Uni3Exe05 {
    private final float chip = 4f;
    private final float anel = 3.5f;
    private float qntdFrango;

    public Uni3Exe05(float qntdFrango){
        this.qntdFrango = qntdFrango;
    }
    public float calculoFrango(){
        return ((this.qntdFrango * chip) + ((this.qntdFrango * anel)*2));
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a quantidade de frangos: ");
        float qntdFrango = sc.nextFloat();
        Uni3Exe05 calculo = new Uni3Exe05(qntdFrango);
        System.out.printf("O gasto total para marcar %s é %.2f%n",qntdFrango , calculo.calculoFrango());
        sc.close();
    }
}
/*
TESTE 1
Insira a quantidade de frangos: 625
O gasto total para marcar 625.0 é 6875,00

TESTE 2
Insira a quantidade de frangos: 84
O gasto total para marcar 84.0 é 924,00

TESTE 3
Insira a quantidade de frangos: 6874
O gasto total para marcar 6874.0 é 75614,00

*/