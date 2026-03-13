package Unidade_3;

public class Uni3Exe12 {
    private String nome;
    private float horasTrab;
    private float numDependentes;
    private final float valorHora = 10f;
    private final float valorDependente = 60f;
    private final float valorInss = 0.085f;
    private final float valorIcms = 0.05f;

    public Uni3Exe12(String nome, float horasTrab, float numDependentes){
        this.nome = nome;
        this.horasTrab = horasTrab;
        this.numDependentes = numDependentes;
    }

    public float calcSalario(float horasTrab){
        return horasTrab * valorHora;
    }
    public float calcDependetes(float numDependentes){
        return numDependentes * valorDependente;
    }
    public float descInss(float horasTrab, float numDependentes){
        return (calcSalario(horasTrab) + calcDependetes(numDependentes)) * valorInss;
    }
    public float descIcms(float horasTrab, float numDependentes){
        return (calcSalario(horasTrab) + calcDependetes(numDependentes)) * valorIcms;
    }
    public float salarioLiquido(float horasTrab, float numDependentes){
        return (calcSalario(horasTrab) + calcDependetes(numDependentes)) - descIcms(horasTrab, numDependentes) - descInss(horasTrab, numDependentes);
    }

    public static void main(String[] args) {
        Uni3Exe12 classExec = new Uni3Exe12(null, 0, 0);
        float result = classExec.calcSalario(160f);
        System.out.printf("Salario: %.2f%n", result);
        result = classExec.calcDependetes(2f);
        System.out.printf("Dependentes: %.2f%n", result);
        result = classExec.descIcms(160f, 2f);   
        System.out.printf("Icms: %.2f%n", result);
        result = classExec.descInss(160f, 2f);
        System.out.printf("Inss: %.2f%n", result);
        result = classExec.salarioLiquido(160f, 2f);
        System.out.printf("Liquido: %.2f%n", result);

        result = classExec.calcSalario(84f);
        System.out.printf("Salario: %.2f%n", result);
        result = classExec.calcDependetes(0f);
        System.out.printf("Dependentes: %.2f%n", result);
        result = classExec.descIcms(84f, 0f);   
        System.out.printf("Icms: %.2f%n", result);
        result = classExec.descInss(84f, 0f);
        System.out.printf("Inss: %.2f%n", result);
        result = classExec.salarioLiquido(84f, 0f);
        System.out.printf("Liquido: %.2f%n", result);
    }
}
