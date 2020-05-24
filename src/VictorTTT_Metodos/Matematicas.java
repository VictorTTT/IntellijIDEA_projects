package VictorTTT_Metodos;


import java.util.Enumeration;

/**
 * The type Matematicas.
 */
public class Matematicas {
    /*Devuelve verdadero si el numero que se le pasa es capicúa y falso en caso contrario*/


    //Comprueba si un número entero positivo es primo o no.
    //* Un número es primo cuando únicamente es divisible entre
    //* él mismo y la unidad
    public static boolean esPrimo(int x) {
        for (int i = 2; i < x; i++)//empieza a dividir el número por 2, y va subiendo dividiendo  hasta llegar al número -1
        {
            if ((x % i) == 0)//si el resto de alguna división es 0
            {
                return false;//es que no es primo
            }
        }
        return true;//si completa el bucle no puede dividir con resto 0 es que es primo
    }


    /**
     * Devuelve el siguiente número primo  mayor al número que
     * se pasa como parámetro.
     *
     * @param x the x
     * @return the int
     */
    //
    public static int siguientePrimo(int x) {
        while (!esPrimo(++x)) {
            // Partimos de la base de que el número que se le pasa no es primo
            // LLamamos negando al método que calcula si es número primo sumándole una unidad
            // Dentro del método no hay operaciones por lo que el número obtenido volverá
            // a evaluarse sucesivamente hasta que se convierta en primo, en ese caso no se cumple la condición
            // y sale del bucle devolviendo el valor
        }

        return x;
    }


    /**
     * Le da la vuelta a un número.
     *
     * @param x recibe el número que queremos voltear
     * @return devuelve el número volteado
     * @author VictorTTT
     */
    //.
    public static int voltea(int x) {
        if (x < 0) {  //Si el número es menor que 0
            return -voltea(-x); //Devuelve el número en negativo
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
     * @param base: es el número que se va a multiplicar por si mismo.
     * @param exponente: es el número de veces que se va a multiplicar la base.
     * @return devuelve el resultado de la operación
     * @author VíctorTTT
     */
    public static double potencia(double base, double exponente) {

        if (exponente <= 0) return 1;//Caso base que actua como parada de la recursividad

        return base * potencia(base, exponente - 1);
        //Llamada a la función dentro de sí misma multiplicando la base por ella misma y decrementando exponenete en cada nueva llamada

    }

    /**
     * Cuenta el número de dígitos de un número entero.
     *
     * @param x número al que se le quieren contar los dígitos
     * @return número de dígitos que tiene el número que se pasa como parámetro
     */
    public static int digitos (long x){ // recibe un long pero devolverá un entero

        if (x<0){ // Si x es menor que 0...
            x=-x; // Si el número que recibimos es negativo lo pasamos a positivo
        }

        if(x==0){ // Cuando  valga 0{
            return 1; // no se hace ninguna opeeación, simplemente se devuelve que tiene un dígito
        }else{
            int numeroDigitos =0; // declaramos variable local
            while (x>0){ // mientras el númer sea mayor que 0...
                x=x/10; // Cogemos el número y lo dividimos por 10 con lo que conseguimos quitarle un dígito
                //(la división de la unidad seguida de 0 "corre la coma" tantas veces como ceros tenga la división
                //como el tipo de dato int no expresa decimales, estos se pierden.
                numeroDigitos++;
            }
            return numeroDigitos;
        }

    }

    //Página 147 del libro aprende Java con ejercicios, se puede continuar realizando esta biblioteca de métodos personalizada
    //aunque por el momento, considero mejor opción continuar con el aprendizaje de otros aspectos del lenguaje teniendo en cuenta
    // que la mayoría de problemas  que se pretenden solucionar aquí ya están solucionados través de las clases
    //implementadas de la API de Java, con el consiguiente ahorro de tiempo que esto supone...






}
