package Unidade_4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe27 {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("00");
    private float horaChegada, minChegada, hora, horaSaida, minSaida, min, valorCobrado;
    private float valorHora = 5.00f;

    public Uni4Exe27(){
        escolha();
        logica();
        saida();
    }
    
    private void escolha(){
        System.out.print("Hora Chegada: ");
        horaChegada = sc.nextFloat();
        System.out.print("Minuto Chegada: ");
        minChegada = sc.nextFloat();
        System.out.print("Hora Saida: ");
        horaSaida = sc.nextFloat();
        System.out.print("Minuto Saida: ");
        minSaida = sc.nextFloat();
    }
    private void logica(){
        if(horaSaida > horaChegada){
            hora = horaSaida - horaChegada;
        }else{
            hora = horaChegada - horaSaida;
        }
        if(minSaida > minChegada){
            min = (hora * 60) + (minSaida - minChegada);
        }else{
            min = (hora * 60) + (minChegada - minSaida);
        }
        
        if (min <= 75){
            valorCobrado = valorHora;
        }else if(min > 75 && min <= 240){
            valorCobrado = valorHora + (valorHora * hora);
        }else if (min > 240){
            valorCobrado = valorHora + (valorHora * hora) + (valorHora * 2f);
        }
    }
    private void saida(){
        System.out.println(df.format(min));
        System.out.printf("%s:%s\n",df.format(min / 60), df.format(min % 60));
        System.out.println(valorCobrado);
    }
    public static void main(String[] args) {
        new Uni4Exe27();
    }
}
