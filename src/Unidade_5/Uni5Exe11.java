package Unidade_5;

public class Uni5Exe11 {
    private int b = 0;
    public Uni5Exe11(){
        logic();
    }
    private void logic(){
        for(int i=1; i<=16; i++){
            if(i == 1){
                b+=1;
            }else if (i == 2){
                b+=3;
            }else if(i > 2){
                b += b * 3;
            }
            // System.out.printf("Hora %s, Biscoito Quebrado: %s\n",i,b);
        }
        output();
    }
    private void output(){
        System.out.println("Número de biscoitos quebrados em 16 horas: "+b);
    }
    public static void main(String[] args) {
        new Uni5Exe11();
    }
}
