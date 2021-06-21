package LibroJava.POO;

/**
 * The type Cubo.
 */
public class Cubo {

    // atributos

    double capacidad; // esta será la capacidad máxima que podrá almacenar
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

    //Comportamientos adicionales (Métodos que diseña el programador)

    public void vacia() {  // lo deja seco
        this.contenido = 0;
    }

    public void llena() { // llena el cubo al máximo de su capacidad
        this.contenido = this.capacidad;
    }

    /*Pinta el cubo en la pantalla.
     Se muestran los bordes del cubo con el carácter # y el
     agua que contiene con el carácter ~.*/

    /**
     * Voy a ver si me aclaro a explicar lo que hace este método: En el for declara una variable iterativa (nivel)
     * y la iguala a la capacidad que se le ha pasado por parámeto en la declaación del objeto; Hasta que el nivel llegue  0
     * decementa la variable en 1.
     *
     *
     *     En cada vuelta de bucle evalúa si el contenido es mayor ó igual a la capacidd máxima y si es así lo pinta como
     *     que tiene agua en ese nivel pasando a evaluar de nuevo la condición del for.
     *
     *     Si no es así, lo pinta como que no tiene agua en ese nivel, y pasa a evaluar de nuevo el for.
     *
     *     En tdos los casos, el cubo tendrá una base de símbolos completa.
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
     * Antes de echar el agua se comprueba cuánto le cabe al
     * cubo destino.*/

    /**
     * En este método, se declara una variable local que tiene como valor la diferencia entre la capacidad total que
     * tiene el cubo de destino y el contenido que tiene actualmente, obteniendo así lo que se le puede añadir.
     *
     * Si los litros libres son más que 0, entonces, si el contenido del cubo que vierte es menor o igual que los litros
     * libres que tiene el cubo de destino. Se establece el contenido del cubo de destino con la suma de lo que tiene
     * este cubo "this.contenido" y lo que ya tenía él "destino.getContenido()".
     * Por último antes de acabar el if llamamos al método vacia y lo aplicamos en este cubo, dejándolo seco
     *
     * Si los litros libres son más que 0 pero el contenido del cubo que vierte es mayor que lo que le cabe al de destino
     * se le resta a este contenido "this.contenido" los litros que le vertemos al de destino. Por último llenamos por
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
