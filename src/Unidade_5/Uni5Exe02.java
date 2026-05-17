package Unidade_5;

public class Uni5Exe02 {
    private int totalPar = 0;
    private int totalImpar = 0;

    public Uni5Exe02(){
        logica();
    }

    private void logica(){
        for(int i=1; i<=100; i++){
            if(i % 2 == 0){
                totalPar += i; 
            }else{
                totalImpar += i;
            }
        }
        saida();
    }
    private void saida(){
        System.out.println("Total Par: "+totalPar);
        System.out.println("Total Impar: "+totalImpar);
    }
    public static void main(String[] args) {
        new Uni5Exe02();
    }
}
