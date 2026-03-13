package Unidade_3;

public class Uni3Exe04 {
    private float nota1;
    private float nota2;
    private float nota3;
    private float media;

    public Uni3Exe04(float nota1, float nota2, float nota3, float media){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.media = media;
    }
    public float mediaPonderada(float nota1,float nota2,float nota3,float media){
        return media = (nota1 * 0.5f) + (nota2 * 0.3f) + (nota3 * 0.2f);
    }
    public static void main(String[] args) {
        Uni3Exe04 calculo = new Uni3Exe04(0, 0, 0,0);
        float resultado = calculo.mediaPonderada(9,6,8,0);
        System.out.printf("Média Ponderada: %.2f%n",resultado);
        resultado = calculo.mediaPonderada(4,8,6,0);
        System.out.printf("Média Ponderada: %.2f%n",resultado);
    }
}
