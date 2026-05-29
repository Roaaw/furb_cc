package Unidade_5;

public class Uni5Exe25 {
    private int d = 0;
    private int e = 0;
    private String placar = "";
    private boolean jogo = true;

    public Uni5Exe25(){
        logica();
    }
    private void logica(){
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
            imprimir();
        }
    }
    private void imprimir(){
        System.out.println(placar);
    }
    public static void main(String[] args) {
        new Uni5Exe25();
    //     int d = 0;
    //     int e = 0;
    //     String placar = "";
    //     boolean jogo = true;
    //     while(jogo){
    //         placar = "         PLACAR\nEsquerda "+e+" - "+d+" Direita";
    //         if((int)(Math.random() * (10 - 0) + 1) % 2 == 0){
    //             d++;
    //         }else{
    //             e++;
    //         }
    //         placar = "         PLACAR\nEsquerda "+e+" - "+d+" Direita";
    //         if(d >= 21 && d - e >= 2 || e >= 21 && e - d >= 2){
    //             jogo = false;
    //             if(d >= 21 && d - e >= 2){
    //                 placar += "\n       Direita Ganhou";
    //             }else if(e >= 21 && e - d >= 2){
    //                 placar += "\n       Esquerda Ganhou";
    //             }
    //         }
    //         System.out.println(placar);
    //     }
    }
}