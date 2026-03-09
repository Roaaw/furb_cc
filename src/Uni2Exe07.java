import java.util.Scanner;

public class Uni2Exe07 {
 public static void main(String[] args) {
    String vendedor;
    float salario, vendas, comissao, salarioecomissao;
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite o nome do Vendedor:");
    vendedor = scan.nextLine();
    System.out.print("Qual o valor do sálario fixo: ");
    salario = scan.nextFloat();
    System.out.print("Valor das vendas efetuadas no mês em reais: ");
    vendas = scan.nextFloat();
    comissao = vendas*0.15f;
    salarioecomissao = salario+comissao;
    System.out.printf("Vendedor:%s"+" vai receber de comissão %.2f"+" Totalizando %.2f",vendedor,comissao,salarioecomissao);
    scan.close();
 }
}
