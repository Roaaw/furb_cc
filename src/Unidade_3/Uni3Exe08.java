package Unidade_3;

public class Uni3Exe08 {
    private final float dolarHoje = 5.65f;
    private float dolarCliente,result;

    public Uni3Exe08(float dolarCliente){
        this.dolarCliente = dolarCliente;
    }
    public float dolarToReal(float dolarCliente){
        return dolarCliente * dolarHoje;
    }
    public static void main(String[] args) {
        Uni3Exe08 classExec = new Uni3Exe08(0);
        System.out.printf("%.2f",classExec.dolarToReal(440));
    }
}
