package Ilerna_POO.Ilerna_Videotutorias.herenciaAbstracta.figuras;

public class Triangulo extends Figura{
    private double base;
    private double altura;

    public Triangulo(double base, double altura,double lado){
        this.lados=3;
        this.longitudLado=new double[]{base,altura,lado};
        this.base=base;
        this.altura=altura;
    }

    public void perimetro(){
        perimetro("triangulo");
    }

    @Override
    public void area() {
        System.out.println("Area del triangualo: "+(base*altura)/2);
    }
}
