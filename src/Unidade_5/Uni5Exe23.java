package Unidade_5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe23 {
    private Scanner sc = new Scanner(System.in);
    private DecimalFormat df = new DecimalFormat("0.00");
    private boolean exit = true;
    private float comissao = 0.30f;
    private float totalVendas = 0;
    private float salario = 0;
    private char confirma;
    private String nome;
    private String text = "";
    private int numeroProduto = 0;
    private int unidade = 0;

    public Uni5Exe23(){
        logica();
    }

    private void entrada(){
        System.out.print("Nome: ");
        nome = sc.next();
        sc.nextLine();
    }
    private void logica(){
        while (exit) {
            entrada();
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
           imprimir();
        }
    }

    private void imprimir(){
        if(confirma == 's'){
                exit = true;
            }else if(confirma == 'n'){
                System.out.println(text);
                exit = false;
            }
    }
    public static void main(String[] args) {
        new Uni5Exe23();
        // Scanner sc = new Scanner(System.in);
        // DecimalFormat df = new DecimalFormat("0.00");
        // boolean exit = true;
        // float comissao = 0.30f;
        // float totalVendas = 0;
        // float salario = 0;
        // char confirma;
        // String nome;
        // String text = "";
        // int numeroProduto = 0;
        // int unidade = 0;

        // while (exit) {
        //     System.out.print("Nome: ");
        //     nome = sc.next();
        //     sc.nextLine();
        //     while (exit) {
        //         System.out.print("Quantidade de produtos: ");
        //         int n = sc.nextInt();
        //         System.out.print("Valor do produto: ");
        //         totalVendas += (sc.nextFloat() * n);
        //         System.out.print("Deseja cadastrar mais algum produto para o venderdor "+nome+" ? S(SIM)/N(NÃO): ");
        //         confirma = sc.next().toLowerCase().charAt(0);
        //         salario += totalVendas*comissao;
        //         numeroProduto++;
        //         unidade += n;
        //         if(confirma == 's'){
        //             exit = true;
        //         }else if(confirma == 'n'){
        //                 exit = false;
        //         }
        //     }
        //     text += "Vendedor: "+nome+"\n   Quantidade de Produtos: "+unidade+"\n   Número de Produtos: "+numeroProduto+"\n   Total das Vendas: "+df.format(totalVendas)+"\n   Comissão: "+df.format((salario))+"\n";
        //     numeroProduto = 0;
        //     unidade = 0;
        //     System.out.println("Deseja digitar os dados de mais um vendedor? S(SIM)/N(NÃO): ");
        //     confirma = sc.next().toLowerCase().charAt(0);
        //     if(confirma == 's'){
        //         exit = true;
        //     }else if(confirma == 'n'){
        //         System.out.println(text);
        //         exit = false;
        //     }
        // }
        // sc.close();
    }
}
