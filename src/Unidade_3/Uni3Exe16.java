package Unidade_3;

public class Uni3Exe16 {
    private float valorCompra;
    private float valorCliente;

    public Uni3Exe16(float valorCompra, float valorCliente){
        this.valorCompra = valorCompra;
        this.valorCliente = valorCliente;
    }

    public float valorTroco(float valorCompra, float valorCliente){
        float result = (valorCliente - valorCompra);
        return result;
    }

    public static void main(String[] args) {
        Uni3Exe16 classExec = new Uni3Exe16(0, 0);
        float result = classExec.valorTroco(1258, 1300);
        System.out.println(result);
        System.out.println(result / 100);
        System.out.println(result / 10);
        System.out.println(result % 10);
    }
}