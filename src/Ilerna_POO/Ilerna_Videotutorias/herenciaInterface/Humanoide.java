package Ilerna_POO.Ilerna_Videotutorias.herenciaInterface;

public abstract class Humanoide { //  classe abstracta, no queremos crear ningún objeto de ella
    //pero sí lo haremos de las clases que hereden de ella, estas podrán acceder a sus atributos y comportamientos
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
