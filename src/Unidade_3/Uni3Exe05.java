package Unidade_3;

public class Uni3Exe05 {
    private final float chip = 4f;
    private final float anel = 3.5f;
    private float qntdFrango;
    private float result;

    public Uni3Exe05(float qntdFrango, float result){
        this.qntdFrango = qntdFrango;
        this.result = result;
    }
    public float calculoFrango(float qntdFrango, float result){
        return result = ((qntdFrango * chip) + ((qntdFrango * anel)*2));
    }
    public static void main(String[] args) {
        Uni3Exe05 calculo = new Uni3Exe05(0, 0);
        float resultado = calculo.calculoFrango(625,0);
        System.out.printf("O gasto total para marcar 625 é %.2f%n", resultado);
        resultado = calculo.calculoFrango(84,0);
        System.out.printf("O gasto total para marcar 84 é %.2f%n", resultado);
    }
}
