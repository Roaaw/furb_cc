package Unidade_3;

import java.util.Scanner;

public class Uni3Exe03 {
    private float valorCombustivel;
    private float valorDinheiro;
    private float litros;

    public Uni3Exe03(float valorCombustivel, float valorDinheiro, float litros){
        this.valorCombustivel = valorCombustivel;
        this.valorDinheiro = valorDinheiro;
        this.litros = litros;
    }
    public float litros(float valorCombustivel, float valorDinheiro, float litros){
        return litros = valorDinheiro / valorCombustivel;
    }
    public static void main(String[] args) {
        Uni3Exe03 abastecer = new Uni3Exe03(0,0,0);
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o preço do litro da gasolina:" );
        float valorCombustivel = sc.nextFloat();
        System.out.print("Valor do abastecimento em dinheiro:" );
        float valorDinheiro = sc.nextFloat();
        float resultado = abastecer.litros(valorCombustivel, valorDinheiro, 0);
        System.out.printf("O motorista conseguiu colocar %.2f litros.", resultado);
        sc.close();
    }
}
/*
TESTE 1
Insira o preço do litro da gasolina:5,75
Valor do abastecimento em dinheiro:150
O motorista conseguiu colocar 26,09 litros.

TESTE 2
Insira o preço do litro da gasolina:7
Valor do abastecimento em dinheiro:200
O motorista conseguiu colocar 28,57 litros.

TESTE 3
Insira o preço do litro da gasolina:6,69
Valor do abastecimento em dinheiro:400
O motorista conseguiu colocar 59,79 litros.

*/