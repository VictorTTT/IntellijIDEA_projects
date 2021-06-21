package LibroJava.POO;

/**
 * The type Cubo.
 */
public class Cubo {

    // atributos

    double capacidad; // esta ser� la capacidad m�xima que podr� almacenar
    double contenido; // este es el contenido actual en litros que tiene el cubo

    //constructor

    Cubo(double capacidad) {
        this.capacidad = capacidad;
    }

    //Getters

    public double getCapacidad() {
        return this.capacidad;
    }

    public double getContenido() {
        return this.contenido;
    }

    //Setters

    public void setContenido(double litros) {
        this.contenido = litros;
    }

    //Comportamientos adicionales (M�todos que dise�a el programador)

    public void vacia() {  // lo deja seco
        this.contenido = 0;
    }

    public void llena() { // llena el cubo al m�ximo de su capacidad
        this.contenido = this.capacidad;
    }

    /*Pinta el cubo en la pantalla.
     Se muestran los bordes del cubo con el car�cter # y el
     agua que contiene con el car�cter ~.*/

    /**
     * Voy a ver si me aclaro a explicar lo que hace este m�todo: En el for declara una variable iterativa (nivel)
     * y la iguala a la capacidad que se le ha pasado por par�meto en la declaaci�n del objeto; Hasta que el nivel llegue  0
     * decementa la variable en 1.
     *
     *
     *     En cada vuelta de bucle eval�a si el contenido es mayor � igual a la capacidd m�xima y si es as� lo pinta como
     *     que tiene agua en ese nivel pasando a evaluar de nuevo la condici�n del for.
     *
     *     Si no es as�, lo pinta como que no tiene agua en ese nivel, y pasa a evaluar de nuevo el for.
     *
     *     En tdos los casos, el cubo tendr� una base de s�mbolos completa.
     *
     */
    public void pinta() {
        for (double nivel = this.capacidad; nivel > 0; nivel--) {
            if (this.contenido >= nivel) {
                System.out.println("#~~~~#");
            } else {
                System.out.println("#    #");
            }
        }
        System.out.println("######");
    }

    /*Vuelca el contenido de un cubo sobre otro.
     * Antes de echar el agua se comprueba cu�nto le cabe al
     * cubo destino.*/

    /**
     * En este m�todo, se declara una variable local que tiene como valor la diferencia entre la capacidad total que
     * tiene el cubo de destino y el contenido que tiene actualmente, obteniendo as� lo que se le puede a�adir.
     *
     * Si los litros libres son m�s que 0, entonces, si el contenido del cubo que vierte es menor o igual que los litros
     * libres que tiene el cubo de destino. Se establece el contenido del cubo de destino con la suma de lo que tiene
     * este cubo "this.contenido" y lo que ya ten�a �l "destino.getContenido()".
     * Por �ltimo antes de acabar el if llamamos al m�todo vacia y lo aplicamos en este cubo, dej�ndolo seco
     *
     * Si los litros libres son m�s que 0 pero el contenido del cubo que vierte es mayor que lo que le cabe al de destino
     * se le resta a este contenido "this.contenido" los litros que le vertemos al de destino. Por �ltimo llenamos por
     * completo el cubo de destino.
     *
     * @param destino que es el cubo al que vamos a verter el contenido de nuestro cubo
     */
    public void vuelcaEn(Cubo destino) {
        double litrosLibres = (destino.getCapacidad() - destino.getContenido());

        if (litrosLibres > 0) {
            if (this.contenido <= litrosLibres) {
                destino.setContenido(destino.getContenido() + this.contenido);
                this.vacia();
            } else {
                this.contenido-=litrosLibres;
                destino.llena();
            }
        }
    }
}
