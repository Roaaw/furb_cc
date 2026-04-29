package Unidade_5;

public class OperadorTernario {
    public static void main(String[] args) {
        boolean maiorDeIdade = false;
        String resultado = (maiorDeIdade) ? "Sim" : "Não";
        System.out.println(resultado);
        int idade = 18;
        resultado = (idade >= 18) ? "Maior" : "Menor";
        System.out.println(resultado);
    }
}
