package LibroJava.POO.Ejercicios;

/*Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase Tiempo
son intervalos de tiempo y se crean de la forma Tiempo t = new Tiempo(1, 20, 30)
donde los parámetros que se le pasan al constructor son las horas, los minutos
y los segundos respectivamente. Crea el método toString para ver los intervalos
de tiempo de la forma 10h 35m 5s. Si se suman por ejemplo 30m 40s y 35m 20s el
resultado debería ser 1h 6m 0s. Realiza un programa de prueba para comprobar
que la clase funciona bien.*/

public class Tiempo {

    // Atributos

    private int horas;
    private int minutos;
    private int segundos;

    // Constructor

    public Tiempo(int horas, int minutos, int segundos) {

        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;

    }

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public Tiempo sumaTiempo(Tiempo t){

        if (this.getSegundos()+t.getSegundos()>=60){

        }
        if (this.getMinutos()+t.getMinutos()>=60) this.horas++;


        return new Tiempo(this.horas+t.getHoras(),
                this.minutos+t.getMinutos(),this.segundos+t.getSegundos());
    }

    //

    @Override
    public String toString() {
        return this.horas+"h "+this.minutos+"m "+this.segundos+"s ";
    }
}
