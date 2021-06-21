package LibroJava.POO;
/*Cuando se define una variable de clase  (static) solo
existe una copia del atributo para toda la clase y no una para cada objeto. Esto es �til
cuando se quiere llevar la cuenta global de alg�n par�metro. Los m�todos de clase se
aplican a la clase y no a instancias concretas.

A continuaci�n se muestra un ejemplo que contiene la variable de clase (static) kilometrajeTotal.
Si bien cada coche tiene un atributo kilometraje donde se van acumulando los
kil�metros que va recorriendo, en la variable de clase (static) kilometrajeTotal se lleva la cuenta
de los kil�metros que han recorrido todos los coches que se han creado*/

import javax.xml.stream.events.DTD;

public class CoxeStatic {

    //atributo de clase que usaremos para llevar una cuenta total
    private static int kilometrajeTotal = 0;

    //m�todo de clase, cada variable static debe ser manipulada por un m�todo static
    public static int getKilometrajeTotal() { // para poder acceder a este m�todo desde el main de beremos ponerle el modificador de acceso public
        // si le metemos un private, solo podremos acceder a �l desde esta clase
        return kilometrajeTotal;
    }

    private String marca;
    private String modelo;
    private int kilometraje;
    private double motor;

    public CoxeStatic(String marca, String modelo, double motor) {
        this.marca = marca;
        this.modelo= modelo; // En la llamada a  este constructor se pedir�n todos los atributos para establecerlos
        this.motor=motor;    // Menos los kil�metros que se establecer� ndesde el m�todo recorre
        kilometraje=0;
    }

    public int getKilometraje(){
        return kilometraje;
    }

    public void recorre(int kilometraje){
        this.kilometraje+=kilometraje; // Con este m�todo estableceremos los kil�metros de cada coche en particular
        kilometrajeTotal+=kilometraje; // Y de todos los coches en general
    }

    @Override
    public String toString() {
        return
                " El coche marca: " + marca   +
                ", modelo: " + modelo   +
                ", tiene " + kilometraje +
                " kilometros y un motor " + motor;
    }
}
