package Unidade_5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        boolean exit = true;
        float comissao = 0.30f;
        float totalVendas = 0;
        float salario = 0;
        char confirma;
        String nome;
        String text = "";
        int numeroProduto = 0;
        int unidade = 0;

        while (exit) {
            System.out.print("Nome: ");
            nome = sc.next();
            sc.nextLine();
            while (exit) {
                System.out.print("Quantidade de produtos: ");
                int n = sc.nextInt();
                System.out.print("Valor do produto: ");
                totalVendas += (sc.nextFloat() * n);
                System.out.print("Deseja cadastrar mais algum produto para o venderdor "+nome+" ? S(SIM)/N(NÃO): ");
                confirma = sc.next().toLowerCase().charAt(0);
                salario += totalVendas*comissao;
                numeroProduto++;
                unidade += n;
                if(confirma == 's'){
                    exit = true;
                }else if(confirma == 'n'){
                        exit = false;
                }
            }
            text += "Vendedor: "+nome+"\n   Quantidade de Produtos: "+unidade+"\n   Número de Produtos: "+numeroProduto+"\n   Total das Vendas: "+df.format(totalVendas)+"\n   Comissão: "+df.format((salario))+"\n";
            numeroProduto = 0;
            unidade = 0;
            System.out.println("Deseja digitar os dados de mais um vendedor? S(SIM)/N(NÃO): ");
            confirma = sc.next().toLowerCase().charAt(0);
            if(confirma == 's'){
                exit = true;
            }else if(confirma == 'n'){
                System.out.println(text);
                exit = false;
            }
        }
        sc.close();
    }
}
