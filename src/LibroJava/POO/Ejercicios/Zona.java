package LibroJava.POO.Ejercicios;

/*Queremos gestionar la venta de entradas (no numeradas) de Expocoches
Campanillas que tiene 3 zonas, la sala principal con 1000 entradas disponibles,
la zona de compra-venta con 200 entradas disponibles y la zona vip
con 25 entradas disponibles. Hay que controlar que existen entradas antes de
venderlas.
La clase Zona con sus atributos y m�todos se muestra a continuaci�n:*/

public class Zona {


    //Atributos

    private int entradasPorVender;/*declaramos una �nica variable com�n para todas las entradas
    sin importar la zona a la que van a haccer referencia*/


    //Constructor

    public Zona(int n) { /*El constructor de cada zona recibe  el n�mero de entradas que le quedan */
        entradasPorVender = n;
    }

    //Getter

    public int getEntradasPorVender() { /*este getter devuelve el numero de entradas que le queda a cada zona*/
        return entradasPorVender;
    }

    //M�todos de programa

    public void vender(int n) {
        if (this.entradasPorVender == 0) {//si a esta zona no le queda ninguna entrada por vender...
            System.out.println("Lo siento, las entradas para esa zona est�n agotadas.");
        } else if (this.entradasPorVender < n) {// si no, si las entradas que quedan son inferiores al pedido realizado...
            System.out.println("S�lo me quedan " + this.entradasPorVender
                    + " entradas para esa zona.");
        }
        if (this.entradasPorVender >= n) {//En caso que la venta pueda realizarse...
            entradasPorVender -= n;//Restamos el pedido de las que tenemos y guardamos datos en la variable
            System.out.println("Aqu� tiene sus " + n + " entradas, gracias.");
        }
    }
}
