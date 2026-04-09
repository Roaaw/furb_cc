package beecrowd;

import java.util.Scanner;

public class TempoJogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ih,fh;
        ih = sc.nextInt();
        if (ih < 0 || ih > 24){
            ih = sc.nextInt();
        }
        fh = sc.nextInt();
        if (fh < 0 || fh > 24){
            fh = sc.nextInt();
        }
        sc.close();
        if(fh < 12){
            System.out.printf("O JOGO DUROU %s HORA(S)", fh - ih + 24);
        }else if (ih < 12){
            System.out.printf("O JOGO DUROU %s HORA(S)",fh - ih);
        }
    }
}
