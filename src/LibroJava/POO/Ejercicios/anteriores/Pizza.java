package LibroJava.POO.Ejercicios;

/*Crea la clase Pizza con los atributos y m�todos necesarios. Sobre cada pizza
se necesita saber el tama�o - mediana o familiar - el tipo - margarita, cuatro
quesos o funghi - y su estado - pedida o servida. La clase debe almacenar
informaci�n sobre el n�mero total de pizzas que se han pedido y que se
han servido. Siempre que se crea una pizza nueva, su estado es �pedida�. El
siguiente c�digo del programa principal debe dar la salida que se muestra:*/

public class Pizza {

    //Atributos

    private String tamano;
    private String tipo;

    public enum Estado {pedida, servida}
    private Estado estado;

    private static int TotalPedidas = 0;
    private static int TotalServidas = 0;

    //Constructor

    public Pizza(String tipo, String tamano) {

        TotalPedidas += 1;
        this.estado = Estado.pedida;
        this.tipo = tipo;
        this.tamano = tamano;
    }

    //M�todos Getters

    public static int getTotalPedidas() {
        return TotalPedidas;
    }

    public static int getTotalServidas() {
        return TotalServidas;
    }

    //M�todos programa

    public void sirve() {

        if (this.estado.equals(Estado.servida)) {
            System.out.println("esa pizza ya se ha servido");
        } else {
            TotalServidas += 1;
            this.estado = Estado.servida;
        }
    }

    //To String

    public String toString(){
        return "pizza "+ this.tipo+" "+this.tamano+", "+this.estado;
    }


}
