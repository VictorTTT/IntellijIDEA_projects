package LibroJava.POO.Ejercicios;

import java.text.DecimalFormat;// Importamos paquete necesario para esta clase

public class Movil extends Terminal { //heredamos de superclase

    //Atributos propios como subclase

    private final String tarifa;
    private double segundosTarificados;

    //Constructor

    public Movil(String numero, String tarifa) {
        super(numero); //a su vez llama al constructor de la clase padre
        this.tarifa = tarifa; //establece la tarifa de la instancia que construye


    }

    // Ahora sobreescribimos el método llamar de la clase padre añadiéndole nuevas funcionalidades

    @Override
    public void llamar(Terminal t, int segundos) {
        super.llamar(t, segundos);

        if (this.tarifa.equals("rata")) {
            this.segundosTarificados = (((double) this.getSegundos() / 60) * 6) / 100;

        }

        if (this.tarifa.equals("mono")) {
            this.segundosTarificados = (((double) this.getSegundos() / 60) * 12) / 100;
        }
        if (this.tarifa.equals("bisonte")) {
            this.segundosTarificados = (((double) this.getSegundos() / 60) * 30) / 100;
        }

        // los segundos de la llamada (que paga el que llama) pasados a minutos por el precio por minuto,
        // obtendremos el precio en céntimos y después lo pasaremos a €
    }

    @Override
    public String toString() {  //////ARREGLAR FALLO, paga el que recibe la llamada 20/07/2020

        DecimalFormat dosDecimales = new DecimalFormat("0.00");

        return super.toString() +
                " tarificados " +  segundosTarificados + " euros ";
    }
}
