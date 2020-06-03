package LibroJava.POO.Ejercicios;
/*¿Cuáles serían los atributos de la clase Vivienda?
¿Qué subclases se te ocurren?*/
public abstract class Vivienda_E3 {

    //Atributos
    private double metrosCuadrados;
    private int puertas;
    private int habitaciones;
    private int banios;
    private boolean climatizacion;
    private boolean garaje;


}

class piso_E3 extends Vivienda_E3{

    private String pisoPuerta;

}





class Chalet_E3 extends Vivienda_E3{

    private String tamanioPiscina;
    private String metrosDEJardin;

}


class Apartamento_E3 extends Vivienda_E3{

    private String playaCerca;

}


