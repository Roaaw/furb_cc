package Unidade_3;

import java.util.Scanner;

public class Uni3Exe03 {
    private final float valorCombustivel = 5.75f;
    private float valorDinheiro;
    private float litros;

    public Uni3Exe03(float valorDinheiro, float litros){
        this.valorDinheiro = valorDinheiro;
        this.litros = litros;
    }
    public float litros(float valorDinheiro, float litros){
        return litros = valorDinheiro / valorCombustivel;
    }
    public static void main(String[] args) {
        Uni3Exe03 abastecer = new Uni3Exe03(0,0);
        Scanner scan = new Scanner(System.in);
        System.out.print("Valor do abastecimento em dinheiro:" );
        float resultado = abastecer.litros(scan.nextFloat(),0);
        System.out.printf("O motorista conseguiu colocar %.2f litros.", resultado);
        scan.close();
    }
}
