package Ilerna_POO.Ilerna_Videotutorias.herenciaAbstracta.figuras;

public abstract class Figura {
    protected int lados;
    protected double longitudLado[];

    public abstract void area();
    public abstract void perimetro();
    protected final void perimetro(String nombreFigura){
        double total=0;
        for(int i=0;i<longitudLado.length;i++){
            total+=longitudLado[i];
        }
        System.out.println("Perimetro de la figura "+nombreFigura+":"+total);
    }

}
