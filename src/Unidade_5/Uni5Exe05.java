package Unidade_5;

public class Uni5Exe05 {
    public static void main(String[] args) {
        int r = 0;
        int r2 = 4;
        for(int i=0; i<=10; i++){
            if(i % 2 == 0){
                r = r2 *2;
                r2 = r;
            }else{
                r+=2;
            }
            System.out.println(r);
        }
    }
}
