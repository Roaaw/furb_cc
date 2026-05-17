package Unidade_5;

public class Uni5Exe03 {
    private double num = 1;
    private double div;
    private double result = 0;

    public Uni5Exe03(){
        logica();
    }

    private void logica(){
        for(int i=1; i<100; i++){
            div = num / i;
            result += div;
        }
        saida();
    }
    private void saida(){
        System.out.printf("%.2f", result);
    }
    public static void main(String[] args) {
        new Uni5Exe03();
    }
}
