package Unidade_3;

public class Uni3Exe06 {
    private final float valorKg = 25f;
    private final float pratoPeso = 0.750f;
    private float pesagem;
    private float result;

    public Uni3Exe06(float pesagem, float result){
        this.pesagem = pesagem;
        this.result = result;
    }

    public float calculo(float pesagem, float result){
        return result = (pesagem - pratoPeso) * valorKg;
    }
    public static void main(String[] args) {
        Uni3Exe06 calc = new Uni3Exe06(0,0);
        float pesagem = calc.calculo(2.42f, 0);
        System.out.printf("O valor do prato do cliente é: %.2f%n", pesagem);
        pesagem = calc.calculo(1.77f, 0);
        System.out.printf("O valor do prato do cliente é: %.2f%n", pesagem);
    }
}
