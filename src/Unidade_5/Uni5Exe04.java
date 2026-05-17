package Unidade_5;

public class Uni5Exe04 {
    private float num1 = 1;
    private float num2 = 2;
    private float tab = 0;
    private float j = 2;
    private float div = 0;
    private float result = 0;

    public Uni5Exe04(){
        logica();
    }
    private void logica(){
        for(int i = 1; i<=20; i++){
            num1 += 2;
            tab = i * j;
            if(i == 1){
                div = num1 / num2;
            }else if(i >= 2){
                num2 += tab;
                div = num1 / num2;
            }
            result += div;
            saida();
        }  
    }
    private void saida(){
        System.out.println(result);
    }
    public static void main(String[] args) {
        new Uni5Exe04();
    }
}