package Unidade_2;
import java.util.Scanner;

public class Uni2Exe13 {
    public static void main(String[] args) {
        int distancia,tempo,velCar;
        final int carroY = 90;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a velocidade do carro em Km/h: ");
        velCar = scan.nextInt();
        if (velCar > carroY){
            distancia = velCar - carroY;
            tempo = distancia * 2;
            System.out.printf("Tempo para carro Y se distanciar %s Km: %s minutos", distancia, tempo);
        }else{
            System.out.print("Velocidade inserida é superior a do carro Y, ele não vai conseguir se distanciar.");
        }
        scan.close();
    }
}
//x = distancia em km
//x*tempo
//minutos = x*tempo