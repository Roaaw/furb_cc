package Unidade_5;

import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a quantidade de entradas: ");
        int n = sc.nextInt();
        int vinteM = 0;
        String listaNome = "";
        for(int i=0; i<n; i++){
            System.out.print("Digite o nome do aluno: ");
            String nome = sc.next();
            System.out.print("Digite a idade do aluno: ");
            int idade = Integer.parseInt(sc.nextLine());
            if(idade == 18){
                if(listaNome == ""){
                    listaNome += nome;
                }else if(i == n-1){
                    listaNome += " e "+nome;
                }else{
                    listaNome += ", "+nome;
                }
            }
            if(idade >= 20){
                vinteM++;
            }
        }
        System.out.println("Nomes dos alunos que tem 18 anos: "+listaNome);
        System.out.println("Quantidade de alunos que tem idade acima de 20 anos: "+vinteM);
        sc.close();
    }
}