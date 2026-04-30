package Unidade_5;

public class Uni5Exe04 {
    public static void main(String[] args) {
        float num1 = 1;
        float num2 = 2;
        float tab = 0;
        float j = 2;
        float div = 0;
        float result = 0;
        for(int i=1; i<=20; i++){
            num1 += 2;
            tab = i * j;
            // System.out.println(num1);
            if(i == 1){
                // System.out.println(num2);
                div = num1 / num2;
            }else if(i >= 2){
                num2 += tab;
                // System.out.println(num2);
                div = num1 / num2;
            }
            result += div;
            System.out.println(result);
        }
    }
}