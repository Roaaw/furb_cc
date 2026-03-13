package Unidade_3;

public class Uni3Exe11 {
    private float tempCelsius;
    private float tempFahrenheit;
    
    public Uni3Exe11(float tempCelsius, float tempFahrenheit){
        this.tempCelsius = tempCelsius;
        this.tempFahrenheit = tempFahrenheit;
    }

    public float convert(float tempCelsius, float tempFahrenheit){
        return (1.8f * tempCelsius) + 32f;
    }

    public static void main(String[] args) {
        Uni3Exe11 classExec = new Uni3Exe11(0, 0);
        float result = classExec.convert(36, 0);
        System.out.printf("°F %.2f%n", result);
        result = classExec.convert(2, 0);
        System.out.printf("°F %.2f%n", result);
    }
}
