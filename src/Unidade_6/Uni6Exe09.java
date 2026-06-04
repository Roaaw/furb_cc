package Unidade_6;

import java.util.Scanner;

public class Uni6Exe09 {
    private Scanner sc = new Scanner(System.in);
    private int[] sexo;
    private double[] nota;
    private int[] idade;
    private int tamVetor;
    private int indiceVetor = 0;
    private int opcaoMenu = 0;
    private double media = 0;
    private int contador = 0;
    private int temp = 0;

    public Uni6Exe09(){
        tamanhoVetor();
        do {
            System.out.print("\n1-Iniciar pesquisa\n0-Sair\nEscolha uma opção: ");
            opcaoMenu = sc.nextInt();
            switch (opcaoMenu) {
                case 1:
                    pesquisaCinema();
                    break;
                case 0:
                    System.out.println("Encerrando programa . . .");
                    notaMedia();
                    break;
            
                default:
                    System.out.println("Escolha uma das opções abaixo.");
                    break;
            }
        } while (opcaoMenu != 0);
    }

    private void tamanhoVetor(){
        System.out.println("");
        tamVetor = sc.nextInt();
        sexo = new int[tamVetor];
        nota = new double[tamVetor];
        idade = new int[tamVetor];
    }

    private void sexoCliente(){
        System.out.print("\n1-Feminino\n2-Masculino\nInforme o seu sexo: ");
        sexo[indiceVetor] = sc.nextInt();
    }
    private void idadeCliente(){
        System.out.print("\nInforme a sua idade: ");
        idade[indiceVetor] = sc.nextInt();
    }
    private void notaCinema(){
        System.out.print("\nInforme nota dada ao cinema: ");
        nota[indiceVetor] = sc.nextInt();
    }
    private void pesquisaCinema(){
        sexoCliente();
        idadeCliente();
        notaCinema();
        indiceVetor++;
    }
    private void notaMedia(){
        for(int i = 0; i < indiceVetor; i++){
            media += nota[i];
        }
        media /= indiceVetor;
        System.out.println("Nota média do cinema: "+media);
    }
    private void notaMediaH(){
        media = 0;
        for(int i = 0; i < indiceVetor; i++){
            if (sexo[i] == '2'){
                media += nota[i];
                contador++;
            }
        }
        media /= contador;
    }
    private void notaMJoven(){
        for(int i = 0; i < indiceVetor; i++){
            
        }
    }

    public static void main(String[] args) {
        new Uni6Exe09();
    }
}
