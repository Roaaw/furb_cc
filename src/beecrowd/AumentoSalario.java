package beecrowd;

import java.util.Scanner;

public class AumentoSalario {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float salario;
    salario = sc.nextFloat();

    if (salario <= 400){
        salario = salario + (salario * 0.15f);
        System.out.printf("%.2f", salario);
    }else if (salario <= 800){

    }else if (salario <= 1200){

    }else if (salario <= 2000){

    }else if (salario > 2000){

    }
 }   
}
