package Unidade_2;
import java.util.Scanner;

public class Uni2Exe06 {
    public static void main(String[] args) {
        int funcionarioID;
        float horastrabalhadas, valorhora, salario;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o ID do Funcionario: ");
        funcionarioID = scan.nextInt();
        System.out.print("Digite as horas trabalhads: ");
        horastrabalhadas = scan.nextFloat();
        System.out.print("Digite o valor da hora trabalhada: ");
        valorhora = scan.nextFloat();
        salario = horastrabalhadas * valorhora;
        System.out.printf("Funcionario ID: %03d"+" Salario: %.2f", funcionarioID, salario);
        scan.close();
    }
}
