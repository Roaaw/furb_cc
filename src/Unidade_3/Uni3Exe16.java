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

    public float notasTroco100(float result){
        return result = (valorTroco(valorCompra, valorCliente) / 100);
    }
    public float notasTroco10(float result){
        return result = (valorTroco(valorCompra, valorCliente) / 10);
    }
    public float notasTroco1(float result){
        return result = (valorTroco(valorCompra, valorCliente) % 1);
    }

    public static void main(String[] args) {
        Uni3Exe16 classExec = new Uni3Exe16(0, 0);
        float result = classExec.valorTroco(1258, 1300);
        System.out.println(result);
        if(classExec.notasTroco100(result) >= 0 ){
            result = classExec.notasTroco100(result);
            System.out.println(result);
        }
        if(classExec.notasTroco10(result) >= 0 ){
            result = classExec.notasTroco10(result);
            System.out.println(result);
        }
        if(classExec.notasTroco1(result) >= 0 ){
            result = classExec.notasTroco1(result);
            System.out.println(result);
        }
    }
}