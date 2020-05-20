package Ilerna_POO.Pac_Desarrollo_entregada;

public class Ingreso extends Dinero {// Un ingreso es dinero, por lo tanto hereda de él

    public  Ingreso(double ingreso, String description) {//constructor que inicializa los dos parámetros que recibe

        this.dinero=ingreso;

        this.description = description;


    }

    @Override
    public String toString() {//método que devuelve el contenido de los objetos creados por esta clase
        return "Ingreso: "+description+", cantidad: "+dinero+" €";
    }
}