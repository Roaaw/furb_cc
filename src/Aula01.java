import java.util.Scanner;

public class Aula01 {
    public static void main(String[] args) {
        System.out.println("Aula 01");
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a Nota1: ");
        float nota1 = scan.nextInt();
        System.out.println("Digite a Nota2: ");
        float nota2 = scan.nextInt();
        System.out.println("Digite a Nota3: ");
        float nota3 = scan.nextInt();
        float soma = nota1+nota2+nota3;
        float media = soma / 3;
        System.out.println("Total: "+soma);
        System.out.println("Média: "+media);
        scan.close();
    }
}
