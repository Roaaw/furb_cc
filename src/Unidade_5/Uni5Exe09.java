package Unidade_5;

import java.util.Scanner;

public class Uni5Exe09 {
    private Scanner sc = new Scanner(System.in);
    private int n = 0;
    private int vinteM = 0;
    private int dezoitoM = 0;
    private String listaNome = "";
    private String nome = "";
    private int idade = 0;

    public Uni5Exe09(){
        logic();
    }
    private void entrada_input(){
        System.out.print("Informe a quantidade de entradas: ");
        n = sc.nextInt();
    }
    private void aluno_input(){
        System.out.print("Digite o nome do aluno: ");
        nome = sc.next();
        sc.nextLine();
        System.out.print("Digite a idade do aluno: ");
        idade = sc.nextInt();//Integer.parseInt(sc.nextLine());
    }
    private void logic(){
        entrada_input();
        for(int i = 0; i < n; i++){
            aluno_input();
            if(idade == 18){
                dezoitoM++;
                if(listaNome == ""){
                    listaNome += nome;
                }else if(listaNome != ""){
                    listaNome += " "+nome;
                }
            }
            if(idade >= 20){
                vinteM++;
            }
        }
        if(dezoitoM <= 2){
            listaNome = listaNome.replace(" ", " e ");
        }else if(dezoitoM > 2){
            listaNome = listaNome.replace(" ", " , ");
        }
        output();
    }
    private void output(){
        System.out.println("Nomes dos alunos que tem 18 anos: "+listaNome);
        System.out.println("Quantidade de alunos que tem idade acima de 20 anos: "+vinteM);
    }
    public static void main(String[] args) {
        new Uni5Exe09();
    }
}