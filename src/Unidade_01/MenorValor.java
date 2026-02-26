package Unidade_01;

public class MenorValor {
    public static void main(String[] args) {
        float Valor1 = 100f;
        float Valor2 = 100f;
        float Valor3 = 100f;
        float ValorMenor = 0f;
            if (Valor1 <= Valor2 && Valor1 <= Valor3){
                ValorMenor = Valor1;
                System.out.println("a");
            }
            else if (Valor2 <= Valor1 && Valor2 <= Valor3){
                ValorMenor = Valor2;
                System.out.println("b");
            }
            else {
                ValorMenor = Valor3;
                System.out.println("c");
            }
        System.out.println("Valor Menor: "+ValorMenor);
        }
    }

