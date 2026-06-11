package Unidade_6;

import java.util.Scanner;

public class Uni6Exe06 {
    private Scanner sc = new Scanner(System.in);
    private int tamanho;
    private double[][] vetor = new double[2][5];

    public Uni6Exe06(){

    }
    private void entrada(){
        System.out.print("Informe o tamanho : ");
        tamanho = sc.nextInt();
    }
    private void popularVetor(){
        for(int i = 0; i < tamanho; i++){
            System.out.printf("Informe um valor real: (%s)\n",i);
            vetor[0][i] = sc.nextDouble();
        }
    }
    private void checarValor(){
        System.out.print("Digite um valor para checar se existe dentro do vetor: ");
        vetor[1][0] = sc.nextDouble();
        for(int i = 0; i < tamanho; i++){
            if(vetor[1][0] == vetor[0][i]){
                System.out.println("Este numero esta contido no vetor.");
                break;
            }else if(i == tamanho -1 && vetor[1][0] != vetor[0][i]){
                System.out.println("Numero nao encontrado no vetor.");
            }
        }
    }
    public static void main(String[] args) {
        Uni6Exe06 init = new Uni6Exe06();
        init.entrada();
        init.popularVetor();
        init.checarValor();
    }
}
