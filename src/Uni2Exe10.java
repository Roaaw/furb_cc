import java.util.Scanner;

public class Uni2Exe10 {
    public static void main(String[] args) {
        int tempoSegundos,horas,minutos,segundos;
        Scanner scan = new Scanner(System.in);
        System.out.print("Tempo em Segundos: ");
        tempoSegundos = scan.nextInt();
        horas = tempoSegundos / 3600;
        minutos = (tempoSegundos%3600) / 60;
        segundos = ((tempoSegundos%3600) % 60);
        if (horas < 10){
            System.out.printf("%02d",horas);
        }else{
            System.out.printf("%s",horas);
        }
        if (minutos < 10){
            System.out.printf(":%02d",minutos);
        }else{
            System.out.printf(":%s",minutos);
        }
        if (segundos < 10){
            System.out.printf(":%02d",segundos);
        }else{
            System.out.printf(":%s",segundos);
        }
        scan.close();
    }
}
