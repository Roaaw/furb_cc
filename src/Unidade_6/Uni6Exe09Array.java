package Unidade_6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni6Exe09Array {
    private Scanner sc = new Scanner(System.in);
    private DecimalFormat df = new DecimalFormat("0.00");
    private int[] sexo;
    private double[] nota;
    private int[] idade;
    private int tamVetor;
    private int indiceVetor = 0;
    private int opcaoMenu = 0;
    private double[] media = new double[2];
    private int contador = 0;
    private int temp = Integer.MAX_VALUE;

    public Uni6Exe09Array(){
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
                    notaMediaH();
                    notaMJoven();
                    maiorMediaMCPlus();
                    break;
            
                default:
                    System.out.println("Escolha uma das opções abaixo.");
                    break;
            }
        } while (opcaoMenu != 0);
    }

    private void tamanhoVetor(){
        System.out.printf("Informe o tamanho do vetor: ");
        tamVetor = sc.nextInt();
        sexo = new int[tamVetor];
        nota = new double[tamVetor];
        idade = new int[tamVetor];
    }

    private void sexoCliente(){
        System.out.print("\n1-Feminino\n2-Masculino\nInforme o seu sexo: ");
        switch (sc.nextInt()) {
            case 1:
                sexo[indiceVetor] = 1;
                break;
            case 2:
                sexo[indiceVetor] = 2;
                break;
        
            default:
                System.out.println("Escolha uma das opções abaixo.");
                sexoCliente();
                break;
        }
    }
    private void idadeCliente(){
        System.out.print("\nInforme a sua idade: ");
        temp = sc.nextInt();
        if(temp > 0){
            idade[indiceVetor] = temp;
        }else{
            System.out.println("Idade invalida.");
            idadeCliente();
        }
    }
    private void notaCinema(){
        System.out.print("\nInforme nota dada ao cinema(0 a 10): ");
        temp = sc.nextInt();
        if(temp > 10 || temp < 0){
            System.out.println("Erro! Informe uma nota de 0 a 10");
            notaCinema();
        }else{
            nota[indiceVetor] = temp;
        }
        
    }
    private void pesquisaCinema(){
        sexoCliente();
        idadeCliente();
        notaCinema();
        indiceVetor++;
    }
    private void notaMedia(){
        for(int i = 0; i < indiceVetor; i++){
            media[0] += nota[i];
        }
        media[0] /= indiceVetor;
        System.out.println("Nota média do cinema: "+df.format(media[0]));
    }
    private void notaMediaH(){
        for(int i = 0; i < indiceVetor; i++){
            if (sexo[i] == 2){
                media[1] += nota[i];
                contador++;
            }
        }
        media[1] /= contador;
        System.out.println("Nota média dada apenas por homens: "+df.format(media[1]));
    }
    private void notaMJoven(){
        temp = Integer.MAX_VALUE;
        contador = -1;
        for(int i = 0; i < indiceVetor; i++){
            if(sexo[i] == 1){
                if (temp > idade[i]){
                    temp = idade[i];
                    contador++;
                }
            }
        }
        if(temp < 0){
            System.out.println("nenhuma mulher respondeu a votação.");
        }else{
            System.out.println("Mulher mais jovem tem "+idade[contador]+" nota foi de "+df.format(nota[contador]));
        }
    }
    private void maiorMediaMCPlus(){
        contador = 0;
        temp = 1;
        for(int i = 0; i < indiceVetor; i++){
            if(sexo[i] == 1 && idade[i] > 49 && nota[i] >= media[0]){
                contador++;
                temp = 0;
            }
        }
        if(temp == 1){
            System.out.println("Não existe mulheres 50 + que deram nota acima da média.");
        }else{
            System.out.println("Mulheres com 50 mais de anos que deram nota acima da média: "+contador);
        }
    }

    public static void main(String[] args) {
        new Uni6Exe09Array();
    }
}
