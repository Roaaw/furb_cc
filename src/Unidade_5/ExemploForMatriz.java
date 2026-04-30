package Unidade_5;

public class ExemploForMatriz {
    public static void main(String[] args) {
        System.out.println(" _ _ _");
        for(int x=0; x<=2; x++){
            // System.out.println("Linha: "+x);
            // System.out.println("_");
            System.out.print("|");
            for(int y=0; y<=2; y++){
                // System.out.println("Coluna: "+y);
                System.out.print("_");
                System.out.print("|");
            }
            System.out.println();
        }
    }
}
