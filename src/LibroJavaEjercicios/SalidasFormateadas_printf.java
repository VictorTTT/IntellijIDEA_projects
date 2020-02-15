package LibroJavaEjercicios;

/*Java dispone de la instrucci�n System.out.printf() an�loga al printf() del lenguaje C.
Permite formatear la salida que se pretende mostrar por pantalla.
El ejemplo que se muestra a continuaci�n:*/

public class SalidasFormateadas_printf
{
    public static void main(String[] args)
    {
        System.out.printf("El n�mero %d no tiene decimales.\n", 21);
        /*Observa que a la instrucci�n System.out.printf() se le pasan dos elementos; por un lado,
        una plantilla entrecomillada - "El n�mero %d no tiene decimales.\n" - y por otro lado el/los
        dato/s separado/s por coma. En este caso �nicamente se pasa un dato - el n�mero
        21 - pero podr�an ser varios n�meros o incluso n�meros y palabras. Lo que sucede en
        esta l�nea es que el dato - el n�mero 21 - se inserta dentro de la plantilla, justo en la
        casilla %d. Debe haber tantas casillas con el s�mbolo % como datos separados por coma.
        Los datos se insertan siempre por orden en las casillas que le corresponden. En una
        casilla %d solo se aceptan n�meros enteros (sin decimales).*/
        
        System.out.printf("El n�mero %f si que sale con decimales,\n", 21.0);
        //La casilla %f se debe rellenar con un n�mero que contiene decimales. Si se escribe
        //%f tal cual, se mostrar�n varios decimales, aunque no sabemos en principio cu�ntos.
      
       
        
        System.out.printf("El n�mero %.3f sale ex�ctamne con 3 decimales.\n", 21.0);
        //Mediante %.3f se especifica que se deben mostrar exactamente 3 decimales.
        //La casilla %s dentro de una plantilla que se le pasa a un System.out.printf() se debe
        //rellenar con una cadena de caracteres, es decir, con una secuencia de letras, espacios
        //y signos de puntuaci�n.
        //Veamos un ejemplo en el que se mezcla la salida formateada de cadenas de
        //caracteres, n�meros enteros y n�meros con decimales.
    }
}
