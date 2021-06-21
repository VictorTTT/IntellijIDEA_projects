package LibroJava.POO.Ejercicios;

/*Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase Tiempo
son intervalos de tiempo y se crean de la forma Tiempo t = new Tiempo(1, 20, 30)
donde los parámetros que se le pasan al constructor son las horas, los minutos
y los segundos respectivamente. Crea el método toString para ver los intervalos
de tiempo de la forma 10h 35m 5s. Si se suman por ejemplo 30m 40s y 35m 20s el
resultado debería ser 1h 6m 0s. Realiza un programa de prueba para comprobar
que la clase funciona bien.*/

public class Tiempo {

    //Para crear objetos de la clase Tiempo, lo podemos hacer de dos maneras diferentes. Por un lado, podemos crear un constructor dónde
    //se reiben horas, minutos y segundos y por otro lado otro constructor que solamente recibe segundos. A nivel operativo todos los cálculos
    //se van a hacer sobre los segundos, es por esto que solo declararaemos este dato como atributo.

    // Atributos
    private int segundos;

    // Constructor

    public Tiempo(int horas, int minutos, int segundos) {
        //Dentro del constructor, calculamos los segundos que contienen las horas,
        //los segundos que contienen los minutos y una vez lo tenemos toddo en segundos lo sumamos
        //El resultado que obtenemos es el tiempo en segundos.
        this.segundos = (horas * 3600) + (minutos * 60) + segundos;

    }

    public Tiempo(int segundos) {
        this.segundos = segundos;
    }


    public int getSegundos() {
        return segundos;
    }

    public Tiempo sumaTiempo(Tiempo t) {
        return new Tiempo(this.segundos+t.getSegundos());
    }

    public Tiempo restaTiempo(Tiempo t){
        return new Tiempo(this.segundos-t.getSegundos());
    }

    //

    @Override
    public String toString() {
        /*Para poder representar el tiempo en el formato que se pide, como estamos trabajndo sobrelos segundos, lo que hay que hacer es dentro del propio toString
         * pasar esos segundos a miutos y horas para posteriormente imprimirlo: */

        //Dentro del toString se declaran variables locales para trabajar con cada unidad de tiempo

        int segundos = this.segundos;// El valor de los segundos ya lo sabemos
        int horas = segundos / 3600;// Una hora es el resultado de dividir los segundos por 3600
        segundos -= horas * 3600;
        int minutos = segundos / 60;// Un minuto es el resultado de dividir los segundos por 60
        segundos -= minutos * 60;


        if (this.segundos < 0) {
            return "-(" + (-horas) + "h " + (-minutos) + "m " + (-segundos) + "s)";
        } else return horas + "h " + minutos + "m " + segundos + "s ";


    }
}
