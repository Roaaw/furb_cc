package Unidade_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Uni6Exe06Array {
    private Scanner sc = new Scanner(System.in);
    private int tamanho;
    // private double[][] vetor = new double[2][5];
    private Double valor;
    private ArrayList<Double> vetor = new ArrayList<>();

    public Uni6Exe06Array(){

    }
    private void entrada(){
        System.out.print("Informe o tamanho : ");
        tamanho = sc.nextInt();
    }
    private void popularVetor(){
        for(int i = 0; i < tamanho; i++){
            System.out.printf("Informe um valor real: (%s)\n",i);
            vetor.add(sc.nextDouble());
        }
    }
    private void checarValor(){
        System.out.print("Digite um valor para checar se existe dentro do vetor: ");
        valor = sc.nextDouble();
        for(int i = 0; i < tamanho; i++){
            if(vetor.get(i).equals(valor)){
                System.out.println("Este numero esta contido no vetor.");
                break;
            }else if(i == tamanho -1 && valor != vetor.get(i)){
                System.out.println("Numero nao encontrado no vetor.");
            }
        }
    }
    public static void main(String[] args) {
        Uni6Exe06Array init = new Uni6Exe06Array();
        init.entrada();
        init.popularVetor();
        init.checarValor();
    }
}
