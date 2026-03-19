package Unidade_3;

import java.util.Scanner;

public class Uni3Exe03 {
    private float valorCombustivel;
    private float valorDinheiro;

    public Uni3Exe03(float valorCombustivel, float valorDinheiro){
        this.valorCombustivel = valorCombustivel;
        this.valorDinheiro = valorDinheiro;
    }
    public float litros(){
        return this.valorDinheiro / this.valorCombustivel;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o preço do litro da gasolina:" );
        float valorCombustivel = sc.nextFloat();
        System.out.print("Valor do abastecimento em dinheiro:" );
        float valorDinheiro = sc.nextFloat();
        Uni3Exe03 abastecer = new Uni3Exe03(valorCombustivel,valorDinheiro);
        System.out.printf("O motorista conseguiu colocar %.2f litros.", abastecer.litros());
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