package Unidade_3;

public class Uni3Exe01 {
    private int comprimento;
    private int largura;

    public Uni3Exe01(int comprimento, int largura){
        this.comprimento = comprimento;
        this.largura = largura;    
    }

    public int terreno(int comprimento, int largura){
        return (comprimento * largura);
    }
    public static void main(String[] args) {
        Uni3Exe01 terreno = new Uni3Exe01(0,0);
        int resultado = terreno.terreno(3,6);
        System.out.println("Terreno: "+resultado);
        resultado = terreno.terreno(2, 18);
        System.out.println("Terreno: "+resultado);
    }
}
