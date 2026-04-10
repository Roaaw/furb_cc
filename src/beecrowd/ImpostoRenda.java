package beecrowd;

import java.util.Scanner;

public class ImpostoRenda {
    public static void main(String[] args) {
        float renda;
        Scanner sc = new Scanner(System.in);
        renda = sc.nextFloat();
        sc.close();
        if (renda > 0 && renda < 2000) {
            System.out.println("Isento");
        }else if(renda > 2000.01 && renda < 3000){
            System.out.println("R$ "+(renda - 2000) * 0.08f);
        }else if(renda > 3000.01 && renda < 4500){
            System.out.println("R$ "+ (((renda - 2000) * 0.08f) + ((renda - 3000) * 0.18f)));
        }else if(renda > 4500.01){
            System.out.println("R$ "+renda * 0.28f);
        }
    }
}
