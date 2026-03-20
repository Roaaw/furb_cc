package Unidade_4;

import java.util.Scanner;

public class Uni4Exe04 {
    private float numero;

    public Uni4Exe04(float numero){
        this.numero = numero;
    }
    public float temDecimal(){
        float result = numero % 1;
        if (result == 0) {
            return 0;
        }else{
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva um numero maior que 0: ");
        float numero = sc.nextFloat();
        sc.close();
        Uni4Exe04 classExec = new Uni4Exe04(numero);
        float result = classExec.temDecimal();
        if (result == 1) {
            System.out.println("Casas decimais foram digitadas.");
        }else{
            System.out.println("Casas decimais não foram digitadas.");
        }
    }
}
/*
TESTE 1
Escreva um numero maior que 0: 1,33
Casas decimais foram digitadas.

TESTE 2
Escreva um numero maior que 0: 5
Casas decimais não foram digitadas.

TESTE 3
Escreva um numero maior que 0: 10,5
Casas decimais foram digitadas.

*/
