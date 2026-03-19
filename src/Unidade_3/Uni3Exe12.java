package Unidade_3;

import java.util.Scanner;

public class Uni3Exe12 {
    private String nome;
    private float horasTrab;
    private float numDependentes;
    private final float valorHora = 10f;
    private final float valorDependente = 60f;
    private final float valorInss = 0.085f;
    private final float valorIcms = 0.05f;

    public Uni3Exe12(String nome, float horasTrab, float numDependentes){
        this.nome = nome;
        this.horasTrab = horasTrab;
        this.numDependentes = numDependentes;
    }
    public String nome(){
        return this.nome;
    }
    public float calcSalario(){
        return this.horasTrab * valorHora;
    }
    public float calcDependetes(){
        return this.numDependentes * valorDependente;
    }
    public float descInss(){
        return (calcSalario() + calcDependetes()) * valorInss;
    }
    public float descIcms(){
        return (calcSalario() + calcDependetes()) * valorIcms;
    }
    public float salarioLiquido(){
        return (calcSalario() + calcDependetes()) - descIcms() - descInss();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o nome do funcionário: ");
        String nome = sc.next();
        System.out.print("Insira a quantidade de horas trabalhadas no mês: ");
        float horasTrab = sc.nextFloat();
        System.out.print("Insira o numero de dependentes: ");
        float numDependentes = sc.nextFloat();
        Uni3Exe12 classExec = new Uni3Exe12(nome, horasTrab, numDependentes);
        //float result = classExec.calcDependetes();
        //System.out.printf("Dependentes: %.2f%n", result);
        //result = classExec.descIcms();   
        //System.out.printf("Icms: %.2f%n", result);
        //result = classExec.descInss();
        //System.out.printf("Inss: %.2f%n", result);
        System.out.printf("O funcionário %s possui um salário bruto de R$ %.2f e um salário líquido de R$ %.2f.",classExec.nome(), classExec.calcSalario(), classExec.salarioLiquido());
        sc.close();
    }
}
/*
TESTE 1
Insira o nome do funcionário: João
Insira a quantidade de horas trabalhadas no mês: 160
Insira o numero de dependentes: 2
O funcionário Jo?o possui um salário bruto de R$ 1600,00 e um salário líquido de R$ 1487,80.

TESTE 2
Insira o nome do funcionário: Carlos
Insira a quantidade de horas trabalhadas no mês: 84
Insira o numero de dependentes: 0
O funcionário Carlos possui um salário bruto de R$ 840,00 e um salário líquido de R$ 726,60.

TESTE 3
Insira o nome do funcionário: Jorge
Insira a quantidade de horas trabalhadas no mês: 220
Insira o numero de dependentes: 4
O funcionário Jorge possui um salário bruto de R$ 2200,00 e um salário líquido de R$ 2110,60.

*/