package LibroJava.POO.Ejercicios;

/*Crea la clase Fracción. Los atributos serán numerador y denominador. Y algunos de los
métodos pueden ser invierte, simplifica, multiplica, divide, etc.*/

public class Fraccion {

    //Atibutos

    private int signo;
    private int numerador;
    private int denominador;

    // Constructores


    public Fraccion() {

    }

    public Fraccion(int numerador, int denominador) {
        if (denominador == 0) {
            System.out.println("Una fracción no puede tener como denominador el número 0");
        } else {
            if (numerador * denominador < 0) { // comprobando está multiplicación sabremos si la fracción es positiva ó negativa
                this.signo = -1;
            } else this.signo = 1;

            this.numerador = Math.abs(numerador); // En toddo caso transformaremos el numerador a su valor positivo (absoluto)
            this.denominador = Math.abs(denominador); // En toddo caso transformaremos el denominador a su valor positivo (absoluto)
        }

    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    @Override
    public String toString() {
        if (signo == -1) {  // Incluimos un condicional en el método ToString mediante que obtendremos la impresión del resultado en positivo ó negativo
            return "-" + this.numerador + "/" + this.denominador; // De esta forma se consigue separar el signo de los números participantes de las operaciones a realizar
        } else {
            return this.numerador + "/" + this.denominador;
        }
    }

    /*public double invierte() {
        /*Este método devuelve una fracción invertida, lo que antes era numerador ahora es denominador y viceversa*/

       // return new Fraccion(this.signo*this.denominador,this.numerador);
    }





