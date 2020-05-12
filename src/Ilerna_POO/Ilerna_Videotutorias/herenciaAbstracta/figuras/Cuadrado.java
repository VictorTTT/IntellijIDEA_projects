package Ilerna_POO.Ilerna_Videotutorias.herenciaAbstracta.figuras;

public class Cuadrado extends Figura {
    private double lado;
    public Cuadrado(double lado){
        this.lado=lado;
        this.lados=4;
        this.longitudLado=new double[]{lado,lado,lado,lado};
    }

    @Override
    public void area() {
        System.out.println("El area del cuadrado: "+(lado*lado));
    }

    @Override
    public void perimetro() {
        perimetro("cuadrado");
    }
}
