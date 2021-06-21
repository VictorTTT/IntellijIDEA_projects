package LibroJava.POO.Ejercicios;

/*La empresa El Corte Islandés nos ha encargado una aplicación para gestionar
las tarjetas regalo. Como primer paso para implementar la aplicación, es
necesario crear la clase principal. Implementa la clase TarjetaRegalo. Cuando
se crea una nueva tarjeta, se le da un saldo y se asigna de forma automática
un número de 5 dígitos. Si se intenta gastar más dinero del que tiene la tarjeta,
se debe mostrar un mensaje de error. Dos tarjetas regalo se pueden fusionar
creando una nueva tarjeta con la suma del saldo que tenga cada una y un nuevo
número aleatorio de 5 cifras. Al fusionar dos tarjetas en una, las dos tarjetas
originales se quedarían con 0 € de saldo.*/

import java.text.DecimalFormat;
import java.util.Random;

public class TarjetaRegalo {

    //Atributos

    private double saldo;
    private int numero;


    //Constructor

    public TarjetaRegalo(double saldo) {

        this.saldo = saldo;
        this.numero = (int) (Math.random() * 100000);
        /*Forma de crear un número aleatorio en Java, recordamos que es un método estático y que por lo tanto no es
        necesario instanciar la clase Math para utilizarlo. También señalar que lo que devuelve es un double entre 0 y 1
        por lo que si queremos un entero debemos hacer un casting y si lo que queremos es un número de 5 cifras
        hay que multiplicar por la unidad seguida de tantos ceros como cifras deseemos*/


    }

    //Getters y Setters

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //Metodos programa

    public void gasta(double compra) {

        if (compra > this.saldo) {
            System.out.printf("No tienes suficiente dinero para hacer esta compra de %.2f€!\n",compra);
            /*Imprimir con formato sin utilizar la clase DecimalFormat*/
        } else {
            this.saldo -= compra;
        }

    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo otraTarjetaRegalo) {

        TarjetaRegalo fusionada = new TarjetaRegalo(this.saldo + otraTarjetaRegalo.getSaldo());
        this.setSaldo(0);
        otraTarjetaRegalo.setSaldo(0);
        return fusionada;

    }

    //toString


    @Override
    public String toString() {

        DecimalFormat dosDecimales = new DecimalFormat("0.00");
        /*Para limitar la presentación del resultado a solo 2 decimales, creamos un objeto de la clase decimal format
        * con el patrón de decimales que deseamos mostrar*/
        return "Tarjeta nº "+numero+" - Saldo "+dosDecimales.format(saldo)+"€";
        /*A la hora de imprimir el toString, añdimos el método format con el saldo dentro*/

    }
}
