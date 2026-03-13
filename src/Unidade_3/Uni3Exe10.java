package Unidade_3;

public class Uni3Exe10 {
    private double cateto1;
    private double cateto2;
    private double hipotenusa;

    public Uni3Exe10(double hipotenusa, double cateto1, double cateto2){
        this.hipotenusa = hipotenusa;
        this.cateto1 = cateto1;
        this.cateto2 = cateto2; 
    }

    public double hipotenusa(double cateto1, double cateto2){
        return hipotenusa = Math.hypot(cateto1, cateto2);
    }

    public static void main(String[] args) {
        Uni3Exe10 classExec = new Uni3Exe10(0, 0, 0);
        double result = classExec.hipotenusa(3, 4);
        System.out.println(result);
        result = classExec.hipotenusa(5, 12);
        System.out.println(result);
    }
}
