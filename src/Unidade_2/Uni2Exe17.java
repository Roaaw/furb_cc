package Unidade_2;
import java.util.Scanner;

public class Uni2Exe17 {
    public static void main(String[] args) {
        String nomefuncionario;
        float horaTrab, numDependentes,salarioBruto,salarioLiquido, calcInss, calcIr;
        final float valorDependente = 60f;
        final float valorHora = 10f;
        final float inss = 0.085f;
        final float ir = 0.05f;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nome do Funcionario: ");
        nomefuncionario = scan.nextLine();
        System.out.print("Horas Trabalhadas: ");
        horaTrab = scan.nextFloat();
        System.out.print("Número de Dependetes: ");
        numDependentes = scan.nextFloat();
        salarioBruto =  ((horaTrab * valorHora) + (valorDependente * numDependentes));
        calcInss = salarioBruto * inss;
        calcIr = salarioBruto * ir;
        salarioLiquido = salarioBruto - calcInss - calcIr;
        System.out.printf("O funcionario %s ira receber um salario bruto de %.2f descontos de INSS %.2f e IR %.2f, salario liquido %.2f",nomefuncionario,salarioBruto,calcInss,calcIr,salarioLiquido);
        scan.close();
    }
}