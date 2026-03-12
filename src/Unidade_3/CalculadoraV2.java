package Unidade_3;

public class CalculadoraV2 {
    private double numero1;
    private double numero2;

    public CalculadoraV2(double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double somar(double numero1, double numero2){
        return (numero1 + numero2);
    }
    public double dividir(double numero1, double numero2){
        return (numero1 / numero2);
    }
    public double multiplicar(double numero1, double numero2){
        return (numero1 * numero2);
    }
    public double subtrair(double numero1, double numero2){
        return (numero1 - numero2);
    }
    public double raizQuad(double numero1){
        return Math.sqrt(numero1);
    }
    public double exponencial(double numero1, double numero2){
        return Math.pow(numero1, numero2);
    }

    public static void main(String[] args) {
        CalculadoraV2 calc = new CalculadoraV2(0, 0);
        double resultado = calc.somar(10, 5);
        System.out.println("Resultado Soma: "+resultado);
        resultado = calc.dividir(25, 5);
        System.out.println("Resultado  Divisão: "+resultado);
        resultado = calc.multiplicar(5, 5);
        System.out.println("Resultado Multiplicação: "+resultado);
        resultado = calc.subtrair(15, 5);
        System.out.println("Resultado Subtração: "+resultado);
        resultado = calc.raizQuad(25);
        System.out.println("Resultado Raiz Quadrada: "+resultado);
        resultado = calc.exponencial(5, 2);
        System.out.println("Resultado Exponencial: "+resultado);
    }
}
