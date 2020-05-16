package Ilerna_POO.Ilerna_Videotutorias.herenciaAbstracta.figuras;

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado= new Cuadrado(4);
        cuadrado.area();
        cuadrado.perimetro();

        Triangulo triangulo= new Triangulo (10,43,42);
        triangulo.area();
        triangulo.perimetro();
    }
}
