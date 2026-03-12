package Unidade_1;


public class FiltroDeValores {
    public static void main(String[] args) {
        float Valor1 = 1000f;
        float Valor2 = 200f;
        float Valor3 = 30f;
        float ValorMenor = 0f;
        float ValorMedio = 0f;
        float ValorMaior = 0f;
            if (Valor1 <= Valor2 && Valor1 <= Valor3){
                ValorMenor = Valor1;
                System.out.println("a");
                if (Valor2 <= Valor3){
                    ValorMedio = Valor2;
                    ValorMaior = Valor3;
                }
                else {
                    ValorMedio = Valor3;
                    ValorMaior = Valor2;
                }
            }
            else if (Valor2 <= Valor1 && Valor2 <= Valor3){
                ValorMenor = Valor2;
                System.out.println("b");
                if (Valor1 <= Valor3){
                    ValorMedio = Valor1;
                    ValorMaior = Valor3;
                }
                else {
                    ValorMedio = Valor3;
                    ValorMaior = Valor1;
                }
            }
            else {
                ValorMenor = Valor3;
                System.out.println("c");
                if (Valor1 <= Valor2){
                    ValorMedio = Valor1;
                    ValorMaior = Valor2;
                }
                else {
                    ValorMedio = Valor2;
                    ValorMaior = Valor1;
                }
            }
        System.out.println("Valor Menor: "+ValorMenor);
        System.out.println("Valor Médio: "+ValorMedio);
        System.out.println("Valor Maior: "+ValorMaior);
    }
}
