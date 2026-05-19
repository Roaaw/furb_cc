package Unidade_5;

public class Uni5Exe10 {
    private int sum = 0;
    public Uni5Exe10(){
        logic();
    }
    private void logic(){
        for(int i=0; i < 10000; i++){
            for(int j=0; j < 10000; j++){
                int num = i+j;
                int r = (int)Math.pow(num, 2);
                String temp = i+""+j;
                String temp2 = r+"";
                if(temp.equals(temp2)){
                    sum ++;
                    System.out.println(i+" + "+j+" = "+num+" -> "+num+"² = "+r);
                }
                if(sum == 10){
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        new Uni5Exe10();
    }
}
