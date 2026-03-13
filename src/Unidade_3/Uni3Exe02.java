package Unidade_3;

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
        float resultado = desconto.desconto(100);
        float valorDesconto = desconto.valor(100);
        System.out.printf("O valor do desconto é de R$ %.2f.%nO preço do par de sapatos com desconto é R$ %.2f",resultado, valorDesconto);
        resultado = desconto.desconto(129);
        valorDesconto = desconto.valor(129);
        System.out.printf("O valor do desconto é de R$ %.2f.%nO preço do par de sapatos com desconto é R$ %.2f",resultado, valorDesconto);
    }
}
