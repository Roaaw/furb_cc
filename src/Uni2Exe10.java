import java.util.Scanner;

public class Uni2Exe10 {
    public static void main(String[] args) {
        int tempoSegundos,horas,minutos,segundos;
        Scanner scan = new Scanner(System.in);
        System.out.println("Tempo em Segundos: ");
        tempoSegundos = scan.nextInt();
        horas = tempoSegundos/3600;
        minutos = (tempoSegundos%3600) / 60;
        segundos = ((tempoSegundos%3600)%60);
        if (horas > 1 || minutos > 10 || segundos > 10){
            System.out.printf("H%s:%s:%s",horas,minutos,segundos);
        }else if (horas > 1 | minutos > 1 | segundos > 10)
            System.out.printf("H%s:%01d:%s",horas,minutos,segundos);
        // else if (horas < 1 || minutos > 1){
        //     System.out.printf("M%s:%s",minutos,segundos);
        // }
        // else if (horas < 1 || minutos < 1 || segundos > 1){
        //     System.out.printf("S%s",segundos);
        // }
    }
}
