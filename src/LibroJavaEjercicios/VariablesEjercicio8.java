package LibroJavaEjercicios;

//Escribe un programa que declare 5 variables de tipo char. A continuaci�n, crea
//otra variable como cadena de caracteres y as�gnale como valor la concatenaci�n
//de las anteriores 5 variables. Por �ltimo, muestra la cadena de caracteres
//por pantalla �Qu� problemas te encuentras? �c�mo lo has solucionado?

public class VariablesEjercicio8
{
    public static void main(String[] args)
    {
        char e='e';

        char n='n';

        char z='z';

        char o='o';

        char t='t';

        String enzot=""+e+n+z+o+t;/*nos damos cuenta que al sumar los caracteres solos java los trata como tipos int,
        para solucionarlo debemos poner la cadena vac�a al principio de la suma de characteres*/

        System.out.println(enzot);
    }
}
