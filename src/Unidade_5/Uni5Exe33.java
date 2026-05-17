package Unidade_5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) {
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double voto = 0;
        int primeiro = 0;
        int segundo = 0;
        int terceiro = 0;
        int quarto = 0;
        int nulo = 0;
        int branco = 0;
        String text = "";
        do{
            System.out.println("Menu de votação:\n1-Primeiro Candidato\n2-Segundo Candidato\n3-Terceiro Candidato\n4-Quarto Candidato\n5-Voto Nulo\n6-Voto Branco\n0-Encerrar\n");
            voto = sc.nextDouble();
            switch ((int)voto) {
                case 1:
                    primeiro++;
                    break;
                case 2:
                    segundo++;
                    break;
                case 3:
                    terceiro++;
                    break;
                case 4:
                    quarto++;
                    break;
                case 5:
                    nulo++;
                    break;
                case 6:
                    branco++;
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Opção incorreta.");
                    break;
            }
        }while(!exit);
        voto = (primeiro+segundo+terceiro+quarto+nulo+branco);
        if(voto == 0){
            System.out.println();
        }else{
            text += "Total de votos:\nPrimeiro candidato: "+primeiro+"\nSegundo candidato: "+segundo+"\nTerceiro candidato: "+terceiro+"\nQuarto candidato: "+quarto+"\nVotos nulo: "+nulo+"\nVotos em branco: "+branco+"\n";
            System.out.println(text);
            System.out.println("Percentual: ");
            System.out.println("Primeiro candidato: "+df.format((primeiro / voto) * 100)+"%");
            System.out.println("Segundo candidato: "+df.format((segundo / voto) * 100)+"%");
            System.out.println("Terceiro candidato: "+df.format((terceiro / voto) * 100)+"%");
            System.out.println("Quarto candidato:"+df.format((quarto / voto) * 100)+"%");
            System.out.println("Votos Nulos: "+df.format((nulo / voto) * 100)+"%");
            System.out.println("Votos Brancos: "+df.format((branco / voto) * 100)+"%");
        }
        sc.close();
    }
}
