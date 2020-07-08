package LibroJava.POO.Ejercicios;

/*Crea la clase Fracci�n. Los atributos ser�n numerador y denominador. Y algunos de los
m�todos pueden ser invierte, simplifica, multiplica, divide, etc.*/

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
            System.out.println("Una fracci�n no puede tener como denominador el n�mero 0");
        } else {
            if (numerador * denominador < 0) { // comprobando est� multiplicaci�n sabremos si la fracci�n es positiva � negativa
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
        if (signo == -1) {  // Incluimos un condicional en el m�todo ToString mediante que obtendremos la impresi�n del resultado en positivo � negativo
            return "-" + this.numerador + "/" + this.denominador; // De esta forma se consigue separar el signo de los n�meros participantes de las operaciones a realizar
        } else {
            return this.numerador + "/" + this.denominador;
        }
    }

    public Fraccion invierte() {
        //Este m�todo devuelve una fracci�n invertida, lo que antes era numerador ahora es denominador y viceversa*/

        return new Fraccion(this.signo * this.denominador, this.numerador);
        /*Aqu� lo �nico que est� pasando es que se devuelve el constructor de esta misma clase y en los argumentos que nos  pide invertimos su orden
         * es decir, donde nos pide el numerador ponemos el denominador y donde nos pide el denominador ponemos el numerador*/
    }

    public Fraccion multiplica(int n) { // m�todo sobrecargado
        /*Este m�todo devuelve una fracci�n multiplicada por un determindao n�mero que se recibe por par�metro (n)
         * Cunado una fracci�n se multiplica por un n�mero (n), el resultado es otra fracci�n con el mismo denominador que la original
         * es decir, �nicamente tenemeos que multiplicar por n el numerador*/

        return new Fraccion(n * this.numerador * this.signo, this.denominador);
    }

    public Fraccion multiplica(Fraccion fraccion) {  //m�todo sobrecargado
        /*Este m�todo devuelve el resultado de multiplicar una fracci�n por otra fracci�n,
        es por esto que lo que se recibe por par�metro es otra fracci�n completa. Cuando se multiplican dos fracciones se tiene que multiplicar
        numerador por numerador y denominador por denominador*/

        return new Fraccion(this.signo * this.numerador * fraccion.getNumerador(), this.denominador * fraccion.getDenominador());
        //Me doy cuenta de que para conseguir numerador y denominador de la fracci�n que recibo por par�metro,
        // puedo hacerlo mediante los  m�todos que he creado en esta clase para hacerlo poniendo el nombre del par�metro
        // y luego el operador punto ya me aparecen las opciones.
    }

    public Fraccion divide(int n){
        /*Este m�todo devuelve el resultado de dividir una fracci�n un determinado n�mero (n),
        * es por esto que se recibe por par�metro un n�mero n. Cuando se divide una fracci�n por un n�mero (n)
        * se tiene que dejar igual el numerador y se tiene que multiplicar el denominador por el n�mero (n)
        */

        return  new Fraccion( this.signo*this.numerador,n*this.denominador);

    }

    public Fraccion divide(Fraccion fraccion){
        /*Este m�todo deuvuelve el resultado de dividir dos fracciones,
        * para dividir dos fraccoiones se tienen que cruzar las multiplicaciones. Es decir,
        * tenemos que multiplicar el numerador de la primera con el denominador de la segunda
        * y el denominador de la primera con el numerador de la segunda*/

        return new Fraccion(this.signo*this.numerador*fraccion.getDenominador(),this.denominador*fraccion.getNumerador());

    }

    public Fraccion simplifica(){
        /*Este m�todo, cuando es llamado reduce al m�ximo la fracci�n que estamos creando.
        * Esto se consigue cuando en una fracci�n se pueden dividir tanto el numerador como el deniminador por el mismo n�mero con un resto = 0.
        * Se repite el proceso hasta que la fracci�n que se final que se obtiene es irreducible */

        //int s=this.signo;
        //int d=this.denominador;
        //int n=this.numerador;

        for (int i = 2;i< Math.min(this.numerador,this.denominador)  ; i++) {
            /*Este for incrementa el iterador desde 2 y practicar� divisiones en cada vuelta de bucle tanto a numerador como a denominador
            * La salida del bucle, como se puede ver, es una especie de .length para dos n�meros aportados el primeo que llegue al tope para el bucle*/

            while (((numerador%i))==0&&((denominador%i==0))){/*Mientras el numerador y el denominador sean divisubles por el iterador (ambos) */

                numerador/=i; //numerador es igual a la division del propio numerador por el iterador
                denominador/=i; //denomiador es igual a la divisi�n del propio denominador por el iterador

            } /*sobra decir que cuando alguno de los dos no sea divisible no entrar� en el while, creando la fracci�n con los n�meros que en ese momento tenga*/


        }
        return new Fraccion(signo*numerador,denominador);
    }


}






