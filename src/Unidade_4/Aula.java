package Unidade_4;

public class Aula {
    public static void main(String[] args) {
        float media = 5;
        float frequencia = 73.8f;

        if(media >= 6 && frequencia >= 75 ){
            System.out.println("Aprovado");
        }else{
            if (media < 6 && frequencia < 75){
                System.out.println("Reprovado");
            }else{
                if(media >= 6 && frequencia < 75){
                    System.out.printf("Reprovado %nMotivo: Frequencia abaixo do necessario.");
                }
                if(media < 6 && frequencia >= 75){
                    System.out.printf("Reprovado %nMotivo: Nota abaixo da media.");
                }
            }
        }
    }
}
