package Unidade_3;

public class Uni3Exe07 {
    private float lata350, garrafa600, garrafa2;

    public Uni3Exe07(float lata350, float garrafa600, float garrafa2){
        this.lata350 = lata350;
        this.garrafa600 = garrafa600;
        this.garrafa2 = garrafa2;
    }
    public float lata350(float lata350){
        return lata350 * 350;
    }
    public float garrafa600(float garrafa600){
        return garrafa600 * 600;
    }
    public float garrafa2(float garrafa2){
        return garrafa2 * 2000;
    }

    public static void main(String[] args) {
        Uni3Exe07 classExec = new Uni3Exe07(0, 0, 0);
        float result = (classExec.lata350(40) + classExec.garrafa600(34) + classExec.garrafa2(120)) / 1000;
        System.out.printf("O cliente comprou ao total %.2f litros.", result);
    }
}
