package Unidade_5;

public class Uni5Exe11 {
    public static void main(String[] args) {
        int b = 0;
        for(int i=1; i<=16; i++){
            if(i == 1){
                b+=1;
            }else if (i == 2){
                b+=3;
            }else if(i > 2){
                b *= 3;
            }
        }
        System.out.println("Número de biscoitos quebrados em 16 horas: "+b);
    }
}
