package Unidade_3;

public class CalculadoraV2 {
    private double numero1;
    private double numero2;

    public CalculadoraV2(double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double somar(){
        return (this.numero1 + this.numero2);
    }
    public double dividir(){
        return (this.numero1 / this.numero2);
    }
    public double multiplicar(){
        return (this.numero1 * this.numero2);
    }
    public double subtrair(){
        return (this.numero1 - this.numero2);
    }
    public double raizQuad(){
        return Math.sqrt(this.numero1);
    }
    public double exponencial(){
        return Math.pow(this.numero1, this.numero2);
    }

    public static void main(String[] args) {
        CalculadoraV2 calc = new CalculadoraV2(10, 50);
        double resultado = calc.somar();
        System.out.println("Resultado Soma: "+resultado);
        resultado = calc.dividir();
        System.out.println("Resultado  Divisão: "+resultado);
        resultado = calc.multiplicar();
        System.out.println("Resultado Multiplicação: "+resultado);
        resultado = calc.subtrair();
        System.out.println("Resultado Subtração: "+resultado);
        resultado = calc.raizQuad();
        System.out.println("Resultado Raiz Quadrada: "+resultado);
        resultado = calc.exponencial();
        System.out.println("Resultado Exponencial: "+resultado);
    }
}
