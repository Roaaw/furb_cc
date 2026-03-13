package Unidade_3;

public class Uni3Exe14 {
    private float distancia,tempo;
    private final float autonomia = 0.012f;

    public Uni3Exe14(float distancia, float tempo){
        this.distancia = distancia;
        this.tempo = tempo;
    }

    public float calcTempo(float distancia, float tempo){
        return (distancia / tempo);
    }
    public float calcAutonomia(float distancia){
        return (distancia / autonomia);
    }
    public static void main(String[] args) {
        Uni3Exe14 classExec = new Uni3Exe14(0, 0);
        float result = classExec.calcTempo(240f, 4f);
        System.out.println(result);
        result = classExec.calcAutonomia(240f);
        System.out.println(result);
        result = classExec.calcTempo(150f, 2f);
        System.out.println(result);
        result = classExec.calcAutonomia(150f);
        System.out.printf("%.2f", result);
    }
}
