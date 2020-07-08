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

    public Fraccion invierte() {
        //Este método devuelve una fracción invertida, lo que antes era numerador ahora es denominador y viceversa*/

        return new Fraccion(this.signo * this.denominador, this.numerador);
        /*Aquí lo único que está pasando es que se devuelve el constructor de esta misma clase y en los argumentos que nos  pide invertimos su orden
         * es decir, donde nos pide el numerador ponemos el denominador y donde nos pide el denominador ponemos el numerador*/
    }

    public Fraccion multiplica(int n) { // método sobrecargado
        /*Este método devuelve una fracción multiplicada por un determindao número que se recibe por parámetro (n)
         * Cunado una fracción se multiplica por un número (n), el resultado es otra fracción con el mismo denominador que la original
         * es decir, únicamente tenemeos que multiplicar por n el numerador*/

        return new Fraccion(n * this.numerador * this.signo, this.denominador);
    }

    public Fraccion multiplica(Fraccion fraccion) {  //método sobrecargado
        /*Este método devuelve el resultado de multiplicar una fracción por otra fracción,
        es por esto que lo que se recibe por parámetro es otra fracción completa. Cuando se multiplican dos fracciones se tiene que multiplicar
        numerador por numerador y denominador por denominador*/

        return new Fraccion(this.signo * this.numerador * fraccion.getNumerador(), this.denominador * fraccion.getDenominador());
        //Me doy cuenta de que para conseguir numerador y denominador de la fracción que recibo por parámetro,
        // puedo hacerlo mediante los  métodos que he creado en esta clase para hacerlo poniendo el nombre del parámetro
        // y luego el operador punto ya me aparecen las opciones.
    }

    public Fraccion divide(int n){
        /*Este método devuelve el resultado de dividir una fracción un determinado número (n),
        * es por esto que se recibe por parámetro un número n. Cuando se divide una fracción por un número (n)
        * se tiene que dejar igual el numerador y se tiene que multiplicar el denominador por el número (n)
        */

        return  new Fraccion( this.signo*this.numerador,n*this.denominador);

    }

    public Fraccion divide(Fraccion fraccion){
        /*Este método deuvuelve el resultado de dividir dos fracciones,
        * para dividir dos fraccoiones se tienen que cruzar las multiplicaciones. Es decir,
        * tenemos que multiplicar el numerador de la primera con el denominador de la segunda
        * y el denominador de la primera con el numerador de la segunda*/

        return new Fraccion(this.signo*this.numerador*fraccion.getDenominador(),this.denominador*fraccion.getNumerador());

    }

    public Fraccion simplifica(){
        /*Este método, cuando es llamado reduce al máximo la fracción que estamos creando.
        * Esto se consigue cuando en una fracción se pueden dividir tanto el numerador como el deniminador por el mismo número con un resto = 0.
        * Se repite el proceso hasta que la fracción que se final que se obtiene es irreducible */

        //int s=this.signo;
        //int d=this.denominador;
        //int n=this.numerador;

        for (int i = 2;i< Math.min(this.numerador,this.denominador)  ; i++) {
            /*Este for incrementa el iterador desde 2 y practicará divisiones en cada vuelta de bucle tanto a numerador como a denominador
            * La salida del bucle, como se puede ver, es una especie de .length para dos números aportados el primeo que llegue al tope para el bucle*/

            while (((numerador%i))==0&&((denominador%i==0))){/*Mientras el numerador y el denominador sean divisubles por el iterador (ambos) */

                numerador/=i; //numerador es igual a la division del propio numerador por el iterador
                denominador/=i; //denomiador es igual a la división del propio denominador por el iterador

            } /*sobra decir que cuando alguno de los dos no sea divisible no entrará en el while, creando la fracción con los números que en ese momento tenga*/


        }
        return new Fraccion(signo*numerador,denominador);
    }


}






