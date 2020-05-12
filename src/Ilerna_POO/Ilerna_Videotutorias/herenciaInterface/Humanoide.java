package Ilerna_POO.Ilerna_Videotutorias.herenciaInterface;

public abstract class Humanoide {
    private double altura;
    private double peso;

    public Humanoide() {
    }

    public Humanoide(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
