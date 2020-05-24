package VictorTTT_Metodos;


import java.util.Enumeration;

/**
 * The type Matematicas.
 */
public class Matematicas {
    /*Devuelve verdadero si el numero que se le pasa es capic�a y falso en caso contrario*/


    //Comprueba si un n�mero entero positivo es primo o no.
    //* Un n�mero es primo cuando �nicamente es divisible entre
    //* �l mismo y la unidad
    public static boolean esPrimo(int x) {
        for (int i = 2; i < x; i++)//empieza a dividir el n�mero por 2, y va subiendo dividiendo  hasta llegar al n�mero -1
        {
            if ((x % i) == 0)//si el resto de alguna divisi�n es 0
            {
                return false;//es que no es primo
            }
        }
        return true;//si completa el bucle no puede dividir con resto 0 es que es primo
    }


    /**
     * Devuelve el siguiente n�mero primo  mayor al n�mero que
     * se pasa como par�metro.
     *
     * @param x the x
     * @return the int
     */
    //
    public static int siguientePrimo(int x) {
        while (!esPrimo(++x)) {
            // Partimos de la base de que el n�mero que se le pasa no es primo
            // LLamamos negando al m�todo que calcula si es n�mero primo sum�ndole una unidad
            // Dentro del m�todo no hay operaciones por lo que el n�mero obtenido volver�
            // a evaluarse sucesivamente hasta que se convierta en primo, en ese caso no se cumple la condici�n
            // y sale del bucle devolviendo el valor
        }

        return x;
    }


    /**
     * Le da la vuelta a un n�mero.
     *
     * @param x recibe el n�mero que queremos voltear
     * @return devuelve el n�mero volteado
     * @author VictorTTT
     */
    //.
    public static int voltea(int x) {
        if (x < 0) {  //Si el n�mero es menor que 0
            return -voltea(-x); //Devuelve el n�mero en negativo
        }
        int volteado = 0;

        while (x > 0) {
            volteado = (volteado * 10) + (x % 10);
            x = x / 10;
        }

        return volteado;

    }

    /**
     * Dada una base y un exponente devuelve la potencia.
     *
     * @param base: es el n�mero que se va a multiplicar por si mismo.
     * @param exponente: es el n�mero de veces que se va a multiplicar la base.
     * @return devuelve el resultado de la operaci�n
     * @author V�ctorTTT
     */
    public static double potencia(double base, double exponente) {

        if (exponente <= 0) return 1;//Caso base que actua como parada de la recursividad

        return base * potencia(base, exponente - 1);
        //Llamada a la funci�n dentro de s� misma multiplicando la base por ella misma y decrementando exponenete en cada nueva llamada

    }

    /**
     * Cuenta el n�mero de d�gitos de un n�mero entero.
     *
     * @param x n�mero al que se le quieren contar los d�gitos
     * @return n�mero de d�gitos que tiene el n�mero que se pasa como par�metro
     */
    public static int digitos (long x){ // recibe un long pero devolver� un entero

        if (x<0){ // Si x es menor que 0...
            x=-x; // Si el n�mero que recibimos es negativo lo pasamos a positivo
        }

        if(x==0){ // Cuando  valga 0{
            return 1; // no se hace ninguna opeeaci�n, simplemente se devuelve que tiene un d�gito
        }else{
            int numeroDigitos =0; // declaramos variable local
            while (x>0){ // mientras el n�mer sea mayor que 0...
                x=x/10; // Cogemos el n�mero y lo dividimos por 10 con lo que conseguimos quitarle un d�gito
                //(la divisi�n de la unidad seguida de 0 "corre la coma" tantas veces como ceros tenga la divisi�n
                //como el tipo de dato int no expresa decimales, estos se pierden.
                numeroDigitos++;
            }
            return numeroDigitos;
        }

    }

    //P�gina 147 del libro aprende Java con ejercicios, se puede continuar realizando esta biblioteca de m�todos personalizada
    //aunque por el momento, considero mejor opci�n continuar con el aprendizaje de otros aspectos del lenguaje teniendo en cuenta
    // que la mayor�a de problemas  que se pretenden solucionar aqu� ya est�n solucionados trav�s de las clases
    //implementadas de la API de Java, con el consiguiente ahorro de tiempo que esto supone...






}
