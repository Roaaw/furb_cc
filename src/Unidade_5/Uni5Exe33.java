package Unidade_5;

public class Uni5Exe33 {
    public static void main(String[] args) {
        boolean exit = false;
        int voto = 0;
        int primeiro = 0;
        int segundo = 0;
        int terceiro = 0;
        int quarto = 0;
        int nulo = 0;
        int branco = 0;
        System.out.println("Menu de votação:\n1-Primeiro Candidato\n2-Segundo Candidato\n3-Terceiro Candidato\n4-Quarto Candidato\n5-Voto Nulo\n6-Voto Branco");
        do{
            switch (voto) {
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
    }
}
