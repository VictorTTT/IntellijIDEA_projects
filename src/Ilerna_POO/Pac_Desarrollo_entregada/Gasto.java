package Ilerna_POO.Pac_Desarrollo_entregada;

public class Gasto extends Dinero {// Un gasto es dinero, por lo tanto hereda de él

    public Gasto(double gasto, String description) {//constructor que inicializa los dos parámetros que recibe

        this.dinero = gasto;

        this.description = description;


    }

    @Override
    public String toString() {//método que devuelve el contenido de los objetos creados por esta clase
        return "Gasto: "+description+", cantidad: "+dinero+" €";
    }
}
