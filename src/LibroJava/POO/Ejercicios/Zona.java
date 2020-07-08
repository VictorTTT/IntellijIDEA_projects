package LibroJava.POO.Ejercicios;

/*Queremos gestionar la venta de entradas (no numeradas) de Expocoches
Campanillas que tiene 3 zonas, la sala principal con 1000 entradas disponibles,
la zona de compra-venta con 200 entradas disponibles y la zona vip
con 25 entradas disponibles. Hay que controlar que existen entradas antes de
venderlas.
La clase Zona con sus atributos y m�todos se muestra a continuaci�n:*/

public class Zona {


    //Atributos

    private int entradasPorVender;

    //Constructor

    public Zona(int n) {
        entradasPorVender = n;
    }

    //Getter

    public int getEntradasPorVender() {
        return entradasPorVender;
    }

    //M�todos de programa

    public void vender(int n) {
        if (this.entradasPorVender == 0) {
            System.out.println("Lo siento, las entradas para esa zona est�n agotadas.");
        } else if (this.entradasPorVender < n) {
            System.out.println("S�lo me quedan " + this.entradasPorVender
                    + " entradas para esa zona.");
        }
        if (this.entradasPorVender >= n) {
            entradasPorVender -= n;
            System.out.println("Aqu� tiene sus " + n + " entradas, gracias.");
        }
    }
}
