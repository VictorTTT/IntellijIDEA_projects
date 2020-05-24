package LibroJava.POO;

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

    public void vuelcaEn(Cubo destino) {
        double litrosLibres = (destino.getCapacidad() - destino.getContenido());

        if (litrosLibres > 0) {
            if (this.contenido >= litrosLibres) {
                destino.setContenido(destino.getContenido() + this.contenido);
                this.vacia();
            } else {
                this.contenido-=litrosLibres;
                destino.llena();
            }
        }
    }
}//
