package LibroJava.Programacion_estructurada;

//En el siguiente programa puedes ver el uso de operadores l�gicos combinado con
//operadores relacionales (operadores de comparaci�n). Intenta adivinar cu�l ser� el
//resultado mirando el c�digo.

public class SentenciaIF_3
{
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));
        System.out.println("!a = " + !a);
        System.out.println("a || (6 > 10) = " + (a || (6 > 10)));
        System.out.println("((4 <= 4) || false) && (!a) = " + (((4 <= 4) || false) && (!a)));
    }
}
