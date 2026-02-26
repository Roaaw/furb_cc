

public class MediaFinalIP {
    public static void main(String[] args) {
        float Prova1= 10f;
        float Prova2= 10f;
        float ProjetoFinal= 10f;
        float ExerciciosETrabalhos= (10f+10f+10f+10f+10f+10f+10f+10f)/8;
        float MediaFinal = (Prova1*0.20f)+(Prova2*0.30f)+(ProjetoFinal*0.30f)+(ExerciciosETrabalhos*0.20f);
        if (MediaFinal >= 7){
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }
        System.out.println("Média Final: "+MediaFinal);
    }

}
