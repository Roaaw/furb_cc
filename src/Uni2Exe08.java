import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe08 {
    public static void main(String[] args) {
        int codPeca1,codPeca2;
        float valorPeca1 = 0;
        float valorPeca2 = 0;
        float soma = 0;
        float quantidade = 0;
        String peca1,peca2;
        codPeca1 = 100;
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");
        df.setRoundingMode(RoundingMode.DOWN);
        System.out.print("Digite o codigo da primeira peça: ");
        codPeca1 = scan.nextInt();
        System.out.print("Quantidade da primeira peça: ");
        quantidade = scan.nextFloat();
        if (codPeca1 == 100){
            peca1 = "Primeira Peça";
            valorPeca1 = 150.25f;
            valorPeca1 = valorPeca1 * quantidade;
            System.out.printf("Cod: %s%nNome: %s%nQuantidade: %sx peças%nValor: %.2f%n",codPeca1,peca1,df.format(quantidade),valorPeca1);
        }
        System.out.print("Digite o codigo da segunda peça: ");
        codPeca2 = scan.nextInt();
        System.out.print("Quantidade da segunda peça: ");
        quantidade = scan.nextFloat();
        if (codPeca2 == 200){
            peca2 = "Segunda Peça";
            valorPeca2 = 150.25f;
            valorPeca2 = valorPeca2 * quantidade;
            System.out.printf("Cod: %s%nNome: %s%nQuantidade: %sx peças%nValor: %.2f%n",codPeca2,peca2,df.format(quantidade),valorPeca2);
        }
        soma = valorPeca1 + valorPeca2;
        System.out.printf("Valor total: %.2f",soma);
        scan.close();
    }
}
