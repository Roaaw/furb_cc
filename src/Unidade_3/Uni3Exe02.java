package Unidade_3;

import java.util.Scanner;

public class Uni3Exe02 {
    private final float desconto = 0.12f;//12%
    private float valorProduto;
    private float valorDesconto;

    public Uni3Exe02(float valorProduto){
        this.valorProduto = valorProduto;
    }
    public float desconto(float valorProduto){
        return valorProduto * desconto;
    }
    public float valor(float valorDesconto){
        return valorDesconto - desconto(valorDesconto);
    }
    public static void main(String[] args) {
        Uni3Exe02 desconto = new Uni3Exe02(0);
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o valor do par de sapatos: ");
        float valorProduto = sc.nextFloat();
        float resultado = desconto.desconto(valorProduto);
        float valorDesconto = desconto.valor(valorProduto);
        System.out.printf("O valor do desconto é de R$ %.2f.%nO preço do par de sapatos com desconto é R$ %.2f",resultado, valorDesconto);
        sc.close();
    }
}
/*
TESTE 1
Informe o valor do par de sapatos: 100
O valor do desconto é de R$ 12,00.
O preço do par de sapatos com desconto é R$ 88,00

TESTE 2
Informe o valor do par de sapatos: 129
O valor do desconto é de R$ 15,48.
O preço do par de sapatos com desconto é R$ 113,52

TESTE 3
Informe o valor do par de sapatos: 657
O valor do desconto é de R$ 78,84.
O preço do par de sapatos com desconto é R$ 578,16

*/