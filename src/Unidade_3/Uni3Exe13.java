package Unidade_3;

public class Uni3Exe13 {
    private final float valorAzuleijo = 12.50f;
    private float altura;
    private float largura;

    public Uni3Exe13(float altura, float largura){
        this.altura = altura;
        this.largura = largura;
    }

    public float calcMetros(float altura, float largura){
        return (altura * largura);
    }
    public float valorAzuleijo(float altura, float largura){
        return calcMetros(altura, largura) * (valorAzuleijo * 9);
    }

    public static void main(String[] args) {
        Uni3Exe13 classExec = new Uni3Exe13(0,0);
        float result = classExec.calcMetros(2, 6);
        System.out.printf("O valor final é: %s%n",result);
        result = classExec.valorAzuleijo(2,6);
        System.out.printf("O valor final é: %.2f%n", result);
        result = classExec.calcMetros(1.8f, 2.6f);
        System.out.printf("O valor final é: %s%n",result);
        result = classExec.valorAzuleijo(1.8f, 2.6f);
        System.out.printf("O valor final é: %.2f%n", result);
    }

}
