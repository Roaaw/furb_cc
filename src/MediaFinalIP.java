import java.text.DecimalFormat;
import java.util.Scanner;
public class MediaFinalIP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
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
        System.out.println("Prova 1");
        Prova1 = scan.nextFloat();
        System.out.println("Prova 2");
        Prova2 = scan.nextFloat();
        System.out.println("Projeto Final");
        ProjetoFinal = scan.nextFloat();
        System.out.println("Trabalho 1");
        Trab1 = scan.nextFloat();
        System.out.println("Trabalho 2");
        Trab2 = scan.nextFloat();
        System.out.println("Trabalho 3");
        Trab3 = scan.nextFloat();
        System.out.println("Trabalho 4");
        Trab4 = scan.nextFloat();
        System.out.println("Trabalho 5");
        Trab5 = scan.nextFloat();
        System.out.println("Trabalho 6");
        Trab6 = scan.nextFloat();
        System.out.println("Trabalho 7");
        Trab7 = scan.nextFloat();

        float MedTrab = (Trab1 + Trab2 + Trab3 + Trab4 + Trab5 + Trab6 + Trab7)/7;

        float MediaFinal = (Prova1*0.20f)+(Prova2*0.30f)+(ProjetoFinal*0.30f)+(MedTrab*0.20f);
        
        DecimalFormat df = new DecimalFormat("0.00");

        if (MediaFinal >= 6){
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }
        System.out.println("Média Final: "+MediaFinal);
        System.out.printf("Média Final: %.2f%n", MediaFinal);
        System.out.println("Média Final: "+ df.format(MediaFinal));
        scan.close();
    }
    
}
