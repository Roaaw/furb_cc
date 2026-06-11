package Unidade_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Uni6Exe10Array {
    private Scanner sc = new Scanner(System.in);
    private int opcaoMenu;
    // private int[] vetor = new int[50];
    private ArrayList<Integer> vetor = new ArrayList<>();
    private int posVetor = 0;
    private int entrada = Integer.MIN_VALUE;
    private int indicePesquisa;


    public Uni6Exe10Array(){
        do {
            System.out.print("\nMenu\n1 - Incluir valor\n2 - Pesquisar valor\n3 - Alterar valor\n4 - Excluir valor\n5 - Mostrar valores\n6 - Ordenar valores\n7 - Inverter valores\n8 - Sair\nDigite a opção desejada: ");
            opcaoMenu = sc.nextInt();
            menu();
        } while (opcaoMenu != 8);
    }

    private void menu(){
        switch (opcaoMenu) {
            case 1:
                incluirValor();
                break;
            case 2:
                pesquisarValor();
                break;
            case 3:
                alterarValor();
                break;
            case 4:
                exluirValor();
                break;
            case 5:
                mostrarValores();
                break;
            case 6:
                ordenarValor();
                break;
            case 7:
                inverterValor();
                break;
            case 8:
                System.out.println("Encerrando programa . . .");
                break;
        
            default:
                System.out.println("Digite uma das opções abaixo:");
                break;
        }
    }

    private void incluirValor(){
        if(50 > vetor.size()){
            System.out.print("Informe o numero a ser incluido no vetor: ");
            vetor.add(sc.nextInt());
            System.out.println("O numero "+vetor.get(posVetor)+" foi inserido no vetor.");
            posVetor++;
        }else{
            System.out.println("Vetor está cheio!");
        }
    }
    private int pesquisarValor(){
        System.out.print("Informe o valor a ser pesquisado no vetor: ");   
        entrada = sc.nextInt();
        for(int i = 0; i < posVetor; i++){
            if(entrada == vetor.get(i)){
                if(opcaoMenu == 2){
                    System.out.println("O numero "+entrada+" esta na posição "+i+" do vetor.");
                }
                return i;
            }
        }
        System.out.println("Numero não encontrado.");
        return -1;
    }
    private void alterarValor(){
        indicePesquisa = pesquisarValor();
        if(indicePesquisa != -1){
            System.out.println("Informe o numero a ser substituido: ");
            entrada = sc.nextInt();
            vetor.set(indicePesquisa, entrada);
        }
    }
    private void exluirValor(){
        indicePesquisa = pesquisarValor();
        if(indicePesquisa != -1){
            for(int i = indicePesquisa; i < posVetor-1; i++){
                vetor.remove(i);
            }
            posVetor --;
        }

    }
    private void mostrarValores(){
        if(posVetor == 0 && vetor.get(posVetor) == 0){
            System.out.println("Não existe nada dentro do vetor.");
        }else{
            System.out.print("Os valores armazenados no vetor são: ");
            for(int i = 0; i < posVetor; i++){
                if(i > 0){
                    System.out.print(" , "+vetor.get(i));
                }else{
                    System.out.print(vetor.get(i));
                }
                if(i == (posVetor - 1)){
                    System.out.print(".");
                }
                
            }
        }
    }
    private void ordenarValor(){
        vetor.sort(null);
        // for(int i = 0 ; i < posVetor; i++){
        //     for(int j = 0; j < (posVetor - 1); j++){
        //         if(vetor[j] > vetor[i]){
        //             int temp = vetor[i];
        //             vetor[i] = vetor[j];
        //             vetor[j] = temp;
        //         }
        //     }
        // }

    }
    private void inverterValor(){
        for(int i = 0 ; i < posVetor; i++){
            for(int j = 0; j < i; j++){
                int temp = vetor.get(i);
                vetor.set(i, vetor.get(j));
                vetor.set(j, temp);
            }
        }
    }
    public static void main(String[] args) {
        new Uni6Exe10Array();
    }
}
