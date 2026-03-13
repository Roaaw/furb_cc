package Unidade_3;

public class Uni3Exe09 {
    private double raio,altura,volume;
    
    public Uni3Exe09(double raio, double altura){
        this.raio = raio;
        this.altura = altura;
    }
    public double calc(double raio, double altura){
        return volume = Math.PI * Math.pow(raio, 2) * altura;
    }

    public static void main(String[] args) {
        Uni3Exe09 classExec = new Uni3Exe09(0, 0);
        double result = classExec.calc(6,10);
        System.out.printf("O volume da lata de óleo é: %.2f%n",result);
        result = classExec.calc(12,12);
        System.out.printf("O volume da lata de óleo é: %.2f%n",result);
    }
}
