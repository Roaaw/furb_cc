package Unidade_3;

import java.util.Scanner;

public class Uni3Exe07 {
    private float lata350, garrafa600, garrafa2;

    public Uni3Exe07(float lata350, float garrafa600, float garrafa2){
        this.lata350 = lata350;
        this.garrafa600 = garrafa600;
        this.garrafa2 = garrafa2;
    }
    public float lata350(){
        return this.lata350 * 350;
    }
    public float garrafa600(){
        return this.garrafa600 * 600;
    }
    public float garrafa2(){
        return this.garrafa2 * 2000;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a quantidade de latas de 350ml: ");
        float lata350 = sc.nextFloat();
        System.out.print("Insira a quantidade de garrafas de 600ml: ");
        float garrafa600 = sc.nextFloat();
        System.out.print("Insira a quantidade de garrafas de 2l: ");
        float garrafa2 = sc.nextFloat();
        Uni3Exe07 classExec = new Uni3Exe07(lata350, garrafa600, garrafa2);
        float result = (classExec.lata350() + classExec.garrafa600() + classExec.garrafa2()) / 1000;
        System.out.printf("O cliente comprou ao total %.2f litros.", result);
        sc.close();
    }
}
/*
TESTE 1
Insira a quantidade de latas de 350ml: 40
Insira a quantidade de garrafas de 600ml: 34
Insira a quantidade de garrafas de 2l: 120
O cliente comprou ao total 274,40 litros.

TESTE 2
Insira a quantidade de latas de 350ml: 4000
Insira a quantidade de garrafas de 600ml: 5000
Insira a quantidade de garrafas de 2l: 10000
O cliente comprou ao total 24400,00 litros.

TESTE 3
Insira a quantidade de latas de 350ml: 10
Insira a quantidade de garrafas de 600ml: 6
Insira a quantidade de garrafas de 2l: 2
O cliente comprou ao total 11,10 litros.

*/