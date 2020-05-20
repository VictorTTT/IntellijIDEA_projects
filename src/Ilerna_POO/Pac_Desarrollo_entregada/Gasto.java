package Ilerna_POO.Pac_Desarrollo_entregada;

public class Gasto extends Dinero {// Un gasto es dinero, por lo tanto hereda de �l

    public Gasto(double gasto, String description) {//constructor que inicializa los dos par�metros que recibe

        this.dinero = gasto;

        this.description = description;


    }

    @Override
    public String toString() {//m�todo que devuelve el contenido de los objetos creados por esta clase
        return "Gasto: "+description+", cantidad: "+dinero+" �";
    }
}
