package Unidade_4;

import java.util.Scanner;

public class Uni4Exe21 {
    Scanner sc = new Scanner(System.in);
    private float massa, altura, formula;
    private String result;

    public Uni4Exe21(){
        entrada();
        logica();
        saida();
    }
    private void entrada(){ 
        System.out.print("Digite sua altura: ");
        altura = sc.nextFloat();
        System.out.print("Digite seu peso: ");
        massa = sc.nextFloat();
    }
    private void logica(){
        formula = massa / (float)Math.pow(altura, 2);
        if(formula < 18.5){
            result = "Magreza"; 
        }else if(formula >= 18.5 && formula <= 24.9){
            result = "Saudável";
        }else if(formula > 25 && formula <= 29.9){
            result = "Sobrepeso";
        }else if(formula > 30 && formula <= 34.9){
            result = "Obesidade Grau I";
        }else if(formula > 35 && formula <= 39.9){
            result = "Obesidade Grau II (severa)";
        }else{
            result = "Obesidade Grau III (mórbida)";
        }
    }
    private void saida(){
        System.out.print(result);
    }
    public static void main(String[] args) {
        new Uni4Exe21();
    }
}
/*
TESTE 1

Digite sua altura: 1,75
Digite seu peso: 50
Magreza
TESTE 2

Digite sua altura: 1,8
Digite seu peso: 70
Saudável
TESTE 3

Digite sua altura: 1,65
Digite seu peso: 85
Obesidade Grau I
TESTE 4

Digite sua altura: 1,75
Digite seu peso: 120
Obesidade Grau II (severa)
 */