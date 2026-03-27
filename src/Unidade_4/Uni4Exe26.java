package Unidade_4;

import java.util.Scanner;

public class Uni4Exe26 {
    Scanner sc = new Scanner(System.in);
    private char opcao;
    private float numero1, numero2;

    public Uni4Exe26(){
        escolha();
        saida();
    }
    private void escolha(){
        System.out.print("T-Calcular área de um triângulo\n"+"Q-Calcular área de um quadrado\n"+"R-Calcular a área de retângulo\n"+"C-Calcular a área de um circulo\n"+"Escolha uma opção: ");
        opcao = sc.next().toUpperCase().charAt(0);
    }
    private void saida(){
        switch (opcao) {
            case 'T':
                System.out.print("Digite a base e a altura do triângulo: ");
                numero1 = sc.nextFloat();
                numero2 = sc.nextFloat();
                System.out.print("Área do triângulo : "+ (numero1 * numero2) / 2);
                break;
            case 'Q':
                System.out.print("Digite o lado: ");
                numero1 = sc.nextFloat();
                System.out.print("Área do quadrado : "+ numero1 * numero1 );
                break;
            case 'R':
                System.out.print("Digite a base e a altura do retângulo: ");
                numero1 = sc.nextFloat();
                numero2 = sc.nextFloat();
                System.out.print("Áreal do retângulo : "+ numero1 * numero2);
                break;
            case 'C':
                System.out.print("Digite o raio: ");
                numero1 = sc.nextFloat();
                numero2 = (float)Math.PI * (float)Math.pow(numero1, 2);
                System.out.printf("Área do criculo: %.2f ", numero2);
                break;
        
            default:
                break;
        }
    }
    public static void main(String[] args) {
        new Uni4Exe26();
    }
}
/*
TESTE 1

T-Calcular área de um triângulo
Q-Calcular área de um quadrado
R-Calcular a área de retângulo
C-Calcular a área de um circulo
Escolha uma opção: t
Digite a base e a altura do triângulo: 5
2
Área do triângulo : 5.0
TESTE 2

T-Calcular área de um triângulo
Q-Calcular área de um quadrado
R-Calcular a área de retângulo
C-Calcular a área de um circulo
Escolha uma opção: q
Digite o lado: 8
Área do quadrado : 64.0
TESTE 3
T-Calcular área de um triângulo
Q-Calcular área de um quadrado
R-Calcular a área de retângulo
C-Calcular a área de um circulo
Escolha uma opção: r
Digite a base e a altura do retângulo: 12
4
Áreal do retângulo : 48.0

TESTE 4

T-Calcular área de um triângulo
Q-Calcular área de um quadrado
R-Calcular a área de retângulo
C-Calcular a área de um circulo
Escolha uma opção: c
Digite o raio: 3
Área do criculo: 28,27 */