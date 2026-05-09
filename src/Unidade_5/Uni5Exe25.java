package Unidade_5;

public class Uni5Exe25 {
    public static void main(String[] args) {
        int d = 0;
        int e = 0;
        String placar = "";
        boolean jogo = true;
        while(jogo){
            placar = "         PLACAR\nEsquerda "+e+" - "+d+" Direita";
            if((int)(Math.random() * (10 - 0) + 1) % 2 == 0){
                d++;
            }else{
                e++;
            }
            placar = "         PLACAR\nEsquerda "+e+" - "+d+" Direita";
            if(d >= 21 && d - e >= 2 || e >= 21 && e - d >= 2){
                jogo = false;
                if(d >= 21 && d - e >= 2){
                    placar += "\n       Direita Ganhou";
                }else if(e >= 21 && e - d >= 2){
                    placar += "\n       Esquerda Ganhou";
                }
            }
            System.out.println(placar);
        }
    }
}