package LibroJavaEjercicios;

/*Java dispone de la instrucción System.out.printf() análoga al printf() del lenguaje C.
Permite formatear la salida que se pretende mostrar por pantalla.
El ejemplo que se muestra a continuación:*/

public class SalidasFormateadas_printf
{
    public static void main(String[] args)
    {
        System.out.printf("El número %d no tiene decimales.\n", 21);
        /*Observa que a la instrucción System.out.printf() se le pasan dos elementos; por un lado,
        una plantilla entrecomillada - "El número %d no tiene decimales.\n" - y por otro lado el/los
        dato/s separado/s por coma. En este caso únicamente se pasa un dato - el número
        21 - pero podrían ser varios números o incluso números y palabras. Lo que sucede en
        esta línea es que el dato - el número 21 - se inserta dentro de la plantilla, justo en la
        casilla %d. Debe haber tantas casillas con el símbolo % como datos separados por coma.
        Los datos se insertan siempre por orden en las casillas que le corresponden. En una
        casilla %d solo se aceptan números enteros (sin decimales).*/
        
        System.out.printf("El número %f si que sale con decimales,\n", 21.0);
        //La casilla %f se debe rellenar con un número que contiene decimales. Si se escribe
        //%f tal cual, se mostrarán varios decimales, aunque no sabemos en principio cuántos.
      
       
        
        System.out.printf("El número %.3f sale exáctamne con 3 decimales.\n", 21.0);
        //Mediante %.3f se especifica que se deben mostrar exactamente 3 decimales.
        //La casilla %s dentro de una plantilla que se le pasa a un System.out.printf() se debe
        //rellenar con una cadena de caracteres, es decir, con una secuencia de letras, espacios
        //y signos de puntuación.
        //Veamos un ejemplo en el que se mezcla la salida formateada de cadenas de
        //caracteres, números enteros y números con decimales.
    }
}
