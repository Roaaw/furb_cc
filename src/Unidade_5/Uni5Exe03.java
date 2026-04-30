package Unidade_5;

public class Uni5Exe03 {
    public static void main(String[] args) {
    float num = 1;
    float div;
    float result = 0;
        for(int i=1; i<100; i++){
            div = num / i;
            result += div;
        }
        System.out.println(result);
    }
}
