package Unidade_1;
import java.text.DecimalFormat;
import java.util.Scanner;
public class MediaFinalIP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int Options = 0;
        while (Options == 0 || Options > 7) {
            System.out.printf("Menu:%n 1- Arquitetura de Computadores%n 2- Fundamentos Matemáticos%n 3- Introdução à Computação%n 4- Introdução à Programação%n 5- Universidade Ciência e Pesquisa%n 6- Diversidade e Sociedade%n 7- Sair%n");
            Options = scan.nextInt();
            if (Options == 1){
                System.out.println("Arquitetura de Computadores");
                float Trabalho1 = 0f;
                float Trabalho2 = 0f;
                float Trabalho3 = 0f;
                float Trabalho4 = 0f;
                System.out.print("Digite a Nota do Trabalho 1:");
                Trabalho1 = scan.nextFloat();
                System.out.print("Digite a Nota do Trabalho 2:");
                Trabalho2 = scan.nextFloat();
                System.out.print("Digite a Nota do Trabalho 3:");
                Trabalho3 = scan.nextFloat();
                System.out.print("Digite a Nota do Trabalho 4:");
                Trabalho4 = scan.nextFloat();
                float MediaFinal = (Trabalho1*.20f + Trabalho2*.20f + Trabalho3*.20f + Trabalho4*.40f);
                System.out.println("Média Final: "+ df.format(MediaFinal));
                if (MediaFinal >= 6){
                    System.out.println("Aprovado");
                }
                else {
                    System.out.println("Reprovado");
                }
            }
            else if (Options == 2){
                System.out.println("Fundamentos Matemáticos");
                float Prova1 = 0f;
                float Prova2 = 0f;
                float Prova3 = 0f;
                System.out.print("Digite a Nota da Prova 1:");
                Prova1 = scan.nextFloat();
                System.out.print("Digite a Nota da Prova 2:");
                Prova2 = scan.nextFloat();
                System.out.print("Digite a Nota da Prova 3:");
                Prova3 = scan.nextFloat();
                float MediaFinal = (Prova1 + Prova2 + Prova3)/3;
                System.out.println("Média Final: "+ df.format(MediaFinal));
                if (MediaFinal >= 6){
                    System.out.println("Aprovado");
                }
                else {
                    System.out.println("Reprovado");
                }
            }
            else if (Options == 3){
                System.out.println("Introdução à Computação");
                float Relatorio1 = 0f;
                float Relatorio2 = 0f;
                float Relatorio3 = 0f;
                float LinhadoTempo = 0f;
                float Infograficos = 0f;
                float Engajamento = 0f;
                System.out.print("Digite a Nota do Relatório 1:");
                Relatorio1 = scan.nextFloat();
                System.out.print("Digite a Nota do Relatório 2:");
                Relatorio2 = scan.nextFloat();
                System.out.print("Digite a Nota do Relatório 3:");
                Relatorio3 = scan.nextFloat();
                System.out.print("Digite a Nota do Linha do Tempo:");
                LinhadoTempo = scan.nextFloat();
                System.out.print("Digite a Nota do Infográficos:");
                Infograficos = scan.nextFloat();
                System.out.print("Digite a Nota do Engajamento:");
                Engajamento = scan.nextFloat();
                float MediaFinal = (Relatorio1 + Relatorio2 + Relatorio3 + LinhadoTempo + Infograficos + Engajamento)/6;
                System.out.println("Média Final: "+ df.format(MediaFinal));
                if (MediaFinal >= 6){
                    System.out.println("Aprovado");
                }
                else {
                    System.out.println("Reprovado");
                }
            }
            else if (Options == 4){
                System.out.println("Introdução à Programação");
                float Prova1= 0f;
                float Prova2= 0f;
                float ProjetoFinal= 0f;
                float Trab1 = 0f;
                float Trab2 = 0f;
                float Trab3 = 0f;
                float Trab4 = 0f;
                float Trab5 = 0f;
                float Trab6 = 0f;
                float Trab7 = 0f;
                System.out.print("Prova 1");
                Prova1 = scan.nextFloat();
                System.out.print("Prova 2");
                Prova2 = scan.nextFloat();
                System.out.print("Projeto Final");
                ProjetoFinal = scan.nextFloat();
                System.out.print("Trabalho 1");
                Trab1 = scan.nextFloat();
                System.out.print("Trabalho 2");
                Trab2 = scan.nextFloat();
                System.out.print("Trabalho 3");
                Trab3 = scan.nextFloat();
                System.out.print("Trabalho 4");
                Trab4 = scan.nextFloat();
                System.out.print("Trabalho 5");
                Trab5 = scan.nextFloat();
                System.out.print("Trabalho 6");
                Trab6 = scan.nextFloat();
                System.out.print("Trabalho 7");
                Trab7 = scan.nextFloat();
                float MedTrab = (Trab1 + Trab2 + Trab3 + Trab4 + Trab5 + Trab6 + Trab7)/7;

                float MediaFinal = (Prova1*0.20f)+(Prova2*0.30f)+(ProjetoFinal*0.30f)+(MedTrab*0.20f);
                System.out.println("Média Final: "+ df.format(MediaFinal));
                if (MediaFinal >= 6){
                    System.out.println("Aprovado");
                }
                else {
                    System.out.println("Reprovado");
                }
            }
            else if (Options == 5){
                System.out.println("Universidade Ciência e Pesquisa");
                float TextoEscrito1 = 0f;
                float TextoEscrito2 = 0f;
                float ProjetoDePesquisa = 0f;
                float ArtigoCientifico = 0f;
                System.out.print("Digite a Nota do Texto Escrito 1:");
                TextoEscrito1 = scan.nextFloat();
                System.out.print("Digite a Nota do Texto Escrito 2:");
                TextoEscrito2 = scan.nextFloat();
                System.out.print("Digite a Nota do Projeto de Pesquisa:");
                ProjetoDePesquisa = scan.nextFloat();
                System.out.print("Digite a Nota do Artigo Científico:");
                ArtigoCientifico = scan.nextFloat();
                float MediaFinal = (TextoEscrito1*0.15f + TextoEscrito2*0.15f + ProjetoDePesquisa*0.19f + ArtigoCientifico*0.51f);
                System.out.println("Média Final: "+ df.format(MediaFinal));
                if (MediaFinal >= 6){
                    System.out.println("Aprovado");
                }
                else {
                    System.out.println("Reprovado");
                }
            }
            else if (Options == 6){
                System.out.println("Diversidade e Sociedade");
                float Avaliacao1 = 0f;
                float Avaliacao2 = 0f;
                float Avaliacao3 = 0f;
                float Avaliacao4 = 0f;
                System.out.print("Digite a Nota da Avaliação 1:");
                Avaliacao1 = scan.nextFloat();
                System.out.print("Digite a Nota da Avaliação 2:");
                Avaliacao2 = scan.nextFloat();
                System.out.print("Digite a Nota da Avaliação 3:");
                Avaliacao3 = scan.nextFloat();
                System.out.print("Digite a Nota da Avaliação 4:");
                Avaliacao4 = scan.nextFloat();
                float MediaFinal = (Avaliacao1*0.15f + Avaliacao2*0.15f + Avaliacao3*0.15f + Avaliacao4*0.55f);
                System.out.println("Média Final: "+ df.format(MediaFinal));
                if (MediaFinal >= 6){
                    System.out.println("Aprovado");
                }
                else {
                    System.out.println("Reprovado");
                }
            }
            else if (Options == 7){
                System.out.println("Programa Encerrado.");
            }
            Options = 8;
        }
        scan.close();
    }
    
}

// float Prova1= 0f;
        // float Prova2= 0f;
        // float ProjetoFinal= 0f;
        // float Trab1 = 0f;
        // float Trab2 = 0f;
        // float Trab3 = 0f;
        // float Trab4 = 0f;
        // float Trab5 = 0f;
        // float Trab6 = 0f;
        // float Trab7 = 0f;
        // System.out.println("Prova 1");
        // Prova1 = scan.nextFloat();
        // System.out.println("Prova 2");
        // Prova2 = scan.nextFloat();
        // System.out.println("Projeto Final");
        // ProjetoFinal = scan.nextFloat();
        // System.out.println("Trabalho 1");
        // Trab1 = scan.nextFloat();
        // System.out.println("Trabalho 2");
        // Trab2 = scan.nextFloat();
        // System.out.println("Trabalho 3");
        // Trab3 = scan.nextFloat();
        // System.out.println("Trabalho 4");
        // Trab4 = scan.nextFloat();
        // System.out.println("Trabalho 5");
        // Trab5 = scan.nextFloat();
        // System.out.println("Trabalho 6");
        // Trab6 = scan.nextFloat();
        // System.out.println("Trabalho 7");
        // Trab7 = scan.nextFloat();

        // float MedTrab = (Trab1 + Trab2 + Trab3 + Trab4 + Trab5 + Trab6 + Trab7)/7;

        // float MediaFinal = (Prova1*0.20f)+(Prova2*0.30f)+(ProjetoFinal*0.30f)+(MedTrab*0.20f);
        
        // DecimalFormat df = new DecimalFormat("0.00");

        // if (MediaFinal >= 6){
        //     System.out.println("Aprovado");
        // }
        // else {
        //     System.out.println("Reprovado");
        // }
        // System.out.println("Média Final: "+MediaFinal);
        // System.out.printf("Média Final: %.2f%n", MediaFinal);
        // System.out.println("Média Final: "+ df.format(MediaFinal));
