package LibroJavaEjercicios;

//Escribe un programa que declare 5 variables de tipo char. A continuación, crea
//otra variable como cadena de caracteres y asígnale como valor la concatenación
//de las anteriores 5 variables. Por último, muestra la cadena de caracteres
//por pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado?

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
        para solucionarlo debemos poner la cadena vacía al principio de la suma de characteres*/

        System.out.println(enzot);
    }
}
