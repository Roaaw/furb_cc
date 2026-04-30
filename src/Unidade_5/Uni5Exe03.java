package Unidade_5;

public class Uni5Exe03 {
    public static void main(String[] args) {
    double num = 1;
    double div;
    double result = 0;
        for(int i=1; i<100; i++){
            div = num / i;
            result += div;
        }
        System.out.printf("%.2f",result);
    }
}
