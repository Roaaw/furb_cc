package beecrowd;

import java.util.Scanner;

public class AumentoSalario {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float salario,salarioNovo,salarioReajuste;
    String reajuste;
    salario = sc.nextFloat();
    sc.close();

    if (salario <= 400){
        salarioNovo = salario + (salario * 0.15f);
        salarioReajuste = salario * 0.15f;
        reajuste = "15 %";
        System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: %s", salarioNovo, salarioReajuste, reajuste);
    }else if (salario <= 800){
        salarioNovo = salario + (salario * 0.12f);
        salarioReajuste = salario * 0.12f;
        reajuste = "12 %";
        System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: %s", salarioNovo, salarioReajuste, reajuste);
    }else if (salario <= 1200){
        salarioNovo = salario + (salario * 0.10f);
        salarioReajuste = salario * 0.10f;
        reajuste = "10 %";
        System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: %s", salarioNovo, salarioReajuste, reajuste);
    }else if (salario <= 2000){
        salarioNovo = salario + (salario * 0.07f);
        salarioReajuste = salario * 0.07f;
        reajuste = "7 %";
        System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: %s", salarioNovo, salarioReajuste, reajuste);
    }else if (salario > 2000){
        salarioNovo = salario + (salario * 0.04f);
        salarioReajuste = salario * 0.04f;
        reajuste = "4 %";
        System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: %s", salarioNovo, salarioReajuste, reajuste);
    }
 }   
}
