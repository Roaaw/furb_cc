package Unidade_4;

import java.math.RoundingMode;
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
        while (horaChegada > 24 || horaChegada < 0) {
            System.out.println("Insira um horario valido(00h a 24h):");
            horaChegada = sc.nextFloat();
        }
        System.out.print("Minuto Chegada: ");
        minChegada = sc.nextFloat();
        while (minChegada > 60 || minChegada < 0) {
            System.out.println("Insira um horario valido(0min a 60min):");
            minChegada = sc.nextFloat();
        }
        System.out.print("Hora Saida: ");
        horaSaida = sc.nextFloat();
        while (horaSaida > 24 || horaSaida < 0) {
            System.out.println("Insira um horario valido(00h a 24h):");
            horaSaida = sc.nextFloat();
        }
        System.out.print("Minuto Saida: ");
        minSaida = sc.nextFloat();
        while (minSaida > 60 || minSaida < 0) {
            System.out.println("Insira um horario valido(0min a 60min):");
            minSaida = sc.nextFloat();
        }        
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

        if (min <= 74){
            valorCobrado = valorHora;
        }else if(min > 74 && min <= 149){
            valorCobrado = (valorHora * hora);
        }else if(min > 149 && min <= 209 ){
            valorCobrado = (valorHora * (hora - 1f)) + 7.50f;
        }else if(min > 209 && min <= 239 ){
            valorCobrado = (valorHora * (hora - 2f)) + (7.50f * 2f);
        }else if (min > 239){
            valorCobrado = (valorHora * (hora - 2f)) + (7.50f * 2f) + 10f;
        }
    }
    private void saida(){
        df.setRoundingMode(RoundingMode.DOWN);
        //System.out.println(df.format(min));
        //System.out.printf("%s:%s\n",df.format(min / 60), df.format(min % 60));
        System.out.printf("Preço cobrado: R$%.2f",valorCobrado);
    }
    public static void main(String[] args) {
        new Uni4Exe27();
    }
}
/*
TESTE 1 

Hora Chegada: 13
Minuto Chegada: 10
Hora Saida: 13
Minuto Saida: 22
Preço cobrado: R$5,00
TESTE 2

Hora Chegada: 3
Minuto Chegada: 40
Hora Saida: 5
Minuto Saida: 15
Preço cobrado: R$10,00
TESTE 3

Hora Chegada: 8
Minuto Chegada: 5
Hora Saida: 12
Minuto Saida: 46
Preço cobrado: R$35,00
*/